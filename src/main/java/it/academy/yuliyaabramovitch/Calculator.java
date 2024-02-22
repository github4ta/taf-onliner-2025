package it.academy.yuliyaabramovitch;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Calculator {
    public static int calculateSum(int valueA, int valueB) {
        BigInteger preliminarySum = BigInteger.valueOf(valueA).add(BigInteger.valueOf(valueB));
        return Util.getValue(preliminarySum);
    }

    public static double calculateSum(double valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).add(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static double calculateSum(int valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).add(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static double calculateSum(double valueA, int valueB) {
        return (BigDecimal.valueOf(valueA).add(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static String calculateSum(String valueA, String valueB) {
        if (!Util.isStringCanBeParsedAsInt(valueA) | !Util.isStringCanBeParsedAsInt(valueB)) {
            return Util.ERROR;
        } else {
            BigInteger preliminarySum = new BigInteger(valueA).add(new BigInteger(valueB));
            return String.valueOf(Util.getValue(preliminarySum));
        }
    }

    public static int calculateSubtraction(int valueA, int valueB) {
        BigInteger preliminarySubtraction = BigInteger.valueOf(valueA).subtract(BigInteger.valueOf(valueB));
        return Util.getValue(preliminarySubtraction);
    }

    public static double calculateSubtraction(double valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).subtract(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static double calculateSubtraction(int valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).subtract(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static double calculateSubtraction(double valueA, int valueB) {
        return (BigDecimal.valueOf(valueA).subtract(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static String calculateSubtraction(String valueA, String valueB) {
        if (!Util.isStringCanBeParsedAsInt(valueA) | !Util.isStringCanBeParsedAsInt(valueB)) {
            return Util.ERROR;
        } else {
            BigInteger preliminarySubtraction = new BigInteger(valueA).subtract(new BigInteger(valueB));
            return String.valueOf(Util.getValue(preliminarySubtraction));
        }
    }

    public static int calculateMultiplication(int valueA, int valueB) {
        BigInteger preliminarySum = BigInteger.valueOf(valueA).multiply(BigInteger.valueOf(valueB));
        return Util.getValue(preliminarySum);
    }

    public static double calculateMultiplication(double valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).multiply(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static double calculateMultiplication(int valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).multiply(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static double calculateMultiplication(double valueA, int valueB) {
        return (BigDecimal.valueOf(valueA).multiply(BigDecimal.valueOf(valueB))).doubleValue();
    }

    public static String calculateMultiplication(String valueA, String valueB) {
        if (!Util.isStringCanBeParsedAsInt(valueA) | !Util.isStringCanBeParsedAsInt(valueB)) {
            return Util.ERROR;
        } else {
            BigInteger preliminaryMultiply = new BigInteger(valueA).multiply(new BigInteger(valueB));
            return String.valueOf(Util.getValue(preliminaryMultiply));
        }
    }

    public static int calculateDividing(int valueA, int valueB) {
        return valueA / valueB;
    }

    public static double calculateDividing(double valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).divide(BigDecimal.valueOf(valueB), 4, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double calculateDividing(int valueA, double valueB) {
        return (BigDecimal.valueOf(valueA).divide(BigDecimal.valueOf(valueB), 4, RoundingMode.HALF_UP)).doubleValue();
    }

    public static double calculateDividing(double valueA, int valueB) {
        return (BigDecimal.valueOf(valueA).divide(BigDecimal.valueOf(valueB), 4, RoundingMode.HALF_UP)).doubleValue();
    }

    public static String calculateDividing(String valueA, String valueB) {
        if (!Util.isStringCanBeParsedAsInt(valueA) | !Util.isStringCanBeParsedAsInt(valueB)) {
            return Util.ERROR;
        } else {
            BigInteger preliminaryMultiply = new BigInteger(valueA).divide(new BigInteger(valueB));
            return String.valueOf(Util.getValue(preliminaryMultiply));
        }
    }
}
