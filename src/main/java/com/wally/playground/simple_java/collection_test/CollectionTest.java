package com.wally.playground.simple_java.collection_test;

import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                Employee.builder().name("Wally").department("IT").salary(10).grade("A").incentives(List.of(100, 200)).build(),
                Employee.builder().name("Tom").department("IT").salary(20).grade("B").incentives(List.of(300, 400, 500)).build(),
                Employee.builder().name("Jerry").department("HR").salary(30).grade("C").incentives(List.of(10, 20)).build(),
                Employee.builder().name("Mickey").department("HR").salary(40).grade("D").incentives(List.of(11, 22)).build(),
                Employee.builder().name("Donald").department("HR").salary(50).grade("E").incentives(List.of(111, 222)).build());

        int sum = 0;
        /*
        이거는 람다에서 로컬 변수 접근해서 에러남
        for (Employee employee : employees) {
            employee.getIncentives().forEach(incentive -> sum += incentive);
        }
        */
        for (Employee employee : employees) {
            sum += employee.getIncentives()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }

        System.out.println("sum: " + sum);
    }
}
