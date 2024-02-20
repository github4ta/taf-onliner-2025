package it.academy.nataliakhodasevich;

import java.sql.SQLOutput;

public class Calculator {
    //int (int, int)
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
        int result = 0;
        if (b != 0) {
            result = a / b;
        }
        return result;
    }

    //   double (int, double)
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
        double result = 0;
        if (b != 0) {
            result = a / b;
        }
        return result;
    }

    //  double (double, double)
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
        double result = 0;
        if (b != 0) {
            result = a / b;
        }
        return result;
    }

    //double (double, int)
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
        double result = 0;
        if (b != 0) {
            result = a / b;
        }
        return result;
    }

    //String (String, String)
    public static String sumString(String a, String b) {
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return Integer.toString(result);
    }

    public static String subtractString(String a, String b) {
        int result = Integer.parseInt(a) - Integer.parseInt(b);
        return Integer.toString(result);
    }

    public static String divideString(String a, String b) {
        int result = Integer.parseInt(a) / Integer.parseInt(b);
        return Integer.toString(result);
    }

    public static String multiplyString(String a, String b) {
        int result = Integer.parseInt(a) * Integer.parseInt(b);
        return Integer.toString(result);
    }
}
