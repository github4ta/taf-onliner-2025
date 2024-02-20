package it.academy.viktoryiapazhydayeva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorStringsTest {

    @DisplayName("Strings-sum: Positive integers")
    public void testSumPositiveStrings() {
        Assertions.assertEquals("2510", Calculator.sumStrings("1505", "1005"));
    }

    @Test
    @DisplayName("Strings-sum: Negative integers")
    public void testSumNegativeStrings() {
        Assertions.assertEquals("-278", Calculator.sumStrings("-1", "-277"));
    }

    @Test
    @DisplayName("Strings-sum: positive and negative integers")
    public void testSumMixedStrings() {
        Assertions.assertEquals("-94", Calculator.sumStrings("-104", "10"));
    }

    @Test
    @DisplayName("Strings-sum: zero and positive integer")
    public void testSumZeroPositiveStrings() {
        Assertions.assertEquals("541", Calculator.sumStrings("0", "541"));
    }

    @Test
    @DisplayName("Strings-sum: zero and negative integer")
    public void testSumZeroNegativeStrings() {
        Assertions.assertEquals("-17", Calculator.sumStrings("-17", "0"));
    }

    @Test
    @DisplayName("Strings-sum: null string")
    public void testSumNullStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.sumStrings("", "10"));
    }

    // + string ==null  Add test
    @Test
    @DisplayName("Strings-sum: incorrect data format") // strings
    public void testSumIncorrectDataStrings() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Calculator.sumStrings("Test12", "0"));
    }

    @Test
    @DisplayName("Strings-sum: Max allowed value of integer sum")
    public void testMaxSumStrings() {
        Assertions.assertEquals("2147483647", Calculator.sumStrings("2147483624", "23"));
    }

    @Test
    @DisplayName("Strings-sum: Max allowed value of integer sum is out or range")    // LEAVE AS IS
    public void testMaxSumExceededStrings() {
        Assertions.assertEquals("2147483647", Calculator.sumStrings("1", "2147483647"));
    }

    @Test
    @DisplayName("Strings-sum: Min allowed value of integer sum")
    public void testMinSumStrings() {
        Assertions.assertEquals("-2147483648", Calculator.sumStrings("-2147483600", "-48"));
    }

    @Test
    @DisplayName("Strings-sum: Min allowed value of integer sum is out of range")   // LEAVE AS IS
    public void testMinSumExceededStrings() {
        Assertions.assertEquals("-2147483648", Calculator.sumStrings("-2147483600", "-200"));
    }
}
