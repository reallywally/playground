package com.wally.playground.simple_java.soild;

public class NaverReport implements SimpleReportCollector {

    @Override
    public String getPlatform() {
        return "NAVER";
    }

    @Override
    public void collect() {
        System.out.println("NaverReport.collect");
    }
}
