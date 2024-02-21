package it.academy.antondomenikov;

import java.math.BigInteger;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        BigInteger result = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE; // Handling positive overflow
        } else if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE; // Handling negative overflow
        } else {
            return result.intValue();
        }
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double subtract(int a, double b) {
        return a - b;
    }

    public double multiply(int a, double b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a * b;
    }

    public double divide(int a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}