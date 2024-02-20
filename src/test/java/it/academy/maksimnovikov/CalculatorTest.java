package it.academy.maksimnovikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
        @Test
        public void testCalculatorSumTwoIntPositiveNumbers() {
            int expected = 6;
            Assertions.assertEquals(expected, Calculator.sum(2, 4));
        }

        @Test
        public void testCalculatorSumTwoIntNegativeNumbers() {
            int expected = -4;
            Assertions.assertEquals(expected, Calculator.sum(-2, -2));
        }

        @Test
        public void testCalculatorSumTwoIntPositiveAndNegativeNumbers() {
            int expected = 20;
            Assertions.assertEquals(expected, Calculator.sum(-20, 40));
        }

        @Test
        public void testCalculatorSumTwoIntPositiveNumberAndZero() {
            int expected = 2147483647;
            Assertions.assertEquals(expected, Calculator.sum(0, 2147483647));
        }

        @Test
        public void testCalculatorSumTwoIntNegativeNumberAndZero() {
            int expected = -2147483648;
            Assertions.assertEquals(expected, Calculator.sum(0, -2147483648));
        }

        @Test
        public void testCalculatorSumTwoDoublePositiveNumbers() {
            double expected = 5.30;
            Assertions.assertEquals(expected, Calculator.sum(2.15, 3.15));
        }

        @Test
        public void testCalculatorSumTwoDoubleNegativeNumbers() {
            double expected = -5.5;
            Assertions.assertEquals(expected, Calculator.sum(-2.25, -3.25));
        }

        @Test
        public void testCalculatorSumTwoDoublePositiveAndNegativeNumbers() {
            double expected = 2.01;
            Assertions.assertEquals(expected, Calculator.sum(-2.01, 4.02));
        }

        @Test
        public void testCalculatorSumTwoDoublePositiveNumberAndZero() {
            double expected = 2.147;
            Assertions.assertEquals(expected, Calculator.sum(0.0, 2.147));
        }

        @Test
        public void testCalculatorSumTwoDoubleNegativeNumberAndZero() {
            double expected = -2.147;
            Assertions.assertEquals(expected, Calculator.sum(0.0, -2.147));
        }

        @Test
        public void testCalculatorSumIntAndDoublePositiveNumbers() {
            double expected = 5.15;
            Assertions.assertEquals(expected, Calculator.sum(2, 3.15));
        }

        @Test
        public void testCalculatorSumIntAndDoubleNegativeNumbers() {
            double expected = -5.225;
            Assertions.assertEquals(expected, Calculator.sum(-2, -3.225));
        }

        @Test
        public void testCalculatorSumIntAndDoublePositiveAndNegativeNumbers() {
            double expected = -5.445;
            Assertions.assertEquals(expected, Calculator.sum(-10, 4.555));
        }

        @Test
        public void testCalculatorSumIntAndDoublePositiveNumberAndZero() {
            double expected = 0.225;
            Assertions.assertEquals(expected, Calculator.sum(0, 0.225));
        }

        @Test
        public void testCalculatorSumIntAndDoubleNegativeNumberAndZero() {
            double expected = -2.111;
            Assertions.assertEquals(expected, Calculator.sum(0, -2.111));
        }

        @Test
        public void testCalculatorSumDoubleAndIntPositiveNumbers() {
            double expected = 6.15;
            Assertions.assertEquals(expected, Calculator.sum(2.15, 4));
        }

        @Test
        public void testCalculatorSumDoubleAndIntNegativeNumbers() {
            double expected = -7.5;
            Assertions.assertEquals(expected, Calculator.sum(-2.5, -5));
        }

        @Test
        public void testCalculatorSumDoubleAndIntPositiveAndNegativeNumbers() {
            double expected = 2.5;
            Assertions.assertEquals(expected, Calculator.sum(4.5, -2));
        }

        @Test
        public void testCalculatorSumDoubleAndIntPositiveNumberAndZero() {
            double expected = 2147483647;
            Assertions.assertEquals(expected, Calculator.sum(0.0, 2147483647));
        }

        @Test
        public void testCalculatorSumDoubleAndIntNegativeNumberAndZero() {
            double expected = -2147483648;
            Assertions.assertEquals(expected, Calculator.sum(0.0, -2147483648));
        }

        @Test
        public void testCalculatorSumStringIntegerPositiveNumbers() {
            String expected = "6";
            Assertions.assertEquals(expected, Calculator.sum("2", "4"));
        }

        @Test
        public void testCalculatorSumStringIntegerNegativeNumbers() {
            String expected = "-7";
            Assertions.assertEquals(expected, Calculator.sum("-2", "-5"));
        }

        @Test
        public void testCalculatorSumStringIntegerPositiveAndNegativeNumbers() {
            String expected = "-3";
            Assertions.assertEquals(expected, Calculator.sum("2", "-5"));
        }

        @Test
        public void testCalculatorSumStringIntegerPositiveNumberAndZero() {
            String expected = "10000000000000000000000000000000000";
            Assertions.assertEquals(expected, Calculator.sum("0", "10000000000000000000000000000000000"));
        }

        @Test
        public void testCalculatorSumStringIntegerNegativeNumberAndZero() {
            String expected = "-10000000000000000000000000000000000";
            Assertions.assertEquals(expected, Calculator.sum("0", "-10000000000000000000000000000000000"));
        }

        @Test
        public void testCalculatorSumStringDecimalPositiveNumbers() {
            String expected = "6.700";
            Assertions.assertEquals(expected, Calculator.sum("2.5", "4.2"));
        }

        @Test
        public void testCalculatorSumStringDecimalNegativeNumbers() {
            String expected = "-7.700";
            Assertions.assertEquals(expected, Calculator.sum("-2.5", "-5.2"));
        }

        @Test
        public void testCalculatorSumStringDecimalPositiveAndNegativeNumbers() {
            String expected = "-3.100";
            Assertions.assertEquals(expected, Calculator.sum("2.2", "-5.3"));
        }

        @Test
        public void testCalculatorSumStringDecimalPositiveNumberAndZero() {
            String expected = "0.100";
            Assertions.assertEquals(expected, Calculator.sum("0.0", "0.100"));
        }

        @Test
        public void testCalculatorSumStringDecimalNegativeNumberAndZero() {
            String expected = "-0.123";
            Assertions.assertEquals(expected, Calculator.sum("0.0", "-0.123"));
        }

        @Test
        public void testSumStringIncorrectNumber() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.sum("FF1234", "12"));
        }

        @Test
        public void testSumStringEmptyString() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.sum("", ""));
        }

        @Test
        public void testCalculatorSubtractTwoIntPositiveNumbers() {
            int expected = 6;
            Assertions.assertEquals(expected, Calculator.subtract(12, 6));
        }

        @Test
        public void testCalculatorSubtractTwoIntNegativeNumbers() {
            int expected = 1;
            Assertions.assertEquals(expected, Calculator.subtract(-2, -3));
        }

        @Test
        public void testCalculatorSubtractTwoIntPositiveAndNegativeNumbers() {
            int expected = 60;
            Assertions.assertEquals(expected, Calculator.subtract(20, -40));
        }

        @Test
        public void testCalculatorSubtractTwoIntPositiveNumberAndZero() {
            int expected = -2147483647;
            Assertions.assertEquals(expected, Calculator.subtract(0, 2147483647));
        }

        @Test
        public void testCalculatorSubtractTwoIntNegativeNumberAndZero() {
            int expected = 2147483647;
            Assertions.assertEquals(expected, Calculator.subtract(0, -2147483647));
        }

        @Test
        public void testCalculatorSubtractTwoDoublePositiveNumbers() {
            double expected = 1;
            Assertions.assertEquals(expected, Calculator.subtract(4.15, 3.15));
        }

        @Test
        public void testCalculatorSubtractTwoDoubleNegativeNumbers() {
            double expected = 1;
            Assertions.assertEquals(expected, Calculator.subtract(-2.5, -3.5));
        }

        @Test
        public void testCalculatorSubtractTwoDoublePositiveAndNegativeNumbers() {
            double expected = -7;
            Assertions.assertEquals(expected, Calculator.subtract(-2.5, 4.5));
        }

        @Test
        public void testCalculatorSubtractTwoDoublePositiveNumberAndZero() {
            double expected = -2.123;
            Assertions.assertEquals(expected, Calculator.subtract(0.0, 2.123));
        }

        @Test
        public void testCalculatorSubtractTwoDoubleNegativeNumberAndZero() {
            double expected = 2.123;
            Assertions.assertEquals(expected, Calculator.subtract(0.0, -2.123));
        }

        @Test
        public void testCalculatorSubtractIntAndDoublePositiveNumbers() {
            double expected = 2.5;
            Assertions.assertEquals(expected, Calculator.subtract(5, 2.5));
        }

        @Test
        public void testCalculatorSubtractIntAndDoubleNegativeNumbers() {
            double expected = 0.5;
            Assertions.assertEquals(expected, Calculator.subtract(-2, -2.5));
        }

        @Test
        public void testCalculatorSubtractIntAndDoublePositiveAndNegativeNumbers() {
            double expected = -11.5;
            Assertions.assertEquals(expected, Calculator.subtract(-10, 1.5));
        }

        @Test
        public void testCalculatorSubtractIntAndDoublePositiveNumberAndZero() {
            double expected = -0.5;
            Assertions.assertEquals(expected, Calculator.subtract(0, 0.5));
        }

        @Test
        public void testCalculatorSubtractIntAndDoubleNegativeNumberAndZero() {
            double expected = 2.5;
            Assertions.assertEquals(expected, Calculator.subtract(0, -2.5));
        }

        @Test
        public void testCalculatorSubtractDoubleAndIntPositiveNumbers() {
            double expected = 2.5;
            Assertions.assertEquals(expected, Calculator.subtract(4.5, 2));
        }

        @Test
        public void testCalculatorSubtractDoubleAndIntNegativeNumbers() {
            double expected = -2.5;
            Assertions.assertEquals(expected, Calculator.subtract(-5, -2.5));
        }

        @Test
        public void testCalculatorSubtractDoubleAndIntPositiveAndNegativeNumbers() {
            double expected = 6.5;
            Assertions.assertEquals(expected, Calculator.subtract(4, -2.5));
        }

        @Test
        public void testCalculatorSubtractDoubleAndIntPositiveNumberAndZero() {
            double expected = -1.5;
            Assertions.assertEquals(expected, Calculator.subtract(0, 1.5));
        }

        @Test
        public void testCalculatorSubtractDoubleAndIntNegativeNumberAndZero() {
            double expected = -2.5;
            Assertions.assertEquals(expected, Calculator.subtract(-2.5, 0));
        }

        @Test
        public void testCalculatorSubtractStringIntegerPositiveNumbers() {
            String expected = "-2";
            Assertions.assertEquals(expected, Calculator.subtract("2", "4"));
        }

        @Test
        public void testCalculatorSubtractStringIntegerNegativeNumbers() {
            String expected = "-10";
            Assertions.assertEquals(expected, Calculator.subtract("-20", "-10"));
        }

        @Test
        public void testCalculatorSubtractStringIntegerPositiveAndNegativeNumbers() {
            String expected = "150";
            Assertions.assertEquals(expected, Calculator.subtract("100", "-50"));
        }

        @Test
        public void testCalculatorSubtractStringIntegerPositiveNumberAndZero() {
            String expected = "-10000000000000000000000000000000000";
            Assertions.assertEquals(expected, Calculator.subtract("0", "10000000000000000000000000000000000"));
        }

        @Test
        public void testCalculatorSubtractStringIntegerNegativeNumberAndZero() {
            String expected = "10000000000000000000000000000000000";
            Assertions.assertEquals(expected, Calculator.subtract("0", "-10000000000000000000000000000000000"));
        }

        @Test
        public void testCalculatorSubtractStringDecimalPositiveNumbers() {
            String expected = "0.000";
            Assertions.assertEquals(expected, Calculator.subtract("5.5", "5.5"));
        }

        @Test
        public void testCalculatorSubtractStringDecimalNegativeNumbers() {
            String expected = "3.000";
            Assertions.assertEquals(expected, Calculator.subtract("-2.5", "-5.5"));
        }

        @Test
        public void testCalculatorSubtractStringDecimalPositiveAndNegativeNumbers() {
            String expected = "0.200";
            Assertions.assertEquals(expected, Calculator.subtract("3.5", "3.3"));
        }

        @Test
        public void testCalculatorSubtractStringDecimalPositiveNumberAndZero() {
            String expected = "-5.500";
            Assertions.assertEquals(expected, Calculator.subtract("0.0", "5.5"));
        }

        @Test
        public void testCalculatorSubtractStringDecimalNegativeNumberAndZero() {
            String expected = "5.500";
            Assertions.assertEquals(expected, Calculator.subtract("0.0", "-5.5"));
        }

        @Test
        public void testSubtractStringIncorrectNumber() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.subtract("FF1234", "12"));
        }

        @Test
        public void testSubtractStringEmptyString() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.subtract("", ""));
        }

        @Test
        public void testCalculatorMultiplyTwoIntPositiveNumbers() {
            int expected = 36;
            Assertions.assertEquals(expected, Calculator.multiply(6, 6));
        }

        @Test
        public void testCalculatorMultiplyTwoIntNegativeNumbers() {
            int expected = 4;
            Assertions.assertEquals(expected, Calculator.multiply(-2, -2));
        }

        @Test
        public void testCalculatorMultiplyTwoIntPositiveAndNegativeNumbers() {
            int expected = -8;
            Assertions.assertEquals(expected, Calculator.multiply(2, -4));
        }

        @Test
        public void testCalculatorMultiplyTwoIntPositiveNumberAndZero() {
            int expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(0, 2));
        }

        @Test
        public void testCalculatorMultiplyTwoIntNegativeNumberAndZero() {
            int expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(0, -2));
        }

        @Test
        public void testCalculatorMultiplyTwoDoublePositiveNumbers() {
            double expected = 2.25;
            Assertions.assertEquals(expected, Calculator.multiply(1.5, 1.5));
        }

        @Test
        public void testCalculatorMultiplyTwoDoubleNegativeNumbers() {
            double expected = 2.25;
            Assertions.assertEquals(expected, Calculator.multiply(-1.5, -1.5));
        }

        @Test
        public void testCalculatorMultiplyTwoDoublePositiveAndNegativeNumbers() {
            double expected = -2.25;
            Assertions.assertEquals(expected, Calculator.multiply(-1.5, 1.5));
        }

        @Test
        public void testCalculatorMultiplyTwoDoublePositiveNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(0.0, 2.1));
        }

        @Test
        public void testCalculatorMultiplyTwoDoubleNegativeNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(0.0, -2.1));
        }

        @Test
        public void testCalculatorMultiplyIntAndDoublePositiveNumbers() {
            double expected = 5;
            Assertions.assertEquals(expected, Calculator.multiply(2, 2.5));
        }

        @Test
        public void testCalculatorMultiplyIntAndDoubleNegativeNumbers() {
            double expected = 5;
            Assertions.assertEquals(expected, Calculator.multiply(-2, -2.5));
        }

        @Test
        public void testCalculatorMultiplyIntAndDoublePositiveAndNegativeNumbers() {
            double expected = -15;
            Assertions.assertEquals(expected, Calculator.multiply(-10, 1.5));
        }

        @Test
        public void testCalculatorMultiplyIntAndDoublePositiveNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(0, 0.5));
        }

        @Test
        public void testCalculatorMultiplyIntAndDoubleNegativeNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(0, -2.5));
        }

        @Test
        public void testCalculatorMultiplyDoubleAndIntPositiveNumbers() {
            double expected = 9;
            Assertions.assertEquals(expected, Calculator.multiply(4.5, 2));
        }

        @Test
        public void testCalculatorMultiplyDoubleAndIntNegativeNumbers() {
            double expected = 5;
            Assertions.assertEquals(expected, Calculator.multiply(-2.5, -2));
        }

        @Test
        public void testCalculatorMultiplyDoubleAndIntPositiveAndNegativeNumbers() {
            double expected = -25;
            Assertions.assertEquals(expected, Calculator.multiply(-2.5, 10));
        }

        @Test
        public void testCalculatorMultiplyDoubleAndIntPositiveNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(1.5, 0));
        }

        @Test
        public void testCalculatorMultiplyDoubleAndIntNegativeNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.multiply(-2.5, 0));
        }

        @Test
        public void testCalculatorMultiplyStringIntegerPositiveNumbers() {
            String expected = "200";
            Assertions.assertEquals(expected, Calculator.multiply("2", "100"));
        }

        @Test
        public void testCalculatorMultiplyStringIntegerNegativeNumbers() {
            String expected = "2000";
            Assertions.assertEquals(expected, Calculator.multiply("-20", "-100"));
        }

        @Test
        public void testCalculatorMultiplyStringIntegerPositiveAndNegativeNumbers() {
            String expected = "-5000";
            Assertions.assertEquals(expected, Calculator.multiply("100", "-50"));
        }

        @Test
        public void testCalculatorMultiplyStringIntegerPositiveNumberAndZero() {
            String expected = "0";
            Assertions.assertEquals(expected, Calculator.multiply("0", "10000000000000000000000000000000000"));
        }

        @Test
        public void testCalculatorMultiplyStringIntegerNegativeNumberAndZero() {
            String expected = "0";
            Assertions.assertEquals(expected, Calculator.multiply("0", "-10000000000000000000000000000000000"));
        }

        @Test
        public void testCalculatorMultiplyStringDecimalPositiveNumbers() {
            String expected = "30.250";
            Assertions.assertEquals(expected, Calculator.multiply("5.5", "5.5"));
        }

        @Test
        public void testCalculatorMultiplyStringDecimalNegativeNumbers() {
            String expected = "2.250";
            Assertions.assertEquals(expected, Calculator.multiply("-1.5", "-1.5"));
        }

        @Test
        public void testCalculatorMultiplyStringDecimalPositiveAndNegativeNumbers() {
            String expected = "2.250";
            Assertions.assertEquals(expected, Calculator.multiply("1.5", "1.5"));
        }

        @Test
        public void testCalculatorMultiplyStringDecimalPositiveNumberAndZero() {
            String expected = "0.000";
            Assertions.assertEquals(expected, Calculator.multiply("0.0", "5.5"));
        }

        @Test
        public void testCalculatorMultiplyStringDecimalNegativeNumberAndZero() {
            String expected = "0.000";
            Assertions.assertEquals(expected, Calculator.multiply("0.0", "-0.2"));
        }

        @Test
        public void testMultiplytStringIncorrectNumber() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.multiply("FF1234", "12"));
        }

        @Test
        public void testMultiplyStringEmptyString() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.multiply("", ""));
        }

        @Test
        public void testCalculatorDivideTwoIntPositiveNumbers() {
            int expected = 6;
            Assertions.assertEquals(expected, Calculator.divide(36, 6));
        }

        @Test
        public void testCalculatorDivideTwoIntNegativeNumbers() {
            int expected = 2;
            Assertions.assertEquals(expected, Calculator.divide(-10, -5));
        }

        @Test
        public void testCalculatorDivideTwoIntPositiveAndNegativeNumbers() {
            int expected = -2;
            Assertions.assertEquals(expected, Calculator.divide(8, -4));
        }

        @Test
        public void testCalculatorDivideTwoIntPositiveNumberAndZero() {
            int expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0, 2));
        }

        @Test
        public void testCalculatorDivideTwoIntNegativeNumberAndZero() {
            int expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0, -2));
        }

        @Test
        public void testCalculatorDivideTwoDoublePositiveNumbers() {
            double expected = 1;
            Assertions.assertEquals(expected, Calculator.divide(1.5, 1.5));
        }

        @Test
        public void testCalculatorDivideTwoDoubleNegativeNumbers() {
            double expected = 1;
            Assertions.assertEquals(expected, Calculator.divide(-1.5, -1.5));
        }

        @Test
        public void testCalculatorDivideTwoDoublePositiveAndNegativeNumbers() {
            double expected = -1.136;
            Assertions.assertEquals(expected, Calculator.divide(-2.5, 2.2));
        }

        @Test
        public void testCalculatorDivideTwoDoublePositiveNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0.0, 2.1));
        }

        @Test
        public void testCalculatorDivideTwoDoubleNegativeNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0.0, -2.1));
        }

        @Test
        public void testCalculatorDivideIntAndDoublePositiveNumbers() {
            double expected = 0.909;
            Assertions.assertEquals(expected, Calculator.divide(5, 5.5));
        }

        @Test
        public void testCalculatorDivideIntAndDoubleNegativeNumbers() {
            double expected = 0.909;
            Assertions.assertEquals(expected, Calculator.divide(-5, -5.5));
        }

        @Test
        public void testCalculatorDivideIntAndDoublePositiveAndNegativeNumbers() {
            double expected = -1;
            Assertions.assertEquals(expected, Calculator.divide(-1.5, 1.5));
        }

        @Test
        public void testCalculatorDivideIntAndDoublePositiveNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0, 0.5));
        }

        @Test
        public void testCalculatorDivideIntAndDoubleNegativeNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0, -2.5));
        }

        @Test
        public void testCalculatorDivideDoubleAndIntPositiveNumbers() {
            double expected = 2.25;
            Assertions.assertEquals(expected, Calculator.divide(4.5, 2));
        }

        @Test
        public void testCalculatorDivideDoubleAndIntNegativeNumbers() {
            double expected = 2.25;
            Assertions.assertEquals(expected, Calculator.divide(-4.5, -2));
        }

        @Test
        public void testCalculatorDivideDoubleAndIntPositiveAndNegativeNumbers() {
            double expected = -2.75;
            Assertions.assertEquals(expected, Calculator.divide(5.5, -2));
        }

        @Test
        public void testCalculatorDivideDoubleAndIntPositiveNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0.0, 2));
        }

        @Test
        public void testCalculatorDivideDoubleAndIntNegativeNumberAndZero() {
            double expected = 0;
            Assertions.assertEquals(expected, Calculator.divide(0.0, -4));
        }

        @Test
        public void testCalculatorDivideStringIntegerPositiveNumbers() {
            String expected = "2";
            Assertions.assertEquals(expected, Calculator.divide("200", "100"));
        }

        @Test
        public void testCalculatorDivideStringIntegerNegativeNumbers() {
            String expected = "2";
            Assertions.assertEquals(expected, Calculator.divide("-200", "-100"));
        }

        @Test
        public void testCalculatorDivideStringIntegerPositiveAndNegativeNumbers() {
            String expected = "-5";
            Assertions.assertEquals(expected, Calculator.divide("500", "-100"));
        }

        @Test
        public void testCalculatorDivideStringIntegerPositiveNumberAndZero() {
            String expected = "0";
            Assertions.assertEquals(expected, Calculator.divide("0", "1"));
        }

        @Test
        public void testCalculatorDivideStringIntegerNegativeNumberAndZero() {
            String expected = "0";
            Assertions.assertEquals(expected, Calculator.divide("0", "-1"));
        }

        @Test
        public void testCalculatorDivideStringDecimalPositiveNumbers() {
            String expected = "2.200";
            Assertions.assertEquals(expected, Calculator.divide("5.5", "2.5"));
        }

        @Test
        public void testCalculatorDivideStringDecimalNegativeNumbers() {
            String expected = "1.000";
            Assertions.assertEquals(expected, Calculator.divide("-1.5", "-1.5"));
        }

        @Test
        public void testCalculatorDivideStringDecimalPositiveAndNegativeNumbers() {
            String expected = "1.000";
            Assertions.assertEquals(expected, Calculator.divide("1.5", "1.5"));
        }

        @Test
        public void testCalculatorDivideStringDecimalPositiveNumberAndZero() {
            String expected = "0.000";
            Assertions.assertEquals(expected, Calculator.divide("0.0", "5.5"));
        }

        @Test
        public void testCalculatorDivideStringDecimalNegativeNumberAndZero() {
            String expected = "0.000";
            Assertions.assertEquals(expected, Calculator.divide("0.0", "-0.2"));
        }

        @Test
        public void testDecimalStringIncorrectNumber() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.divide("FF1234", "12"));
        }

        @Test
        public void testDecimalStringEmptyString() {
            String expected = "Enter the correct number";
            Assertions.assertEquals(expected, Calculator.divide("", ""));
        }

        @Test
        public void testDecimalDivideByZero() {
            String expected = "Divide by zero is impossible";
            Assertions.assertEquals(expected, Calculator.divide("1.2", "0.0"));
        }

        @Test
        public void testIntegerDivideByZero() {
            String expected = "Divide by zero is impossible";
            Assertions.assertEquals(expected, Calculator.divide("100", "0"));
        }
}
