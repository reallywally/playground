package com.wally.playground.simple_java.big_decimal_test;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        float commission = 30;
        BigDecimal cost = BigDecimal.valueOf(1000);
        BigDecimal grossPercent = BigDecimal.ONE.subtract(BigDecimal.valueOf(commission / 100));


        if(grossPercent.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Cost is zero");
        } else {
            BigDecimal netCost = cost.multiply(grossPercent);
            System.out.println("Net cost: " + netCost);
        }

    }
}
