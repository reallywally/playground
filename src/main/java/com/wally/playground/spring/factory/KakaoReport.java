package com.wally.playground.spring.factory;

import org.springframework.stereotype.Service;

@Service
public class KakaoReport implements ReportCollector {

    @Override
    public String getPlatform() {
        return "KAKAO";
    }

    @Override
    public void collect() {
        System.out.println("KakaoReport.collect");
    }
}
