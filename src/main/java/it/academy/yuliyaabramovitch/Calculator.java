package it.academy.yuliyaabramovitch;

import java.math.BigDecimal;

public class Calculator {
    //    ***Sum
    public static int calculateSum(int valueA, int valueB) {
        return valueA + valueB;
    }

    public static double calculateSum(double valueA, double valueB) {
        BigDecimal numberA = BigDecimal.valueOf(valueA);
        BigDecimal numberB = BigDecimal.valueOf(valueB);
        BigDecimal sum = numberA.add(numberB);
        return sum.doubleValue();
    }

    public static double calculateSum(int valueA, double valueB) {
        BigDecimal numberA = BigDecimal.valueOf(valueA);
        BigDecimal numberB = BigDecimal.valueOf(valueB);
        BigDecimal sum = numberA.add(numberB);
        return sum.doubleValue();
    }

    public static double calculateSum(double valueA, int valueB) {
        BigDecimal numberA = BigDecimal.valueOf(valueA);
        BigDecimal numberB = BigDecimal.valueOf(valueB);
        BigDecimal sum = numberA.add(numberB);
        return sum.doubleValue();
    }

    public static String calculateSum(String valueA, String valueB) {
        return String.join(" ", valueA, valueB);
    }
//    ***Subtraction

    public static int calculateSubtraction(int valueA, int valueB) {
        return valueA - valueB;
    }

    public static double calculateSubtraction(double valueA, double valueB) {
        return valueA - valueB;
    }

    public static double calculateSubtraction(int valueA, double valueB) {
        return valueA - valueB;
    }

    public static double calculateSubtraction(double valueA, int valueB) {
        return valueA - valueB;
    }

    public static String calculateSubtraction(String valueA, String valueB) {
        return "Нельзя выполнить вычитание строк!";
    }

    //    ***Multiplication
    public static int calculateMultiplication(int valueA, int valueB) {
        return valueA * valueB;
    }

    public static double calculateMultiplication(double valueA, double valueB) {
        return valueA * valueB;
    }

    public static double calculateMultiplication(int valueA, double valueB) {
        return valueA * valueB;
    }

    public static double calculateMultiplication(double valueA, int valueB) {
        return valueA * valueB;
    }

    public static String calculateMultiplication(String valueA, String valueB) {
        return "Нельзя выполнить умножение строк!";
    }

    //    ***Dividing
    public static int calculateDividing(int valueA, int valueB) {
        return valueA / valueB;
    }

    public static double calculateDividing(double valueA, double valueB) {
        return valueA / valueB;
    }

    public static double calculateDividing(int valueA, double valueB) {
        return valueA / valueB;
    }

    public static double calculateDividing(double valueA, int valueB) {
        return valueA / valueB;
    }

    public static String calculateDividing(String valueA, String valueB) {
        return "Нельзя выполнить деление строк!";
    }
}
