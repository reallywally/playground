package com.wally.playground.simple_java.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
    public static void main(String[] args) {
        String input = "data:image/png;base64,123123";
        String pattern = "data:(image/png);base64,(.*)";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);

        if (matcher.find()) {
            String imageType = matcher.group(1);
            System.out.println("Image type: " + imageType);
        } else {
            System.out.println("Image type not found.");
        }
    }
}
