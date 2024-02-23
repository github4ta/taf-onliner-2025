package it.academy.nataliagvozdeva;

import static java.lang.Integer.parseInt;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }
    public int division(int a, int b){
        return a / b;
    }
    public int multiplication(int a, int b){
        return a * b;
    }

    public double sum(double a, double b){
        return a + b;
    }
    public double subtraction(double a, double b){
        return a - b;
    }
    public double division(double a, double b){
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }
    public double multiplication(double a, double b){
        return a * b;
    }
    public double sum(int a, double b){
        return a + b;
    }
    public double subtraction(int a, double b){
        return a - b;
    }
    public double division(int a, double b){
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }
    public double multiplication(int a, double b){
        return a * b;
    }
    public double sum(double a, int b){
        return a + b;
    }
    public double subtraction(double a, int b){
        return a - b;
    }
    public double division(double a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }
    public double multiplication(double a, int b){
        return a * b;
    }

    public String sum(String a, String b){
        return Integer.toString(parseInt(a) + parseInt(b));
    }
    public String subtraction(String a, String b){
        return Integer.toString(parseInt(a) - parseInt(b));
    }
    public String division(String a, String b){
        if (parseInt(b) == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return Integer.toString(parseInt(a) / parseInt(b));
    }
    public String multiplication(String a, String b){
        return Integer.toString(parseInt(a) * parseInt(b));
    }

}
