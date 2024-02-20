package it.academy.maksimnovikov;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.add(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double sum(int a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.add(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double sum(double a, int b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.add(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static String sum(String a, String b) {
        String errorMessage = "Enter the correct number";
        String regex = "[0-9.-]+";
        if (a.matches(regex) && b.matches(regex)) {
            if (a.indexOf(".") > 0 || b.indexOf(".") > 0) {
                BigDecimal numA = new BigDecimal(a);
                BigDecimal numB = new BigDecimal(b);
                return (numA.add(numB).setScale(3, RoundingMode.HALF_UP)).toString();
            } else {
                BigInteger numC = new BigInteger(a);
                BigInteger numD = new BigInteger(b);
                return (numC.add(numD)).toString();
            }
        } else return errorMessage;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.subtract(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double subtract(int a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.subtract(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double subtract(double a, int b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.subtract(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static String subtract(String a, String b) {
        String errorMessage = "Enter the correct number";
        String regex = "[0-9.-]+";
        if (a.matches(regex) && b.matches(regex)) {
            if (a.indexOf(".") > 0 || b.indexOf(".") > 0) {
                BigDecimal numA = new BigDecimal(a);
                BigDecimal numB = new BigDecimal(b);
                return (numA.subtract(numB).setScale(3, RoundingMode.HALF_UP)).toString();
            } else {
                BigInteger numC = new BigInteger(a);
                BigInteger numD = new BigInteger(b);
                return (numC.subtract(numD)).toString();
            }
        } else return errorMessage;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.multiply(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double multiply(int a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.multiply(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double multiply(double a, int b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.multiply(numB).setScale(3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static String multiply(String a, String b) {
        String errorMessage = "Enter the correct number";
        String regex = "[0-9.-]+";
        if (a.matches(regex) && b.matches(regex)) {
            if (a.indexOf(".") > 0 || b.indexOf(".") > 0) {
                BigDecimal numA = new BigDecimal(a);
                BigDecimal numB = new BigDecimal(b);
                return (numA.multiply(numB).setScale(3, RoundingMode.HALF_UP)).toString();
            } else {
                BigInteger numC = new BigInteger(a);
                BigInteger numD = new BigInteger(b);
                return (numC.multiply(numD)).toString();
            }
        } else return errorMessage;
    }

    public static int divide(int h, int g) {
        return h / g;
    }

    public static double divide(double a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.divide(numB, 3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double divide(int a, double b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.divide(numB, 3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double divide(double a, int b) {
        BigDecimal numA = new BigDecimal(a);
        BigDecimal numB = new BigDecimal(b);
        return (numA.divide(numB, 3, RoundingMode.HALF_UP)).doubleValue();
    }

    public static String divide(String a, String b) {
        String errorMessageDivideByZero = "Divide by zero is impossible";
        String errorMessage = "Enter the correct number";
        String regex = "[0-9.-]+";
        if (b.equals("0") || b.equals("0.0")) {
            return errorMessageDivideByZero;
        }
        if (a.matches(regex) && b.matches(regex)) {
            if (a.indexOf(".") > 0 || b.indexOf(".") > 0) {
                BigDecimal numA = new BigDecimal(a);
                BigDecimal numB = new BigDecimal(b);
                return (numA.divide(numB, 3, RoundingMode.HALF_UP)).toString();
            } else {
                BigInteger numC = new BigInteger(a);
                BigInteger numD = new BigInteger(b);
                return (numC.divide(numD)).toString();
            }
        } else return errorMessage;
    }
}
