package com.wally.playground.simple_java.read_resource;

import java.util.Locale;
import java.util.ResourceBundle;

public class ReadResourceTest {
    public static void main(String[] args) {

        ResourceBundle defaultMessages = ResourceBundle.getBundle("messages/messages");  // messages 디렉토리 밑에 properties 파일이 있어야 한다.
        System.out.println(defaultMessages.getString("check.delete"));

        ResourceBundle engMessages = ResourceBundle.getBundle("messages/messages", new Locale("en"));
        System.out.println(engMessages.getString("check.delete"));
    }
}
