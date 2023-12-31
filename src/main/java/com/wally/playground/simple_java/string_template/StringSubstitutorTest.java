package com.wally.playground.simple_java.string_template;

import org.apache.commons.text.StringSubstitutor;

import java.util.HashMap;
import java.util.Map;

public class StringSubstitutorTest {
    public static void main(String[] args) {

        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("animal", "quick brown fox");
        valuesMap.put("target", "lazy dog");
        valuesMap.put("targ", "ㅁㄴㅇㄹ");

        String templateString = "The ${animal} jumped over the ${target} ${targ} times.";

        StringSubstitutor sub = new StringSubstitutor(valuesMap);

        // Replace
        String resolvedString = sub.replace(templateString);

        System.out.println(resolvedString);

    }
}
