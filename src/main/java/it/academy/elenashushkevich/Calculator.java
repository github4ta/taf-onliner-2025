package it.academy.elenashushkevich;

public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiple(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double subtract(int a, double b) {
        return a - b;
    }

    public double multiple(int a, double b) {
        return a * b;
    }

    public double divide(int a, double b) {
        return a / b;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public double subtract(double a, int b) {
        return a - b;
    }

    public double multiple(double a, int b) {
        return a * b;
    }

    public double divide(double a, int b) {
        return a / b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public String subtract(String a, String b) {
        if (a == null || b == null) {
            return "a or b is null!";
        }
        return a.replace(b, "");
    }

    public String multiple(String a, String b) {
        return a + b;
    }

    public String divide(String a, String b) {
        return a + b;
    }
}

