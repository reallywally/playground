package com.wally.playground.simple_java.read_field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFieldTest {
    public static void main(String[] args) {
        readEnumField();
        readClassFiled();
    }

    private static void readEnumField() {
        Class<Status> clazz = Status.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        List<Field> privateFields = Arrays.stream(declaredFields)
                .filter(field -> Modifier.isPrivate(field.getModifiers()) && !"$VALUES".equals(field.getName()))
                .toList();
        Object[] enumConstants = clazz.getEnumConstants();

        for (Object enumConstant : enumConstants) {
            Enum<?> enumField = (Enum<?>) enumConstant;
            List<String> fieldValues = new ArrayList<>();

            for (Field privateField : privateFields) {
                try {
                    Field field = Status.class.getDeclaredField(privateField.getName());
                    field.setAccessible(true);
                    Object fieldValue = field.get(enumField);

                    fieldValues.add(fieldValue.toString());
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            System.out.printf("Enum: %s, filed: %s%n", enumField.name(), fieldValues.stream().map(String::valueOf).toList());
        }
    }

    private static void readClassFiled() {
    }
}
