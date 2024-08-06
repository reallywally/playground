package com.wally.playground.simple_java.number_parse;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberParseTest {
    public static void main(String[] args) {
        String str = "";
        NumberFormat instance = NumberFormat.getInstance();

        try {
            instance.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
