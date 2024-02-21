package it.academy.maksimnovikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @DisplayName("Sum two int positive numbers")
    @Test
    public void testCalculatorSumTwoIntPositiveNumbers() {
        Assertions.assertEquals(6, Calculator.sum(2, 4));
    }

    @DisplayName("Sum two int negative numbers")
    @Test
    public void testCalculatorSumTwoIntNegativeNumbers() {
        Assertions.assertEquals(-4, Calculator.sum(-2, -2));
    }

    @DisplayName("Sum two int positive and negative numbers")
    @Test
    public void testCalculatorSumTwoIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(20, Calculator.sum(-20, 40));
    }

    @DisplayName("Sum two int positive number and zero")
    @Test
    public void testCalculatorSumTwoIntPositiveNumberAndZero() {
        Assertions.assertEquals(2147483647, Calculator.sum(0, 2147483647));
    }

    @DisplayName("Sum two int negative number and zero")
    @Test
    public void testCalculatorSumTwoIntNegativeNumberAndZero() {
        Assertions.assertEquals(-2147483648, Calculator.sum(0, -2147483648));
    }

    @DisplayName("Sum two double positive numbers")
    @Test
    public void testCalculatorSumTwoDoublePositiveNumbers() {
        Assertions.assertEquals(5.30, Calculator.sum(2.15, 3.15));
    }

    @DisplayName("Sum two double negative numbers")
    @Test
    public void testCalculatorSumTwoDoubleNegativeNumbers() {
        Assertions.assertEquals(-5.5, Calculator.sum(-2.25, -3.25));
    }

    @DisplayName("Sum two double positive and negative numbers")
    @Test
    public void testCalculatorSumTwoDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(2.01, Calculator.sum(-2.01, 4.02));
    }

    @DisplayName("Sum two double positive number and zero")
    @Test
    public void testCalculatorSumTwoDoublePositiveNumberAndZero() {
        Assertions.assertEquals(2.147, Calculator.sum(0.0, 2.147));
    }

    @DisplayName("Sum two double negative number and zero")
    @Test
    public void testCalculatorSumTwoDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(-2.147, Calculator.sum(0.0, -2.147));
    }

    @DisplayName("Sum int and double positive numbers")
    @Test
    public void testCalculatorSumIntAndDoublePositiveNumbers() {
        Assertions.assertEquals(5.15, Calculator.sum(2, 3.15));
    }

    @DisplayName("Sum int and double negative numbers")
    @Test
    public void testCalculatorSumIntAndDoubleNegativeNumbers() {
        Assertions.assertEquals(-5.225, Calculator.sum(-2, -3.225));
    }

    @DisplayName("Sum int and double positive and negative numbers")
    @Test
    public void testCalculatorSumIntAndDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(-5.445, Calculator.sum(-10, 4.555));
    }

    @DisplayName("Sum int and double positive number and zero")
    @Test
    public void testCalculatorSumIntAndDoublePositiveNumberAndZero() {
        Assertions.assertEquals(0.225, Calculator.sum(0, 0.225));
    }

    @DisplayName("Sum int and double negative number and zero")
    @Test
    public void testCalculatorSumIntAndDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(-2.111, Calculator.sum(0, -2.111));
    }

    @DisplayName("Sum double and int positive numbers")
    @Test
    public void testCalculatorSumDoubleAndIntPositiveNumbers() {
        Assertions.assertEquals(6.15, Calculator.sum(2.15, 4));
    }

    @DisplayName("Sum double and int negative numbers")
    @Test
    public void testCalculatorSumDoubleAndIntNegativeNumbers() {
        Assertions.assertEquals(-7.5, Calculator.sum(-2.5, -5));
    }

    @DisplayName("Sum double and int positive and negative numbers")
    @Test
    public void testCalculatorSumDoubleAndIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(2.5, Calculator.sum(4.5, -2));
    }

    @DisplayName("Sum double and int positive number and zero")
    @Test
    public void testCalculatorSumDoubleAndIntPositiveNumberAndZero() {
        Assertions.assertEquals(2147483647, Calculator.sum(0.0, 2147483647));
    }

    @DisplayName("Sum double and int negative number and zero")
    @Test
    public void testCalculatorSumDoubleAndIntNegativeNumberAndZero() {
        Assertions.assertEquals(-2147483648, Calculator.sum(0.0, -2147483648));
    }

    @DisplayName("Sum string integer positive numbers")
    @Test
    public void testCalculatorSumStringIntegerPositiveNumbers() {
        Assertions.assertEquals("6", Calculator.sum("2", "4"));
    }

    @DisplayName("Sum string integer negative numbers")
    @Test
    public void testCalculatorSumStringIntegerNegativeNumbers() {
        Assertions.assertEquals("-7", Calculator.sum("-2", "-5"));
    }

    @DisplayName("Sum string integer positive and negative numbers")
    @Test
    public void testCalculatorSumStringIntegerPositiveAndNegativeNumbers() {
        Assertions.assertEquals("-3", Calculator.sum("2", "-5"));
    }

    @DisplayName("Sum string integer positive number and zero")
    @Test
    public void testCalculatorSumStringIntegerPositiveNumberAndZero() {
        Assertions.assertEquals("10000000000000000000000000000000000", Calculator.sum("0", "10000000000000000000000000000000000"));
    }

    @DisplayName("Sum string integer negative number and zero")
    @Test
    public void testCalculatorSumStringIntegerNegativeNumberAndZero() {
        Assertions.assertEquals("-10000000000000000000000000000000000", Calculator.sum("0", "-10000000000000000000000000000000000"));
    }

    @DisplayName("Sum string decimal positive numbers")
    @Test
    public void testCalculatorSumStringDecimalPositiveNumbers() {
        Assertions.assertEquals("6.700", Calculator.sum("2.5", "4.2"));
    }

    @DisplayName("Sum string decimal negative numbers")
    @Test
    public void testCalculatorSumStringDecimalNegativeNumbers() {
        Assertions.assertEquals("-7.700", Calculator.sum("-2.5", "-5.2"));
    }

    @DisplayName("Sum string decimal positive and negative numbers")
    @Test
    public void testCalculatorSumStringDecimalPositiveAndNegativeNumbers() {
        Assertions.assertEquals("-3.100", Calculator.sum("2.2", "-5.3"));
    }

    @DisplayName("Sum string decimal positive number and zero")
    @Test
    public void testCalculatorSumStringDecimalPositiveNumberAndZero() {
        Assertions.assertEquals("0.100", Calculator.sum("0.0", "0.100"));
    }

    @DisplayName("Sum string decimal negative number and zero")
    @Test
    public void testCalculatorSumStringDecimalNegativeNumberAndZero() {
        Assertions.assertEquals("-0.123", Calculator.sum("0.0", "-0.123"));
    }

    @DisplayName("Sum string decimal incorrect number")
    @Test
    public void testSumStringIncorrectNumber() {
        Assertions.assertEquals("Enter the correct number", Calculator.sum("FF1234", "12"));
    }

    @DisplayName("Sum string decimal empty string")
    @Test
    public void testSumStringEmptyString() {
        Assertions.assertEquals("Enter the correct number", Calculator.sum("", ""));
    }

    @DisplayName("Subtract two int positive numbers")
    @Test
    public void testCalculatorSubtractTwoIntPositiveNumbers() {
        Assertions.assertEquals(6, Calculator.subtract(12, 6));
    }

    @DisplayName("Subtract two int negative numbers")
    @Test
    public void testCalculatorSubtractTwoIntNegativeNumbers() {
        Assertions.assertEquals(1, Calculator.subtract(-2, -3));
    }

    @DisplayName("Subtract two int positive and negative numbers")
    @Test
    public void testCalculatorSubtractTwoIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(60, Calculator.subtract(20, -40));
    }

    @DisplayName("Subtract two int positive number and zero")
    @Test
    public void testCalculatorSubtractTwoIntPositiveNumberAndZero() {
        Assertions.assertEquals(-2147483647, Calculator.subtract(0, 2147483647));
    }

    @DisplayName("Subtract two int negative number and zero")
    @Test
    public void testCalculatorSubtractTwoIntNegativeNumberAndZero() {
        Assertions.assertEquals(2147483647, Calculator.subtract(0, -2147483647));
    }

    @DisplayName("Subtract two double positive numbers")
    @Test
    public void testCalculatorSubtractTwoDoublePositiveNumbers() {
        Assertions.assertEquals(1, Calculator.subtract(4.15, 3.15));
    }

    @DisplayName("Subtract two double negative numbers")
    @Test
    public void testCalculatorSubtractTwoDoubleNegativeNumbers() {
        Assertions.assertEquals(1, Calculator.subtract(-2.5, -3.5));
    }

    @DisplayName("Subtract two double positive and negative numbers")
    @Test
    public void testCalculatorSubtractTwoDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(-7, Calculator.subtract(-2.5, 4.5));
    }

    @DisplayName("Subtract two double positive number and zero")
    @Test
    public void testCalculatorSubtractTwoDoublePositiveNumberAndZero() {
        Assertions.assertEquals(-2.123, Calculator.subtract(0.0, 2.123));
    }

    @DisplayName("Subtract two double negative number and zero")
    @Test
    public void testCalculatorSubtractTwoDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(2.123, Calculator.subtract(0.0, -2.123));
    }

    @DisplayName("Subtract int and double positive numbers")
    @Test
    public void testCalculatorSubtractIntAndDoublePositiveNumbers() {
        Assertions.assertEquals(2.5, Calculator.subtract(5, 2.5));
    }

    @DisplayName("Subtract int and double negative numbers")
    @Test
    public void testCalculatorSubtractIntAndDoubleNegativeNumbers() {
        Assertions.assertEquals(0.5, Calculator.subtract(-2, -2.5));
    }

    @DisplayName("Subtract int and double positive and negative numbers")
    @Test
    public void testCalculatorSubtractIntAndDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(-11.5, Calculator.subtract(-10, 1.5));
    }

    @DisplayName("Subtract int and double positive number and zero")
    @Test
    public void testCalculatorSubtractIntAndDoublePositiveNumberAndZero() {
        Assertions.assertEquals(-0.5, Calculator.subtract(0, 0.5));
    }

    @DisplayName("Subtract int and double negative number and zero")
    @Test
    public void testCalculatorSubtractIntAndDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(2.5, Calculator.subtract(0, -2.5));
    }

    @DisplayName("Subtract double and int positive numbers")
    @Test
    public void testCalculatorSubtractDoubleAndIntPositiveNumbers() {
        Assertions.assertEquals(2.5, Calculator.subtract(4.5, 2));
    }

    @DisplayName("Subtract double and int negative numbers")
    @Test
    public void testCalculatorSubtractDoubleAndIntNegativeNumbers() {
        Assertions.assertEquals(-2.5, Calculator.subtract(-5, -2.5));
    }

    @DisplayName("Subtract double and int positive and negative numbers")
    @Test
    public void testCalculatorSubtractDoubleAndIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(6.5, Calculator.subtract(4, -2.5));
    }

    @DisplayName("Subtract double and int positive number and zero")
    @Test
    public void testCalculatorSubtractDoubleAndIntPositiveNumberAndZero() {
        Assertions.assertEquals(-1.5, Calculator.subtract(0, 1.5));
    }

    @DisplayName("Subtract double and int negative number and zero")
    @Test
    public void testCalculatorSubtractDoubleAndIntNegativeNumberAndZero() {
        Assertions.assertEquals(-2.5, Calculator.subtract(-2.5, 0));
    }

    @DisplayName("Subtract string integer positive numbers")
    @Test
    public void testCalculatorSubtractStringIntegerPositiveNumbers() {
        Assertions.assertEquals("-2", Calculator.subtract("2", "4"));
    }

    @DisplayName("Subtract string integer negative numbers")
    @Test
    public void testCalculatorSubtractStringIntegerNegativeNumbers() {
        Assertions.assertEquals("-10", Calculator.subtract("-20", "-10"));
    }

    @DisplayName("Subtract string integer positive and negative numbers")
    @Test
    public void testCalculatorSubtractStringIntegerPositiveAndNegativeNumbers() {
        Assertions.assertEquals("150", Calculator.subtract("100", "-50"));
    }

    @DisplayName("Subtract string integer positive number and zero")
    @Test
    public void testCalculatorSubtractStringIntegerPositiveNumberAndZero() {
        Assertions.assertEquals("-10000000000000000000000000000000000", Calculator.subtract("0", "10000000000000000000000000000000000"));
    }

    @DisplayName("Subtract string integer negative number and zero")
    @Test
    public void testCalculatorSubtractStringIntegerNegativeNumberAndZero() {
        Assertions.assertEquals("10000000000000000000000000000000000", Calculator.subtract("0", "-10000000000000000000000000000000000"));
    }

    @DisplayName("Subtract string decimal positive numbers")
    @Test
    public void testCalculatorSubtractStringDecimalPositiveNumbers() {
        Assertions.assertEquals("0.000", Calculator.subtract("5.5", "5.5"));
    }

    @DisplayName("Subtract string decimal negative numbers")
    @Test
    public void testCalculatorSubtractStringDecimalNegativeNumbers() {
        Assertions.assertEquals("3.000", Calculator.subtract("-2.5", "-5.5"));
    }

    @DisplayName("Subtract string decimal positive and negative numbers")
    @Test
    public void testCalculatorSubtractStringDecimalPositiveAndNegativeNumbers() {
        Assertions.assertEquals("0.200", Calculator.subtract("3.5", "3.3"));
    }

    @DisplayName("Subtract string decimal positive number and zero")
    @Test
    public void testCalculatorSubtractStringDecimalPositiveNumberAndZero() {
        Assertions.assertEquals("-5.500", Calculator.subtract("0.0", "5.5"));
    }

    @DisplayName("Subtract string decimal negative number and zero")
    @Test
    public void testCalculatorSubtractStringDecimalNegativeNumberAndZero() {
        Assertions.assertEquals("5.500", Calculator.subtract("0.0", "-5.5"));
    }

    @DisplayName("Subtract string incorrect number")
    @Test
    public void testSubtractStringIncorrectNumber() {
        Assertions.assertEquals("Enter the correct number", Calculator.subtract("FF1234", "12"));
    }

    @DisplayName("Subtract string empty string")
    @Test
    public void testSubtractStringEmptyString() {
        Assertions.assertEquals("Enter the correct number", Calculator.subtract("", ""));
    }

    @DisplayName("Multiply two int positive numbers")
    @Test
    public void testCalculatorMultiplyTwoIntPositiveNumbers() {
        Assertions.assertEquals(36, Calculator.multiply(6, 6));
    }

    @DisplayName("Multiply two int negative numbers")
    @Test
    public void testCalculatorMultiplyTwoIntNegativeNumbers() {
        Assertions.assertEquals(4, Calculator.multiply(-2, -2));
    }

    @DisplayName("Multiply two int positive and negative numbers")
    @Test
    public void testCalculatorMultiplyTwoIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(-8, Calculator.multiply(2, -4));
    }

    @DisplayName("Multiply two int positive number and zero")
    @Test
    public void testCalculatorMultiplyTwoIntPositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(0, 2));
    }

    @DisplayName("Multiply two int negative number and zero")
    @Test
    public void testCalculatorMultiplyTwoIntNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(0, -2));
    }

    @DisplayName("Multiply two double positive numbers")
    @Test
    public void testCalculatorMultiplyTwoDoublePositiveNumbers() {
        Assertions.assertEquals(2.25, Calculator.multiply(1.5, 1.5));
    }

    @DisplayName("Multiply two double negative numbers")
    @Test
    public void testCalculatorMultiplyTwoDoubleNegativeNumbers() {
        Assertions.assertEquals(2.25, Calculator.multiply(-1.5, -1.5));
    }

    @DisplayName("Multiply two double positive and negative numbers")
    @Test
    public void testCalculatorMultiplyTwoDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(-2.25, Calculator.multiply(-1.5, 1.5));
    }

    @DisplayName("Multiply two double positive number and zero")
    @Test
    public void testCalculatorMultiplyTwoDoublePositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(0.0, 2.1));
    }

    @DisplayName("Multiply two double negative number and zero")
    @Test
    public void testCalculatorMultiplyTwoDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(0.0, -2.1));
    }

    @DisplayName("Multiply int and double positive numbers")
    @Test
    public void testCalculatorMultiplyIntAndDoublePositiveNumbers() {
        Assertions.assertEquals(5, Calculator.multiply(2, 2.5));
    }

    @DisplayName("Multiply int and double negative numbers")
    @Test
    public void testCalculatorMultiplyIntAndDoubleNegativeNumbers() {
        Assertions.assertEquals(5, Calculator.multiply(-2, -2.5));
    }

    @DisplayName("Multiply int and double positive and negative numbers")
    @Test
    public void testCalculatorMultiplyIntAndDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(-15, Calculator.multiply(-10, 1.5));
    }

    @DisplayName("Multiply int and double positive number and zero")
    @Test
    public void testCalculatorMultiplyIntAndDoublePositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(0, 0.5));
    }

    @DisplayName("Multiply int and double negative number and zero")
    @Test
    public void testCalculatorMultiplyIntAndDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(0, -2.5));
    }

    @DisplayName("Multiply double and int positive numbers")
    @Test
    public void testCalculatorMultiplyDoubleAndIntPositiveNumbers() {
        Assertions.assertEquals(9, Calculator.multiply(4.5, 2));
    }

    @DisplayName("Multiply double and int negative numbers")
    @Test
    public void testCalculatorMultiplyDoubleAndIntNegativeNumbers() {
        Assertions.assertEquals(5, Calculator.multiply(-2.5, -2));
    }

    @DisplayName("Multiply double and int positive and negative numbers")
    @Test
    public void testCalculatorMultiplyDoubleAndIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(-25, Calculator.multiply(-2.5, 10));
    }

    @DisplayName("Multiply double and int positive number and zero")
    @Test
    public void testCalculatorMultiplyDoubleAndIntPositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(1.5, 0));
    }

    @DisplayName("Multiply double and int negative number and zero")
    @Test
    public void testCalculatorMultiplyDoubleAndIntNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.multiply(-2.5, 0));
    }

    @DisplayName("Multiply string integer positive numbers")
    @Test
    public void testCalculatorMultiplyStringIntegerPositiveNumbers() {
        Assertions.assertEquals("200", Calculator.multiply("2", "100"));
    }

    @DisplayName("Multiply string integer negative numbers")
    @Test
    public void testCalculatorMultiplyStringIntegerNegativeNumbers() {
        Assertions.assertEquals("2000", Calculator.multiply("-20", "-100"));
    }

    @DisplayName("Multiply string integer positive and negative numbers")
    @Test
    public void testCalculatorMultiplyStringIntegerPositiveAndNegativeNumbers() {
        Assertions.assertEquals("-5000", Calculator.multiply("100", "-50"));
    }

    @DisplayName("Multiply string integer positive number and zero")
    @Test
    public void testCalculatorMultiplyStringIntegerPositiveNumberAndZero() {
        Assertions.assertEquals("0", Calculator.multiply("0", "10000000000000000000000000000000000"));
    }

    @DisplayName("Multiply string integer negative number and zero")
    @Test
    public void testCalculatorMultiplyStringIntegerNegativeNumberAndZero() {
        Assertions.assertEquals("0", Calculator.multiply("0", "-10000000000000000000000000000000000"));
    }

    @DisplayName("Multiply string decimal positive numbers")
    @Test
    public void testCalculatorMultiplyStringDecimalPositiveNumbers() {
        Assertions.assertEquals("30.250", Calculator.multiply("5.5", "5.5"));
    }

    @DisplayName("Multiply string decimal negative numbers")
    @Test
    public void testCalculatorMultiplyStringDecimalNegativeNumbers() {
        Assertions.assertEquals("2.250", Calculator.multiply("-1.5", "-1.5"));
    }

    @DisplayName("Multiply string decimal positive and negative numbers")
    @Test
    public void testCalculatorMultiplyStringDecimalPositiveAndNegativeNumbers() {
        Assertions.assertEquals("2.250", Calculator.multiply("1.5", "1.5"));
    }

    @DisplayName("Multiply string decimal positive number and zero")
    @Test
    public void testCalculatorMultiplyStringDecimalPositiveNumberAndZero() {
        Assertions.assertEquals("0.000", Calculator.multiply("0.0", "5.5"));
    }

    @DisplayName("Multiply string decimal negative number and zero")
    @Test
    public void testCalculatorMultiplyStringDecimalNegativeNumberAndZero() {
        Assertions.assertEquals("0.000", Calculator.multiply("0.0", "-0.2"));
    }

    @DisplayName("Multiply string incorrect number")
    @Test
    public void testMultiplyStringIncorrectNumber() {
        Assertions.assertEquals("Enter the correct number", Calculator.multiply("FF1234", "12"));
    }

    @DisplayName("Multiply string empty string")
    @Test
    public void testMultiplyStringEmptyString() {
        Assertions.assertEquals("Enter the correct number", Calculator.multiply("", ""));
    }

    @DisplayName("Divide two int positive numbers")
    @Test
    public void testCalculatorDivideTwoIntPositiveNumbers() {
        Assertions.assertEquals(6, Calculator.divide(36, 6));
    }

    @DisplayName("Divide two int negative numbers")
    @Test
    public void testCalculatorDivideTwoIntNegativeNumbers() {
        Assertions.assertEquals(2, Calculator.divide(-10, -5));
    }

    @DisplayName("Divide two int positive and negative numbers")
    @Test
    public void testCalculatorDivideTwoIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(-2, Calculator.divide(8, -4));
    }

    @DisplayName("Divide two int positive number and zero")
    @Test
    public void testCalculatorDivideTwoIntPositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0, 2));
    }

    @DisplayName("Divide two int negative number and zero")
    @Test
    public void testCalculatorDivideTwoIntNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0, -2));
    }

    @DisplayName("Divide two double positive numbers")
    @Test
    public void testCalculatorDivideTwoDoublePositiveNumbers() {
        Assertions.assertEquals(1, Calculator.divide(1.5, 1.5));
    }

    @DisplayName("Divide two double negative numbers")
    @Test
    public void testCalculatorDivideTwoDoubleNegativeNumbers() {
        Assertions.assertEquals(1, Calculator.divide(-1.5, -1.5));
    }

    @DisplayName("Divide two double positive and negative numbers")
    @Test
    public void testCalculatorDivideTwoDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(-1.136, Calculator.divide(-2.5, 2.2));
    }

    @DisplayName("Divide two double positive number and zero")
    @Test
    public void testCalculatorDivideTwoDoublePositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0.0, 2.1));
    }

    @DisplayName("Divide two double negative number and zero")
    @Test
    public void testCalculatorDivideTwoDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0.0, -2.1));
    }

    @DisplayName("Divide int and double positive numbers")
    @Test
    public void testCalculatorDivideIntAndDoublePositiveNumbers() {
        Assertions.assertEquals(0.909, Calculator.divide(5, 5.5));
    }

    @DisplayName("Divide int and double negative numbers")
    @Test
    public void testCalculatorDivideIntAndDoubleNegativeNumbers() {
        Assertions.assertEquals(0.909, Calculator.divide(-5, -5.5));
    }

    @DisplayName("Divide int and double positive and negative numbers")
    @Test
    public void testCalculatorDivideIntAndDoublePositiveAndNegativeNumbers() {
        Assertions.assertEquals(-1, Calculator.divide(-1.5, 1.5));
    }

    @DisplayName("Divide int and double positive number and zero")
    @Test
    public void testCalculatorDivideIntAndDoublePositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0, 0.5));
    }

    @DisplayName("Divide int and double negative number and zero")
    @Test
    public void testCalculatorDivideIntAndDoubleNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0, -2.5));
    }

    @DisplayName("Divide double and int positive numbers")
    @Test
    public void testCalculatorDivideDoubleAndIntPositiveNumbers() {
        Assertions.assertEquals(2.25, Calculator.divide(4.5, 2));
    }

    @DisplayName("Divide double and int negative numbers")
    @Test
    public void testCalculatorDivideDoubleAndIntNegativeNumbers() {
        Assertions.assertEquals(2.25, Calculator.divide(-4.5, -2));
    }

    @DisplayName("Divide double and int positive and negative numbers")
    @Test
    public void testCalculatorDivideDoubleAndIntPositiveAndNegativeNumbers() {
        Assertions.assertEquals(-2.75, Calculator.divide(5.5, -2));
    }

    @DisplayName("Divide double and int positive number and zero")
    @Test
    public void testCalculatorDivideDoubleAndIntPositiveNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0.0, 2));
    }

    @DisplayName("Divide double and int negative number and zero")
    @Test
    public void testCalculatorDivideDoubleAndIntNegativeNumberAndZero() {
        Assertions.assertEquals(0, Calculator.divide(0.0, -4));
    }

    @DisplayName("Divide string integer positive numbers")
    @Test
    public void testCalculatorDivideStringIntegerPositiveNumbers() {
        Assertions.assertEquals("2", Calculator.divide("200", "100"));
    }

    @DisplayName("Divide string integer negative numbers")
    @Test
    public void testCalculatorDivideStringIntegerNegativeNumbers() {
        Assertions.assertEquals("2", Calculator.divide("-200", "-100"));
    }

    @DisplayName("Divide string integer positive and negative numbers")
    @Test
    public void testCalculatorDivideStringIntegerPositiveAndNegativeNumbers() {
        Assertions.assertEquals("-5", Calculator.divide("500", "-100"));
    }

    @DisplayName("Divide string integer positive number and zero")
    @Test
    public void testCalculatorDivideStringIntegerPositiveNumberAndZero() {
        Assertions.assertEquals("0", Calculator.divide("0", "1"));
    }

    @DisplayName("Divide string integer negative number and zero")
    @Test
    public void testCalculatorDivideStringIntegerNegativeNumberAndZero() {
        Assertions.assertEquals("0", Calculator.divide("0", "-1"));
    }

    @DisplayName("Divide string decimal positive numbers")
    @Test
    public void testCalculatorDivideStringDecimalPositiveNumbers() {
        Assertions.assertEquals("2.200", Calculator.divide("5.5", "2.5"));
    }

    @DisplayName("Divide string decimal negative numbers")
    @Test
    public void testCalculatorDivideStringDecimalNegativeNumbers() {
        Assertions.assertEquals("1.000", Calculator.divide("-1.5", "-1.5"));
    }

    @DisplayName("Divide string decimal positive and negative numbers")
    @Test
    public void testCalculatorDivideStringDecimalPositiveAndNegativeNumbers() {
        Assertions.assertEquals("1.000", Calculator.divide("1.5", "1.5"));
    }

    @DisplayName("Divide string decimal positive number and zero")
    @Test
    public void testCalculatorDivideStringDecimalPositiveNumberAndZero() {
        Assertions.assertEquals("0.000", Calculator.divide("0.0", "5.5"));
    }

    @DisplayName("Divide string decimal negative number and zero")
    @Test
    public void testCalculatorDivideStringDecimalNegativeNumberAndZero() {
        Assertions.assertEquals("0.000", Calculator.divide("0.0", "-0.2"));
    }

    @DisplayName("Divide string incorrect number")
    @Test
    public void testDecimalStringIncorrectNumber() {
        Assertions.assertEquals("Enter the correct number", Calculator.divide("FF1234", "12"));
    }

    @DisplayName("Divide string empty string")
    @Test
    public void testDecimalStringEmptyString() {
        Assertions.assertEquals("Enter the correct number", Calculator.divide("", ""));
    }

    @DisplayName("Divide string decimal by zero")
    @Test
    public void testDecimalDivideByZero() {
        Assertions.assertEquals("Divide by zero is impossible", Calculator.divide("1.2", "0.0"));
    }

    @DisplayName("Divide string integer by zero")
    @Test
    public void testIntegerDivideByZero() {
        Assertions.assertEquals("Divide by zero is impossible", Calculator.divide("100", "0"));
    }
}
