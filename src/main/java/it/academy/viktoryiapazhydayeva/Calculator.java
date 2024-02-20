package it.academy.viktoryiapazhydayeva;

public class Calculator {
    // INTEGERS
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

    // STRINGS TO INTEGERS

    public static String add(String a, String b) {  // REFACTOR: NumberFormatExcpt, null, letters, sum/input min/max exceeded
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
}
