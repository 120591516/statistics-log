package com.jinpaihushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class StatisticsLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatisticsLogApplication.class, args);
    }
}
