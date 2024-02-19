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
    }
}
