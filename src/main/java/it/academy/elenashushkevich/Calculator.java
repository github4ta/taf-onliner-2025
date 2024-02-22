package it.academy.elenashushkevich;

public class Calculator {
    int retValue;
    double retValueDouble;

    public int add(int a, int b) {

        if (a >= 2147483647 || a <= -2147483648 || b >= 2147483647 || b <= -2147483648) {
            retValue = 0;
        } else {
            retValue = a + b;
        }
        return retValue;
    }

    public int subtract(int a, int b) {

        return a - b;
    }

    public int multiple(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {

            retValue = 0;
        } else {
            retValue = a / b;
        }
        return retValue;
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
        if (b == 0) {
            retValueDouble = 0;
        } else {

            retValueDouble = a / b;
        }
        return retValueDouble;
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
        if (b == 0) {
            retValueDouble = 0;
        } else {
            retValueDouble = a / b;
        }
        return retValueDouble;
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

    public static double divide(double a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно!");
        }
        return a/b;
    }

    public String add(String a, String b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b;
    }

    public String subtract(String a, String b) {
        if (a == null || b == null) {
            return "a or b is null!";
        }
        return a.replace(b, "");
    }

    public String multiple(String a, String b) {
        return a;
    }

    public String divide(String a, String b) {
        return a;
    }
}

