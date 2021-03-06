package com.jinpaihushi.parse;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinpaihushi.mapper.AccessLogMapper;
import com.jinpaihushi.mapper.GoodsUrlMapper;
import com.jinpaihushi.model.AccessLog;
import com.jinpaihushi.model.AccessLogSpread;
import com.jinpaihushi.model.GoodsUrl;
import com.jinpaihushi.model.GoodsUrlExample;
import com.jinpaihushi.model.GoodsUrlExample.Criteria;
import com.jinpaihushi.util.CommonUtil;
import com.jinpaihushi.util.MyPredicate;
import com.jinpaihushi.util.UUIDUtils;

@Service(value = "parseYykLog")
public class ParseYykLog {
    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private GoodsUrlMapper goodsUrlMapper;

    @Autowired
    private AccessLogMapper accesslogMapper;

    @Autowired
    private GoodsUrlService goodsUrlService;

    @Value("${yykPath}")
    private String yykPath;

    private static String baseUrlPrefix = "/ComeIn?m=setOneProductNew&";

    private static SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");

    private static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 读取文件信息
     * 
     * @param fileName
     *            文件路径D:\Program
     *            Files\eclipse\workspace\ParseLogTest\src\access_20170604.log
     * @throws Exception
     */
    @Transactional
    public void readFileByLines() {
        List<String> goodsUrl = goodsUrlService.getGoodsUrl();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date time = cal.getTime();
        String yesterday = dayFormat.format(time);
        String fileName = yykPath + "access_" + yesterday + ".log";
        System.out.println(fileName);
        List<AccessLogSpread> yykList = new ArrayList<AccessLogSpread>();
        try {
            AccessLogSpread al = null;
            long count = 0;
            int num = 300;
            while (true) {
                List<String> readLine = new ParseWxLog().readLine(fileName, num, count);
                if (!readLine.isEmpty()) {
                    if (readLine.size() > num) {
                        count = Long.parseLong(readLine.get(readLine.size() - 1));
                        readLine.remove(readLine.size() - 1);
                    }
                    for (int i = 0; i < readLine.size(); i++) {
                        // 获取产品地址
                        int urlStart = readLine.get(i).indexOf("]");
                        int urlEnd = readLine.get(i).indexOf("HTTP");
                        String urladdress = readLine.get(i).substring(urlStart + 6, urlEnd);
                        if (CommonUtil.checkUrl(goodsUrl, urladdress.trim())) {
                            urladdress = urladdress.trim();
                            if (urladdress.contains("/activityCommon?m=oneServiceActivity")) {
                                urladdress = CommonUtil.baseUrl(goodsUrl, urladdress.trim());
                            }
                            al = new AccessLogSpread();
                            int timeIndex = readLine.get(i).indexOf(":");
                            String hourse = readLine.get(i).substring(timeIndex + 1, timeIndex + 3);
                            String startTime = hourse + ":00:00";
                            String endTime = hourse + ":59:59";
                            // 获取ip地址 根据ip判断pv、uv
                            int ipindex = readLine.get(i).indexOf("-");
                            String ipaddress = readLine.get(i).substring(0, ipindex - 1);
                            // 访问的商品的id有两位、三位，统一按三位截取，然后两位的去前后空格
                            al.setAccesstime(dayFormat.parse(yesterday));
                            al.setIp(ipaddress);
                            al.setStarttime(timeFormat.parse(startTime));
                            al.setEndtime(timeFormat.parse(endTime));
                            al.setProductPath(urladdress);
                            al.setPlatformId("3");
                            yykList.add(al);
                        }
                    }
                    if (readLine.size() < num)
                        break;
                }
                if (readLine.size() == 0)
                    break;
            }
            extracted(yykList, yesterday);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void extracted(List<AccessLogSpread> list, String dayTime)
            throws ParseException, IllegalAccessException, InvocationTargetException {
        List<AccessLog> logList = new ArrayList<>();
        List<AccessLogSpread> allProduct = new ArrayList<>(list);
        // 获取所有访问商品列表
        for (int i = 0; i < allProduct.size(); i++) {
            for (int j = allProduct.size() - 1; j > i; j--) {
                if (allProduct.get(i).getProductPath().equals(allProduct.get(j).getProductPath())) {
                    allProduct.remove(j);
                }
            }
        }
        AccessLog accesslog = null;
        AccessLog sourceTime = null;
        for (AccessLogSpread accesslog2 : allProduct) {
            // 根据商品的地址获取商品一天内的访问次数
            Predicate predicate = new MyPredicate("productPath", accesslog2.getProductPath());
            List<AccessLogSpread> select = (List<AccessLogSpread>) CollectionUtils.select(list, predicate);
            GoodsUrlExample goodsExample = new GoodsUrlExample();
            Criteria goodsCriteria = goodsExample.createCriteria();
            goodsCriteria.andPathEqualTo(accesslog2.getProductPath());
            List<GoodsUrl> goods = goodsUrlMapper.selectByExample(goodsExample);
            if (goods.size() == 0) {
                logger.info("未找到名称的产品地址" + accesslog2.getProductPath());
            }
            if (goods.size() > 0) {
                // 获取某一商品的各个时间段
                List<AccessLogSpread> timeList = new ArrayList<>(select);
                for (int i = 0; i < timeList.size(); i++) {
                    for (int j = timeList.size() - 1; j > i; j--) {
                        if (timeList.get(i).getStarttime().equals(timeList.get(j).getStarttime())) {
                            timeList.remove(j);
                        }
                    }
                }
                for (AccessLogSpread accesslog3 : timeList) {
                    sourceTime = new AccessLog();
                    BeanUtils.copyProperties(sourceTime, accesslog3);
                    sourceTime.setGoodsUrlId(goods.get(0).getId());
                    Predicate pvPredicate = new MyPredicate("starttime", accesslog3.getStarttime());
                    List<AccessLogSpread> pv = (List<AccessLogSpread>) CollectionUtils.select(select, pvPredicate);
                    sourceTime.setPv(pv.size());
                    // 如果时间段的日志数==1说明该时间段有且只有一个ip访问pv、uv值相等
                    // 反之就进行判断
                    if (pv.size() > 1) {
                        for (int i = 0; i < pv.size() - 1; i++) {
                            for (int j = 1; j < pv.size(); j++) {
                                if (pv.get(i).getIp().equals(pv.get(j).getIp())) {
                                    pv.remove(j);
                                }
                            }
                        }
                    }
                    sourceTime.setUv(pv.size());
                    logList.add(sourceTime);
                }
                accesslog = new AccessLog();
                BeanUtils.copyProperties(accesslog, accesslog2);
                accesslog.setGoodsUrlId(goods.get(0).getId());
                accesslog.setStarttime(timeFormat.parse("00:00:00"));
                accesslog.setEndtime(timeFormat.parse("23:59:59"));
                accesslog.setPv(select.size());
                for (int i = 0; i < select.size(); i++) {
                    for (int j = select.size() - 1; j > i; j--) {
                        if (select.get(i).getIp().equals(select.get(j).getIp())) {
                            select.remove(j);
                        }
                    }
                }
                accesslog.setUv(select.size());
                logList.add(accesslog);
            }
        }
        System.out.println(logList.size());
        for (AccessLog accesslog1 : logList) {
            // 数据库主键为vachar 调用自动生成UUID
            accesslog1.setId(UUIDUtils.getId());
            // 将数据插入到数据库
            accesslogMapper.insertSelective(accesslog1);
        }
    }

    /**
     * @param fileName
     *            读取文件的路径
     * @param num
     *            读取的行数
     * @param count
     *            读取文件的起始位置
     * @return
     */

    public List<String> readLine(String fileName, int num, long count) {
        List<String> list = new ArrayList<>();
        LineNumberReader reader = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            // RandomAccessFile raf = new RandomAccessFile(fileName);
            reader = new LineNumberReader(fileReader);
            if (count > 0) {
                reader.skip(count);
            }
            while (true) {

                String tempString = reader.readLine();
                count += tempString.length() + 1;
                if (StringUtils.isNotEmpty(tempString)) {
                    list.add(tempString);
                }
                if (num == list.size()) {
                    list.add(count + "");
                    break;
                }
            }
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
