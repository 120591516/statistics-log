package com.jinpaihushi.parse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinpaihushi.mapper.GoodsUrlMapper;
import com.jinpaihushi.model.GoodsUrl;

@Service(value = "goodsUrl")
public class GoodsUrlService {

    @Autowired
    private GoodsUrlMapper goodsUrlMapper;

    public List<String> getGoodsUrl() {
        List<String> result = new ArrayList<>();
        List<GoodsUrl> list = goodsUrlMapper.selectByExample(null);
        for (GoodsUrl goodsUrl : list) {
            result.add(goodsUrl.getPath());
        }
        return result;
    }
}
