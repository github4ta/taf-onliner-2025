package it.academy.olyaabramovich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // сложение 2 чисел типа int
    @Test
    public void testSumWithIntNumbers() {
        int sum = Calculator.calculateSum(1, 100);
        Assertions.assertEquals(101, sum);
    }

    @Test
    public void testSumWithIntNegativeNumber() {
        int sum = Calculator.calculateSum(-1, -10000);
        Assertions.assertEquals(-10001, sum);
    }

    @Test
    public void testSumWithIntZero() {
        int sum = Calculator.calculateSum(0, 2147483647);
        Assertions.assertEquals(2147483647, sum);
    }

    @Test
    public void testSumWithIntOutOfPositiveBounds() {
        int sum = Calculator.calculateSum(1, 2147483647);
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void testSumWithIntOutOfNegativeBounds() {
        int sum = Calculator.calculateSum(-1, -2147483648);
        Assertions.assertEquals(0, sum);
    }


    // сложение 2 чисел типа double
    @Test
    public void testSumWithDoubleNumbers() {
        double sum = Calculator.calculateSum(1.1111, 10.1234);
        Assertions.assertEquals(11.2345, sum);
    }

    @Test
    public void testSumWithDoubleNegativeNumber() {
        double sum = Calculator.calculateSum(10.5, -16.45);
        Assertions.assertEquals(-5.95, sum);
    }

    @Test
    public void testSumWithDoubleNegativeNumbers() {
        double sum = Calculator.calculateSum(-1.0, -51.222);
        Assertions.assertEquals(-52.222, sum);
    }

    @Test
    public void testSumWithDoubleZero() {
        double sum = Calculator.calculateSum(0.001, 0.0);
        Assertions.assertEquals(0.001, sum);
    }

    // сложение чисел int + double
    @Test
    public void testSumWithIntDouble() {
        double sum = Calculator.calculateSum(1, 5.234);
        Assertions.assertEquals(6.234, sum);
    }

    @Test
    public void testSumWithIntDoubleNegativeNumber() {
        double sum = Calculator.calculateSum(-5, 2.2);
        Assertions.assertEquals(-2.8, sum);
    }

    @Test
    public void testSumWithIntDoubleNegativeNumbers() {
        double sum = Calculator.calculateSum(-5, -2);
        Assertions.assertEquals(-7, sum);
    }

    @Test
    public void testSumWithIntDoubleZero() {
        double sum = Calculator.calculateSum(1, 0.0);
        Assertions.assertEquals(1, sum);
    }

    // сложение чисел double + int
    @Test
    public void testSumWithDoubleInt() {
        double sum = Calculator.calculateSum(10.01, 1);
        Assertions.assertEquals(11.01, sum);
    }

    @Test
    public void testSumWithDoubleIntNegativeNumber() {
        double sum = Calculator.calculateSum(1.24, -4);
        Assertions.assertEquals(-2.76, sum);
    }

    @Test
    public void testSumWithDoubleIntNegativeNumbers() {
        double sum = Calculator.calculateSum(-7.7, -20);
        Assertions.assertEquals(-27.7, sum);
    }

    @Test
    public void testSumWithDoubleIntZero() {
        double sum = Calculator.calculateSum(1.2, 0);
        Assertions.assertEquals(1.2, sum);
    }

    // разница 2 чисел int
    @Test
    public void testSubtractionWithIntNumbers() {
        int diff = Calculator.calculateSubtraction(7, 20);
        Assertions.assertEquals(-13, diff);
    }

    @Test
    public void testSubtractionWithIntNegativeNumber() {
        int diff = Calculator.calculateSubtraction(1, -50);
        Assertions.assertEquals(51, diff);
    }

    @Test
    public void testSubtractionWithIntNegativeNumbers() {
        int diff = Calculator.calculateSubtraction(-15, -45);
        Assertions.assertEquals(30, diff);
    }

    @Test
    public void testSubtractionWithIntZero() {
        int diff = Calculator.calculateSubtraction(100, 0);
        Assertions.assertEquals(100, diff);
    }

    @Test
    public void testSubtractionWithIntOutOfPositiveBounds() {
        int diff = Calculator.calculateSubtraction(2147483647, -1);
        Assertions.assertEquals(0, diff);
    }

    @Test
    public void testSubtractionWithIntOutOfNegativeBounds() {
        int diff = Calculator.calculateSubtraction(-2147483648, 1);
        Assertions.assertEquals(0, diff);
    }

    // разница 2 чисел типа double
    @Test
    public void testSubtractionWithDoubleNumbers() {
        double diff = Calculator.calculateSubtraction(1.54, 3.67);
        Assertions.assertEquals(-2.13, diff);
    }

    @Test
    public void testSubtractionWithDoubleNegativeNumber() {
        double diff = Calculator.calculateSubtraction(-8.1, 20.0);
        Assertions.assertEquals(-28.1, diff);
    }

    @Test
    public void testSubtractionWithDoubleNegativeNumbers() {
        double diff = Calculator.calculateSubtraction(-1.1234, -2.97);
        Assertions.assertEquals(1.8466, diff);
    }

    @Test
    public void testSubtractionWithDoubleZero() {
        double diff = Calculator.calculateSubtraction(-8.8, 0.0);
        Assertions.assertEquals(-8.8, diff);
    }


}
