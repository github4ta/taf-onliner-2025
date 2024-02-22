package it.academy.olyaabramovich;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

public class Calculator {
    public static final int INT_MAX_VALUE = 2147483647;
    public static final int INT_MIN_VALUE = -2147483648;

    static Integer checkIfValueWithinBounds(long valueToCheck) {
        if (valueToCheck > INT_MAX_VALUE) {
            return null;
        } else if (valueToCheck < INT_MIN_VALUE) {
            return null;
        } else {
            return (int) valueToCheck;
        }
    }

    public static Integer calculateSum(int a, int b) {
        long l = (long) a + (long) b;
        return checkIfValueWithinBounds(l);
    }

    public static double calculateSum(double a, double b) {
        BigDecimal sum = BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
        return sum.doubleValue();
    }

    public static double calculateSum(int a, double b) {
        BigDecimal sum = BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
        return sum.doubleValue();
    }

    public static double calculateSum(double a, int b) {
        BigDecimal sum = BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
        return sum.doubleValue();
    }

    public static Integer calculateSubtraction(int a, int b) {
        long l = (long) a - (long) b;
        return checkIfValueWithinBounds(l);
    }

    public static double calculateSubtraction(double a, double b) {
        BigDecimal result = BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
        return result.doubleValue();
    }

    public static double calculateSubtraction(int a, double b) {
        BigDecimal result = BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
        return result.doubleValue();
    }

    public static double calculateSubtraction(double a, int b) {
        BigDecimal result = BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
        return result.doubleValue();
    }

    public static Integer calculateMultiplication(int a, int b) {
        long l = (long) a * (long) b;
        return checkIfValueWithinBounds(l);
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

    public static Integer calculateDivision(int a, int b) {
        if (b == 0) {
            return null;
        } else {
            long l = (long) a / (long) b;
            return checkIfValueWithinBounds(l);
        }
    }

    public static Double calculateDivision(double a, double b) {
        if (b == 0) {
            return null;
        } else {
            BigDecimal value1 = valueOf(a);
            BigDecimal value2 = valueOf(b);
            return value1.divide(value2, 4, RoundingMode.HALF_UP).doubleValue();
        }
    }

    public static Double calculateDivision(int a, double b) {
        if (b == 0) {
            return null;
        } else {
            BigDecimal value1 = valueOf(a);
            BigDecimal value2 = valueOf(b);
            return value1.divide(value2, 4, RoundingMode.HALF_UP).doubleValue();
        }
    }

    public static Double calculateDivision(double a, int b) {
        if (b == 0) {
            return null;
        } else {
            BigDecimal value1 = valueOf(a);
            BigDecimal value2 = valueOf(b);
            return value1.divide(value2, 4, RoundingMode.HALF_UP).doubleValue();
        }
    }

    public static String calculateSum(String str1, String str2) {
        BigDecimal value1 = valueOf(Double.parseDouble(str1));
        BigDecimal value2 = valueOf(Double.parseDouble(str2));
        return String.valueOf(value1.add(value2));
    }

    public static String calculateSubtraction(String str1, String str2) {
        BigDecimal value1 = valueOf(Double.parseDouble(str1));
        BigDecimal value2 = valueOf(Double.parseDouble(str2));
        return String.valueOf(value1.subtract(value2));
    }

    public static String calculateMultiplication(String str1, String str2) {
        BigDecimal value1 = valueOf(Double.parseDouble(str1));
        BigDecimal value2 = valueOf(Double.parseDouble(str2));
        double result = value1.multiply(value2).doubleValue();
        return String.valueOf(result);
    }

    public static String calculateDivision(String str1, String str2) {
        BigDecimal value1 = valueOf(Double.parseDouble(str1));
        BigDecimal value2 = valueOf(Double.parseDouble(str2));

        if (value2.equals(0)) {
            return null;
        } else {
            return String.valueOf(value1.divide(value2, 4, RoundingMode.HALF_UP).doubleValue());
        }
    }
}
