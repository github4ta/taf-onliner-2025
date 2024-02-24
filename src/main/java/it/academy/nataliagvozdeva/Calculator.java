package it.academy.nataliagvozdeva;

import static java.lang.Integer.parseInt;

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double subtraction(int a, double b) {
        return a - b;
    }

    public static double division(int a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }

    public static double multiplication(int a, double b) {
        return a * b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double subtraction(double a, int b) {
        return a - b;
    }

    public static double division(double a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }

    public static double multiplication(double a, int b) {
        return a * b;
    }

    public static String sum(String a, String b) {
        return Integer.toString(parseInt(a) + parseInt(b));
    }

    public static String subtraction(String a, String b) {
        return Integer.toString(parseInt(a) - parseInt(b));
    }

    public static String division(String a, String b) {
        if (parseInt(b) == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return Integer.toString(parseInt(a) / parseInt(b));
    }

    public static String multiplication(String a, String b) {
        return Integer.toString(parseInt(a) * parseInt(b));
    }
}
