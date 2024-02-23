package it.academy.kulachek;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
    }

    public double sum(int a, double b) {
        return a + b;
    }

    public double subtract(int a, double b) {
        return a - b;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public double divide(int a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
    }

    public double sum(double a, int b) {
        return a + b;
    }

    public double subtract(double a, int b) {
        return a - b;
    }

    public double multiply(double a, int b) {
        return a * b;
    }

    public double divide(double a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
    }

    public String sum(String a, String b) {
        return a + b;
    }

}
