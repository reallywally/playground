package com.wally.playground.spring.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ReportFactoryTest {

    @Autowired
    private ReportFactory reportFactory;

    @Test
    void factoryTest() {
        ReportCollector google = reportFactory.getReportPlatform("GOOGLE");
        google.collect();

        ReportCollector kakao = reportFactory.getReportPlatform("KAKAO");
        kakao.collect();

        ReportCollector naver = reportFactory.getReportPlatform("NAVER");
        naver.collect();

    }
}