package it.academy.viktoryiapazhydayeva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    /**
     * int (int, int)
     */
    @Test
    @DisplayName("Integers-sum: positive digits")
    public void testSumPositiveIntegers() {
        Assertions.assertEquals(27, Calculator.add(11, 16));
    }

    @Test
    @DisplayName("Integers-sum: negative digits")
    public void testSumNegativeIntegers() {
        Assertions.assertEquals(-75, Calculator.add(-12, -63));
    }

    @Test
    @DisplayName("Integers-sum: negative and positive digits")
    public void testSumMixedIntegers() {
        Assertions.assertEquals(8, Calculator.add(-12, 20));
    }

    @Test
    @DisplayName("Integers-sum: zero and positive digit")
    public void testSumZeroPositiveIntegers() {
        Assertions.assertEquals(11, Calculator.add(0, 11));
    }

    @Test
    @DisplayName("Integers-sum: zero and negative digit")
    public void testSumZeroNegativeIntegers() {
        Assertions.assertEquals(-77, Calculator.add(-77, 0));
    }

    @Test
    @DisplayName("Integers-sum: Max allowed value of integer sum")
    public void testMaxSumIntegers() {
        Assertions.assertEquals(Integer.MAX_VALUE, Calculator.add(2147483612, 35));
    }

    @Test
    @DisplayName("Integers-sum: Max allowed value of integer sum is out or range")
    public void testMaxSumExceededIntegers() {
        Assertions.assertEquals(2147483647, Calculator.add(637, 2147483011));
    }

    @Test
    @DisplayName("Integers-sum: Min allowed value of integer sum")
    public void testMinSumIntegers() {
        Assertions.assertEquals(Integer.MIN_VALUE, Calculator.add(-82000, -2147401648));
    }

    @Test
    @DisplayName("Integers-sum: Min allowed value of integer sum is out of range")
    public void testMinSumExceededIntegers() {
        Assertions.assertEquals(-2147483648, Calculator.add(-2147483648, -1));
    }

    // INTEGERS SUBTRACT
    @Test
    @DisplayName("Integers-subtraction: Positive integers")
    public void testSubtractionPositiveIntegers() {
        Assertions.assertEquals(-96, Calculator.subtract(20, 116));
    }

    // INTEGERS MULTIPLY
    @Test
    @DisplayName("Integers-multiply: Positive and negative integers")
    public void testMultiplicationPositiveNegativeIntegers() {
        Assertions.assertEquals(-180, Calculator.multiply(-15, 12));
    }

    // INTEGERS DIVIDE
    @Test
    @DisplayName("Integers-divide: Positive integer/0")
    public void testDivisionByZeroIntegers() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(7, 0));
    }

    /**
     * String (String, String)
     */
    @Test
    @DisplayName("Strings-sum: Positive integers")
    public void testSumPositiveStrings() {
        Assertions.assertEquals("2510", Calculator.add("1505", "1005"));
    }

    @Test
    @DisplayName("Strings-sum: Negative integers")
    public void testSumNegativeStrings() {
        Assertions.assertEquals("-278", Calculator.add("-1", "-277"));
    }

    @Test
    @DisplayName("Strings-sum: positive and negative integers")
    public void testSumMixedStrings() {
        Assertions.assertEquals("-94", Calculator.add("-104", "10"));
    }

    @Test
    @DisplayName("Strings-sum: zero and positive integer")
    public void testSumZeroPositiveStrings() {
        Assertions.assertEquals("541", Calculator.add("0", "541"));
    }

    @Test
    @DisplayName("Strings-sum: zero and negative integer")
    public void testSumZeroNegativeStrings() {
        Assertions.assertEquals("-17", Calculator.add("-17", "0"));
    }

    @Test
    @DisplayName("Strings-sum: empty string")
    public void testSumNullStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.add("", "10"));
    }

    @Test
    @DisplayName("Strings-sum: incorrect data format (input = null)")
    public void testSumInputString() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.add("1524", null));
    }

    @Test
    @DisplayName("Strings-sum: incorrect data format (input = String)")
    public void testSumIncorrectDataStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.add("Test12", "1815982"));
    }

    @Test
    @DisplayName("Strings-sum: Max allowed value of integer sum")
    public void testMaxSumStrings() {
        Assertions.assertEquals("2147483647", Calculator.add("2147483624", "23"));
    }

    @Test
    @DisplayName("Strings-sum: Max allowed value of integer sum is out or range")
    public void testMaxSumExceededStrings() {
        Assertions.assertEquals("2147483647", Calculator.add("1", "2147483647"));
    }

    @Test
    @DisplayName("Strings-sum: Min allowed value of integer sum")
    public void testMinSumStrings() {
        Assertions.assertEquals("-2147483648", Calculator.add("-2147483600", "-48"));
    }

    @Test
    @DisplayName("Strings-sum: Min allowed value of integer sum is out of range")
    public void testMinSumExceededStrings() {
        Assertions.assertEquals("-2147483648", Calculator.add("-2147483600", "-200"));
    }

    @Test
    @DisplayName("Strings-subtract: equals integers")
    public void testZeroSubtractionStrings() {
        Assertions.assertEquals("0", Calculator.subtract("4", "4"));
    }

    @Test
    @DisplayName("Strings-subtract: empty string")
    public void testSubtractionEmptyStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.subtract("", "7"));
    }

    @Test
    @DisplayName("Strings-subtract: incorrect data format (String exceeded Max integer)")
    public void testSubtractionMaxExceededStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.subtract("2", "214748360"));
    }

    @Test
    @DisplayName("Strings-multiply: Max integer*0")
    public void testZeroMultiplicationStrings() {
        Assertions.assertEquals("0", Calculator.multiply("2147483647", "0"));
    }

    @Test
    @DisplayName("String- multiply: negative*negative")
    public void testMultiplicationNegativeStrings() {
        Assertions.assertEquals("2147483646", Calculator.multiply("-357913941", "-6"));
    }

    @Test
    @DisplayName("String- multiply: incorrect data format (input = String)")
    public void testMultiplicationStringStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.add("325", "18i"));
    }

    @Test
    @DisplayName("String-divide: Negative integer/0")
    public void testDivisionByZeroStrings() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide("-74", "0"));
    }

    @Test
    @DisplayName("String-divide: positive/positive (odd numbers)")
    public void testDivisionPositiveStrings() {
        Assertions.assertEquals("2", Calculator.divide("7", "3"));
    }

    @Test
    @DisplayName("String-divide: positive/positive (even numbers)")
    public void testDivisionPositiveNegativeStrings() {
        Assertions.assertEquals("-2", Calculator.divide("24", "-12"));
    }

    /**
     * double (double, double)
     */
    @Test
    @DisplayName("Double double- sum: positive digits")
    public void testSumPositiveDigitsDoubleDouble() {
        Assertions.assertEquals(25.123, Calculator.add(22.10, 3.023));
    }

    @Test
    @DisplayName("Double double- sum: max + min")
    public void testSumDoubleDouble() {
        Assertions.assertEquals(1.7976931348623157E308, Calculator.subtract(Double.MAX_VALUE, Double.MIN_VALUE));
    }

    @Test
    @DisplayName("Double double- subtract: positive - negative")
    public void testSubtractionDoubleDpuble() {
        Assertions.assertEquals(200.246, Calculator.subtract(100.123, -100.123));
    }

    @Test
    @DisplayName("Double, double- multiply: Min double * 0")
    public void testZeroMultiplicationDoubleDouble() {
        Assertions.assertEquals(0.0, Calculator.multiply(Double.MIN_VALUE, 0.0));
    }

    @Test
    @DisplayName("Double, double- divide: Positive number/0.0")
    public void testDivisionByZeroDoubleDouble() {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(12.2, 0.0));
    }

    @Test
    @DisplayName("Double, double- divide: 0.0/negative number")
    public void testDivisionZeroDoubleDouble() {
        Assertions.assertEquals(-0.0, Calculator.divide(0.0, -14.2587));
    }

    @Test
    @DisplayName("Double, double- divide: Negative number/0.0")
    public void testDivisionByNegativeZeroDoubleDouble() {
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, Calculator.divide(-1874.2369, 0.0));
    }

    /**
     * String (int, double)
     */
    @Test
    @DisplayName("Int, double: sum positive numbers")
    public void testSumPositiveIntDouble() {
        Assertions.assertEquals(30.123, Calculator.add(11, 19.123));
    }

    @Test
    @DisplayName("Int, double: subtract Min double")
    public void testSubtractionIntDouble() {
        Assertions.assertEquals(1.0, Calculator.subtract(1, Double.MIN_VALUE));
    }

    @Test
    @DisplayName("Int, double: multiply negative numbers with delta")
    public void testMultiplicationIntDouble() {
        Assertions.assertEquals(41.979, Calculator.multiply(-2, -20.9892585), 0.001);
    }

    @Test
    @DisplayName("Int, double: int/0.0")
    public void testDivisionByZeroIntDouble() {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(5, 0.00));
    }

    /**
     * String (double, int)
     */
    @Test
    @DisplayName("Double, int: sum Mim Double + Max Integer ")
    public void testSumMinDoubleMaxInt() {
        Assertions.assertEquals(2.147483647E9, Calculator.add(Double.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("Double, int: subtract with delta")
    public void testSubtractionDoubleInt() {
        Assertions.assertEquals(100.0, Calculator.subtract(100.999, 1), 0.1);
    }

    @Test
    @DisplayName("Double, int: multiply double * Max Integer")
    public void testMultiplicationDoubleInt() {
        Assertions.assertEquals(21474.836470000002, Calculator.multiply(0.00001, Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("Double, int: division by 0")
    public void testZeroDivisionDoubleInt() {
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, Calculator.divide(-2.1, 0));
    }
}
