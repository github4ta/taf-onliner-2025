package it.academy.antondomenikov;

public class Calculator {

    public int addIntInt(int a, int b) {
        return a + b;
    }

    public int subtractIntInt(int a, int b) {
        return a - b;
    }

    public int multiplyIntInt(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a * b;
    }

    public int divideIntInt(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

}