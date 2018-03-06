package com.jinpaihushi.myjob;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.jinpaihushi.parse.Parse114Log;
import com.jinpaihushi.parse.ParseWxLog;
import com.jinpaihushi.parse.ParseYykLog;

@Component
@Configurable
@EnableScheduling
public class ScheduledTasks {
    private Logger logger = Logger.getLogger(getClass());

    @Autowired
    private ParseWxLog parseWxLog;

    @Autowired
    private Parse114Log parse114Log;

    @Autowired
    private ParseYykLog parseYykLog;
	@Value("${SMS_Verification_Code}")
	private String SMS_Verification_Code;
    @Scheduled(cron = "${cron}")
    public void reportCurrentTime() {
		System.out.println("加载到注解 SMS_Verification_Code=" + SMS_Verification_Code);
        System.out.println("Scheduling Tasks Examples: The time is now " + dateFormat().format(new Date()));
        logger.info("开始解析微信公众号日志");
        parseWxLog.readFileByLines();
        logger.info("解析微信公众号日志结束");
        logger.info("开始114日志");
        parse114Log.readFileByLines();
        logger.info("解析114结束");
        logger.info("开始医养康日志");
        parseYykLog.readFileByLines();
        logger.info("解析医养康结束");
    }

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("HH:mm:ss");
    }

}
