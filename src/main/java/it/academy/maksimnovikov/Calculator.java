package it.academy.maksimnovikov;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.add(numB)).doubleValue();
    }

    public static double sum(int a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.add(numB)).doubleValue();
    }

    public static double sum(double a, int b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.add(numB)).doubleValue();
    }

    public static String sum(String a, String b) {
        String errorMessage = "Enter the correct number";
        String regex = "[0-9.-]+";
        if (a.matches(regex) && b.matches(regex)) {
            if (a.indexOf(".") > 0 || b.indexOf(".") > 0) {
                BigDecimal numA = new BigDecimal(a);
                BigDecimal numB = new BigDecimal(b);
                return (numA.add(numB)).toString();
            } else {
                BigInteger numC = new BigInteger(a);
                BigInteger numD = new BigInteger(b);
                return (numC.add(numD)).toString();
            }
        } else return errorMessage;
    }
}
