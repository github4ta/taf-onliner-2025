package it.academy.olyaabramovich;

public class Calculator {

    public static int calculateSum(int a, int b) {
        Long l = (long) a + b;
        int sum=0;
        if (l > 2147483647) {
            System.out.println("Сумма чисел превышает 2 147 483 647");
        } else if (l < -2147483648) {
            System.out.println("Сумма чисел меньше -2 147 483 648");
        } else {
            sum = a + b;
        }
        return sum;
    }

    public static double calculateSum(double a, double b) {
        return a + b;
    }

    public static double calculateSum(int a, double b) {
        return a + b;
    }

    public static double calculateSum(double a, int b) {
        return a + b;
    }

    public static String calculateSum(String str1, String str2) {
        return str1 + str2;
    }

    public static int calculateSubtraction(int a, int b) {
        return a - b;
    }

    public static double calculateSubtraction(double a, double b) {
        return a - b;
    }

    public static double calculateSubtraction(int a, double b) {
        return a - b;
    }

    public static double calculateSubtraction(double a, int b) {
        return a - b;
    }

    public static int calculateMultiplication(int a, int b) {
        return a * b;
    }

    public static double calculateMultiplication(double a, double b) {
        return a * b;
    }

    public static double calculateMultiplication(int a, double b) {
        return a * b;
    }

    public static double calculateMultiplication(double a, int b) {
        return a * b;
    }


    public static int calculateDivision(int a, int b) {
        return a / b;
    }

    public static double calculateDivision(double a, double b) {
        return a / b;
    }

    public static double calculateDivision(int a, double b) {
        return a / b;
    }

    public static double calculateDivision(double a, int b) {
        return a / b;
    }
}
