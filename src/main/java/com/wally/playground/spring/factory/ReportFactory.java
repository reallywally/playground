package com.wally.playground.spring.factory;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ReportFactory {
    private final Map<String, ReportCollector> reportCollectorMap = new HashMap<>();

    public ReportFactory(List<ReportCollector> reportCollectors) {
        reportCollectors.forEach(reportCollector -> reportCollectorMap.put(reportCollector.getPlatform(), reportCollector));
    }

    public ReportCollector getReportPlatform(String type) {
        return reportCollectorMap.get(type);
    }
}
