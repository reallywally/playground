package com.wally.playground.simple_java.read_field;

import java.lang.reflect.Field;

public class ReadFieldTest {
    public static void main(String[] args) {
        readEnumField();
        readClassFiled();
    }

    private static void readEnumField() {
        // Enum 목록 먼저 가져오고
        Class<Status> clazz = Status.class;
        Object[] enumConstants = clazz.getEnumConstants();

        for (Object enumConstant : enumConstants) {
            Enum<?> enumField = (Enum<?>) enumConstant;
            Field[] declaredFields = clazz.getDeclaredFields();

            for (Field declaredField : declaredFields) {
                try {
                    Field field = Status.class.getDeclaredField(declaredField.getName());
                    field.setAccessible(true);
                    Object fieldValue = field.get(enumField);

                    System.out.println(fieldValue.toString());
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
    }


    private static void readClassFiled() {
    }
}
