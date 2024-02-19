package it.academy.viktoryiapazhydayeva;

import org.jetbrains.annotations.NotNull;

//
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

    // STRINGS
    @NotNull
    public static String sumStrings(String a, String b) {
        int x = Integer.parseInt(String.valueOf(a));
        int y = Integer.parseInt(String.valueOf(b));
        int sumStrings = x + y;
        return Integer.toString(sumStrings);
    }
}
