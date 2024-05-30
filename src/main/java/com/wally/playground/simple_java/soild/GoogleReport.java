package com.wally.playground.simple_java.soild;

public class GoogleReport implements SimpleReportCollector {

    @Override
    public String getPlatform() {
        return "GOOGLE";
    }

    @Override
    public void collect() {
        System.out.println("GoogleReport.collect");
    }
}
