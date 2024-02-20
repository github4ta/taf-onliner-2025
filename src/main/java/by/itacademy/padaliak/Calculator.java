package by.itacademy.padaliak;

public class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static int sum(String a, String b) {
        int c = Integer.parseInt(a.trim()) + Integer.parseInt(b.trim());
        return Integer.parseInt(Integer.toString(c));
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double subtract(int a, double b) {
        return a - b;
    }

    public static double subtract(double a, int b) {
        return a - b;
    }

    public static int subtract(String a, String b) {
        int c = Integer.parseInt(a.trim()) - Integer.parseInt(b.trim());
        return Integer.parseInt(Integer.toString(c));
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double division(int a, double b) {
        return a / b;
    }

    public static double division(double a, int b) {
        return a / b;
    }
    public static int division(String a, String b) {
        int c = Integer.parseInt(a.trim()) / Integer.parseInt(b.trim());
        return Integer.parseInt(Integer.toString(c));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double multiply(int a, double b) {
        return a * b;
    }

    public static double multiply(double a, int b) {
        return a * b;
    }
    public static int multiply(String a, String b) {
        int c = Integer.parseInt(a.trim()) * Integer.parseInt(b.trim());
        return Integer.parseInt(Integer.toString(c));
    }
}