package com.wally.playground.simple_java.collection_test;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private String name;
    private String department;
    private int salary;
    private String grade;
}
