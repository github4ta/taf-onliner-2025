package it.academy.viktoryiapazhydayeva;

import org.jetbrains.annotations.NotNull;

public class Calculator {
    // INTEGERS
    public static int sumIntegers(int a, int b) {
        return a + b;
    }

    public static int subtractIntegers(int a, int b) {
        return a - b;
    }

    public static int multiplyIntegers(int a, int b) {
        return a * b;
    }

    public static int divideIntegers(int a, int b) {
        return a / b;
    }

    // STRINGS TO INTEGERS
    @NotNull
    public static String sumStrings(String a, String b) {  // REFACTOR: NumberFormatExcpt, null, letters, sum/input min/max exceeded
       /* if (a == null || b == null) {
            throw new NumberFormatException("String(s) are empty");
        }*/
        int x = Integer.parseInt(java.lang.String.valueOf(a));
        int y = Integer.parseInt(java.lang.String.valueOf(b));
        int sumStrings = x + y;
        return Integer.toString(sumStrings);
    }

    @NotNull
    public static String subtractStrings(String a, String b) {
        int x = Integer.parseInt(java.lang.String.valueOf(a));
        int y = Integer.parseInt(java.lang.String.valueOf(b));
        int subtractionStrings = x - y;
        return Integer.toString(subtractionStrings);
    }

    @NotNull
    public static String multiplyStrings(String a, String b) {
        int x = Integer.parseInt(java.lang.String.valueOf(a));
        int y = Integer.parseInt(java.lang.String.valueOf(b));
        int multiplicationStrings = x * y;
        return Integer.toString(multiplicationStrings);
    }

    @NotNull
    public static String divideStrings(String a, String b) {
        int x = Integer.parseInt(java.lang.String.valueOf(a));
        int y = Integer.parseInt(java.lang.String.valueOf(b));
        int divisionStrings = x / y;
        return Integer.toString(divisionStrings);
    }
}
