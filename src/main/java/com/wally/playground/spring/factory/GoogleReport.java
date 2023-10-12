package com.wally.playground.spring.factory;

import org.springframework.stereotype.Service;

@Service
public class GoogleReport implements ReportCollector {

    @Override
    public String getPlatform() {
        return "GOOGLE";
    }

    @Override
    public void collect() {
        System.out.println("GoogleReport.collect");
    }
}
