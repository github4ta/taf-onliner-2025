package it.academy.maksimnovikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Nested
    class TestCalculatorSum {
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
            double expected = -5.450222;
            Assertions.assertEquals(expected, Calculator.sum(-2.225111, -3.225111));
        }

        @Test
        public void testCalculatorSumTwoDoublePositiveAndNegativeNumbers() {
            double expected = 2.01;
            Assertions.assertEquals(expected, Calculator.sum(-2.01, 4.02));
        }

        @Test
        public void testCalculatorSumTwoDoublePositiveNumberAndZero() {
            double expected = 2.147483647;
            Assertions.assertEquals(expected, Calculator.sum(0.0, 2.147483647));
        }

        @Test
        public void testCalculatorSumTwoDoubleNegativeNumberAndZero() {
            double expected = -2.147483648;
            Assertions.assertEquals(expected, Calculator.sum(0.0, -2.147483648));
        }

        @Test
        public void testCalculatorSumIntAndDoublePositiveNumbers() {
            double expected = 5.15;
            Assertions.assertEquals(expected, Calculator.sum(2, 3.15));
        }

        @Test
        public void testCalculatorSumIntAndDoubleNegativeNumbers() {
            double expected = -5.225111;
            Assertions.assertEquals(expected, Calculator.sum(-2, -3.225111));
        }

        @Test
        public void testCalculatorSumIntAndDoublePositiveAndNegativeNumbers() {
            double expected = -5.975433;
            Assertions.assertEquals(expected, Calculator.sum(-10, 4.024567));
        }

        @Test
        public void testCalculatorSumIntAndDoublePositiveNumberAndZero() {
            double expected = 0.225555555555;
            Assertions.assertEquals(expected, Calculator.sum(0, 0.225555555555));
        }

        @Test
        public void testCalculatorSumIntAndDoubleNegativeNumberAndZero() {
            double expected = -2.11111111111;
            Assertions.assertEquals(expected, Calculator.sum(0, -2.11111111111));
        }
    }
}
