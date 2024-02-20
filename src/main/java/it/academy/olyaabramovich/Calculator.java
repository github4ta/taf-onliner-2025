package it.academy.olyaabramovich;

import java.math.BigDecimal;

public class Calculator {

    public static Integer calculateSum(int a, int b) {
        Long l = (long) a + b;
        int sum = 0;
        if (l > 2147483647) {
            return null;
        } else if (l < -2147483648) {
            return null;
        } else {
            sum = a + b;
        }
        return sum;
    }

    public static double calculateSum(double a, double b) {
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);
        BigDecimal sum = num1.add(num2);
        return sum.doubleValue();
    }

    public static double calculateSum(int a, double b) {
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);
        BigDecimal sum = num1.add(num2);
        return sum.doubleValue();
    }

    public static double calculateSum(double a, int b) {
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);
        BigDecimal sum = num1.add(num2);
        return sum.doubleValue();
    }

    public static String calculateSum(String str1, String str2) {
        return str1 + str2;
    }

    public static Integer calculateSubtraction(int a, int b) {
        Long l = (long) a - b;
        int result = 0;
        if (l > 2147483647) {
            return null;
        } else if (l < -2147483648) {
            return null;
        } else {
            result = a - b;
        }
        return result;
    }

    public static double calculateSubtraction(double a, double b) {
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);
        BigDecimal result = num1.subtract(num2);
        return result.doubleValue();
    }

    public static double calculateSubtraction(int a, double b) {
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);
        BigDecimal result = num1.subtract(num2);
        return result.doubleValue();
    }

    public static double calculateSubtraction(double a, int b) {
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);
        BigDecimal result = num1.subtract(num2);
        return result.doubleValue();
    }

    public static int calculateMultiplication(int a, int b) {
        return a * b;
    }

    public static double calculateMultiplication(double a, double b) {
        return a * b;
    }

    public static double calculateMultiplication(int a, double b) {
        return a * b;
    }

    public static double calculateMultiplication(double a, int b) {
        return a * b;
    }


    public static int calculateDivision(int a, int b) {
        return a / b;
    }

    public static double calculateDivision(double a, double b) {
        return a / b;
    }

    public static double calculateDivision(int a, double b) {
        return a / b;
    }

    public static double calculateDivision(double a, int b) {
        return a / b;
    }
}
