package it.academy.yuliyaabramovitch;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
    public static final int MAX_INT = 2147483647;
    public static final int MIN_INT = -2147483648;
    public static final int ERROR_VALUE = 0;
    public static final double DELTA = 0.000001;
    public static final String REGEX_INT = "^[-+]{0,1}\\d{1,}$";
    public static final String ERROR = "Неверный формат данных. Выражение не может быть обработано!";

    public static int getValue(BigInteger number) {
        if ((number.compareTo(BigInteger.valueOf(Util.MAX_INT)) > 0) || (number.compareTo(BigInteger.valueOf(Util.MIN_INT)) < 0)) {
            return Util.ERROR_VALUE;
        } else {
            return number.intValue();
        }
    }

    public static Boolean isStringCanBeParsedAsInt(String str) {
        Boolean canBeParsedAsInt = false;
        Pattern pattern = Pattern.compile(REGEX_INT);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            canBeParsedAsInt = true;
        }
        return canBeParsedAsInt;
    }
}
