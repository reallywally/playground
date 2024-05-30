package com.wally.playground.simple_java.map_return;

import java.util.HashMap;
import java.util.Map;

public class ReturnMain {
    public static void main(String[] args) {
        Map<String, String> map1 = getMapV1();
        System.out.println("class name is " + map1.getClass().getName());

        Map<String, String> map2 = getMapV2();
        System.out.println("class name is " + map2.getClass().getName());
    }

    public static Map<String, String> getMapV1() {
        return new HashMap<>() {{
            put("key1", "value1");
            put("key2", "value2");
        }};
    }

    public static Map<String, String> getMapV2() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        return map;
    }
}
