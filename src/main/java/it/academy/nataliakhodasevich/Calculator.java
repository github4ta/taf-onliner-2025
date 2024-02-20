package it.academy.nataliakhodasevich;

public class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        }
        return a / b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double subtract(int a, double b) {
        return a - b;
    }

    public static double multiply(int a, double b) {
        return a * b;
    }

    public static double divide(int a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        }
        return a / b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        }
        return a / b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double subtract(double a, int b) {
        return a - b;
    }

    public static double multiply(double a, int b) {
        return a * b;
    }

    public static double divide(double a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        }
        return a / b;
    }

    public static String sumString(String a, String b) {
        double result = Integer.parseInt(a) + Double.parseDouble(b);
        return Double.toString(result);
    }

    public static String subtractString(String a, String b) {
        double result = Integer.parseInt(a) - Double.parseDouble(b);
        return Double.toString(result);
    }

    public static String divideString(String a, String b) {
        int strA = Integer.parseInt(a);
        double strB = Double.parseDouble(b);
        if (strB == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно!");
        }
        double result = strA / strB;
        return Double.toString(result);
    }

    public static String multiplyString(String a, String b) {
        double result = Integer.parseInt(a) * Double.parseDouble(b);
        return Double.toString(result);
    }
}
