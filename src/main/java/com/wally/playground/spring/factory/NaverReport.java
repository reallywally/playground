package com.wally.playground.spring.factory;

import org.springframework.stereotype.Service;

@Service
public class NaverReport implements ReportCollector {

    @Override
    public String getPlatform() {
        return "NAVER";
    }

    @Override
    public void collect() {
        System.out.println("NaverReport.collect");
    }
}
