package it.academy.yuliyaabramovitch;

import java.math.BigInteger;

public class Util {
    public static final int MAX_INT = 2147483647;
    public static final int MIN_INT = -2147483648;
    public static final int ERROR_VALUE = 0;
    public static final double DELTA = 0.000001;

    public static int getValue(BigInteger number) {
        if ((number.compareTo(BigInteger.valueOf(Util.MAX_INT)) > 0) || (number.compareTo(BigInteger.valueOf(Util.MIN_INT)) < 0)) {
            return Util.ERROR_VALUE;
        } else {
            return number.intValue();
        }
    }
}
