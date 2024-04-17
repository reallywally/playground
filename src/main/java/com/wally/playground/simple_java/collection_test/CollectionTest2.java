package com.wally.playground.simple_java.collection_test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionTest2 {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                Employee.builder().name("Wally").department("IT").salary(100).grade("A").build(),
                Employee.builder().name("Tom").department("IT").salary(200).grade("B").build(),
                Employee.builder().name("Jerry").department("HR").salary(300).grade("C").build(),
                Employee.builder().name("Mickey").department("HR").salary(400).grade("D").build(),
                Employee.builder().name("Donald").department("HR").salary(500).grade("E").build());

        // Accumulate names
         List<String> list = employees.stream()
                 .map(Employee::getName).toList();
                 // .collect(Collectors.toList());  toList()는 collection 안쓰고 바로 가능

         // Accumulate names into a TreeSet
        Set<String> set = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(TreeSet::new));

        // Convert elements to strings and concatenate them, separated by commas
        String joined = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        // Compute sum of salaries of employee
        int total = employees.stream()
                .collect(Collectors.summingInt(Employee::getSalary));

        // Group employees by department
        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        // Compute sum of salaries by department
        Map<String, Integer> totalByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));

        // Partition students into passing and failing
        Map<Boolean, List<Employee>> passingFailing = employees.stream()
                .collect(Collectors.partitioningBy(s -> s.getGrade().equals("A") || s.getGrade().equals("B")));

        Map<String, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getName, employee -> employee));
    }
}
