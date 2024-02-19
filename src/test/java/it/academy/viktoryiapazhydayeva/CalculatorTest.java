package it.academy.viktoryiapazhydayeva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // INTEGERS SUM
    @Test
    @DisplayName("Integers-sum: positive digits")
    public void testSumPositiveIntegers() {
        Assertions.assertEquals(27, Calculator.sumIntegers(11, 16));
    }

    @Test
    @DisplayName("Integers-sum: negative digits")
    public void testSumNegativeIntegers() {
        Assertions.assertEquals(-75, Calculator.sumIntegers(-12, -63));
    }

    @Test
    @DisplayName("Integers-sum: negative and positive digits")
    public void testSumMixedIntegers() {
        Assertions.assertEquals(8, Calculator.sumIntegers(-12, 20));
    }

    @Test
    @DisplayName("Integers-sum: zero and positive digit")
    public void testSumZeroPositiveIntegers() {
        Assertions.assertEquals(11, Calculator.sumIntegers(0, 11));
    }

    @Test
    @DisplayName("Integers-sum: zero and negative digit")
    public void testSumZeroNegativeIntegers() {
        Assertions.assertEquals(-77, Calculator.sumIntegers(-77, 0));
    }

    @Test
    @DisplayName("Integers-sum: Max allowed value of integer sum")
    public void testMaxSumIntegers() {
        Assertions.assertEquals(2147483647, Calculator.sumIntegers(2147483612, 35));
    }

    @Test
    @DisplayName("Integers-sum: Max allowed value of integer sum is out or range")   // REFACTOR: ADD MESSAGE EXCEPTION ?!
    public void testMaxSumExceededIntegers() {
        Assertions.assertEquals(2147483647, Calculator.sumIntegers(637, 2147483011));
    }

    @Test
    @DisplayName("Integers-sum: Min allowed value of integer sum")
    public void testMinSumIntegers() {
        Assertions.assertEquals(-2147483648, Calculator.sumIntegers(-82000, -2147401648));
    }

    @Test
    @DisplayName("Integers-sum: Min allowed value of integer sum is out of range")  // REFACTOR: ADD MESSAGE EXCEPTION ?!
    public void testMinSumExceededIntegers() {
        Assertions.assertEquals(-2147483648, Calculator.sumIntegers(-2147483648, -1));
    }
}
