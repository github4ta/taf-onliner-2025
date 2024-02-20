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
    @DisplayName("Integers-sum: Max allowed value of integer sum is out or range")   // leave as is, remove
    public void testMaxSumExceededIntegers() {
        Assertions.assertEquals(2147483647, Calculator.add(637, 2147483011));
    }

    @Test
    @DisplayName("Integers-sum: Min allowed value of integer sum")
    public void testMinSumIntegers() {
        Assertions.assertEquals(Integer.MIN_VALUE, Calculator.add(-82000, -2147401648));
    }

    @Test
    @DisplayName("Integers-sum: Min allowed value of integer sum is out of range")  // leave as is, remove
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
    @DisplayName("Strings-sum: Max allowed value of integer sum is out or range")    // LEAVE AS IS
    public void testMaxSumExceededStrings() {
        Assertions.assertEquals("2147483647", Calculator.add("1", "2147483647"));
    }

    @Test
    @DisplayName("Strings-sum: Min allowed value of integer sum")
    public void testMinSumStrings() {
        Assertions.assertEquals("-2147483648", Calculator.add("-2147483600", "-48"));
    }

    @Test
    @DisplayName("Strings-sum: Min allowed value of integer sum is out of range")   // LEAVE AS IS
    public void testMinSumExceededStrings() {
        Assertions.assertEquals("-2147483648", Calculator.add("-2147483600", "-200"));
    }

    @Test
    @DisplayName("String-divide: Negative integer/0")
    public void testDivisionByZeroStrings() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide("-74", "0"));
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
    @DisplayName("Double, double- divide: Positive/0.0")
    public void testDivisionByZeroDoubleDouble() {
        Assertions.assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(12.2, 0.0));
    }

    @Test
    @DisplayName("Double, double- divide: 0.0/negative")
    public void testDivisionZeroDoubleDouble() {
        Assertions.assertEquals(-0.0, Calculator.divide(0.0, -14.2587));
    }

    @Test
    @DisplayName("Double, double- divide: Negative/0.0")
    public void testDivisionByNegativeZeroDoubleDouble() {
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, Calculator.divide(-1874.2369, 0.0));
    }
}
