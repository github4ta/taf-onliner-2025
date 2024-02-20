package it.academy.viktoryiapazhydayeva;

public class Calculator {

    /**
     * int (int, int)
     */

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    /**
     * String (String, String)
     */

    public static String add(String a, String b) {
        int x;
        int y;
        try {
            x = Integer.parseInt(java.lang.String.valueOf(a));
            y = Integer.parseInt(java.lang.String.valueOf(b));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input data can not be parsed to integer");
        }
        int sumStrings = add(x, y);
        return Integer.toString(sumStrings);
    }

    public static String subtract(String a, String b) {
        int x = Integer.parseInt(java.lang.String.valueOf(a));
        int y = Integer.parseInt(java.lang.String.valueOf(b));
        int subtractionStrings = subtract(x, y);
        return Integer.toString(subtractionStrings);
    }

    public static String multiply(String a, String b) {
        int x = Integer.parseInt(java.lang.String.valueOf(a));
        int y = Integer.parseInt(java.lang.String.valueOf(b));
        int multiplicationStrings = multiply(x, y);
        return Integer.toString(multiplicationStrings);
    }

    public static String divide(String a, String b) {
        int x = Integer.parseInt(java.lang.String.valueOf(a));
        int y = Integer.parseInt(java.lang.String.valueOf(b));
        int divisionStrings = divide(x, y);
        return Integer.toString(divisionStrings);
    }

    /**
     * double (double, double)
     */
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    /**
     * double (int, double)
     */
    public static double add(int a, double b) {
        return a + b;
    }

    public static double subtract(int a, double b) {
        return a - b;
    }

    public static double multiply(int a, double b) {
        return a * b;
    }

    public static double divide(int a, double b) {
        return a / b;
    }

    /**
     * double (double, int)
     */
    public static double add(double a, int b) {
        return a + b;
    }

    public static double subtract(double a, int b) {
        return a - b;
    }

    public static double multiply(double a, int b) {
        return a * b;
    }

    public static double divide(double a, int b) {
        return a / b;
    }
}
