package it.academy.yuliyaabramovitch;

import net.bytebuddy.implementation.bytecode.Multiplication;

public class Calculator {
    //    ***Sum
    public int calculateSum(int valueA, int valueB) {
        return valueA + valueB;
    }

    public double calculateSum(double valueA, double valueB) {
        return valueA + valueB;
    }

    public double calculateSum(int valueA, double valueB) {
        return valueA + valueB;
    }

    public double calculateSum(double valueA, int valueB) {
        return valueA + valueB;
    }

    public String calculateSum(String valueA, String valueB) {
        return String.join(" ", valueA, valueB);
    }
//    ***Subtraction

    public int calculateSubtraction(int valueA, int valueB) {
        return valueA - valueB;
    }

    public double calculateSubtraction(double valueA, double valueB) {
        return valueA - valueB;
    }

    public double calculateSubtraction(int valueA, double valueB) {
        return valueA - valueB;
    }

    public double calculateSubtraction(double valueA, int valueB) {
        return valueA - valueB;
    }

    public String calculateSubtraction(String valueA, String valueB) {
        return "Нельзя выполнить вычитание строк!";
    }
//    ***Multiplication
    public int calculateMultiplication(int valueA, int valueB) {
        return valueA * valueB;
    }
    public double calculateMultiplication(double valueA, double valueB) {
        return valueA * valueB;
    }
    public double calculateMultiplication(int valueA, double valueB) {
        return valueA * valueB;
    }
    public double calculateMultiplication(double valueA, int valueB) {
        return valueA * valueB;
    }
    public String calculateMultiplication(String valueA, String valueB) {
        return "Нельзя выполнить умножение строк!";
    }
//    ***Dividing
    public int calculateDividing(int valueA, int valueB) {
        return valueA / valueB;
    }
    public double calculateDividing(double valueA, double valueB) {
        return valueA / valueB;
    }
    public double calculateDividing(int valueA, double valueB) {
        return valueA / valueB;
    }
    public double calculateDividing(double valueA, int valueB) {
        return valueA / valueB;
    }
    public String calculateDividing(String valueA, String valueB) {
        return "Нельзя выполнить деление строк!";
    }
}
