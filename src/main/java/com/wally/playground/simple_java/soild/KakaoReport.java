package com.wally.playground.simple_java.soild;

public class KakaoReport implements SimpleReportCollector {

    @Override
    public String getPlatform() {
        return "KAKAO";
    }

    @Override
    public void collect() {
        System.out.println("KakaoReport.collect");
    }
}
