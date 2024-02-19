package it.academy.olyaabramovich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSumWithIntNumbers() {
        int sum = Calculator.calculateSum(1, 100);
        Assertions.assertEquals(101, sum);
    }

    @Test
    public void testSumWithIntNegativeNumber() {
        int sum = Calculator.calculateSum(-1 , -10000);
        Assertions.assertEquals(-10001, sum);
    }

    @Test
    public void testSumWithIntZero() {
        int sum = Calculator.calculateSum(0, 2147483647);
        Assertions.assertEquals(2147483647, sum);
    }

    @Test
    public void testSumWithIntOutOfBounds()  {
        int sum = Calculator.calculateSum(1, 2147483647);
        Assertions.assertEquals(0, sum);

    }

    @Test
    public void testSumWithDoubleNumbers() {
        double sum = Calculator.calculateSum(1.1111, 10.1234);
        Assertions.assertEquals(11.2345, sum);
    }

    @Test
    public void testSumWithDoubleNegativeNumber() {
        double sum = Calculator.calculateSum(10.5 , -16.4);
        Assertions.assertEquals(-5.9, sum);
    }

    @Test
    public void testSumWithDoubleNegativeNumbers() {
        double sum = Calculator.calculateSum(-1.0 , -51.2);
        Assertions.assertEquals(-52.2, sum);
    }

    @Test
    public void testSumWithDoubleZero() {
        double sum = Calculator.calculateSum(0.001, 0.0);
        Assertions.assertEquals(0.001, sum);
    }
}
