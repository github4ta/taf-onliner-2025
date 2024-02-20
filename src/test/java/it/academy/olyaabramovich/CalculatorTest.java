package it.academy.olyaabramovich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Сумма (int + int): 2 положительных чисел")
    public void testSumWithIntNumbers() {
        Assertions.assertEquals(101, Calculator.calculateSum(1, 100));
    }

    @Test
    @DisplayName("Сумма (int + int): 2 отрицательных числа")
    public void testSumWithIntNegativeNumber() {
        Assertions.assertEquals(-10001, Calculator.calculateSum(-1, -10000));
    }

    @Test
    @DisplayName("Сумма (int + int): целочисленное значение и 0")
    public void testSumWithIntZero() {
        Assertions.assertEquals(2147483647, Calculator.calculateSum(0, 2147483647));
    }

    @Test
    @DisplayName("Сумма (int + int): результат превышает положительное значение для типа int")
    public void testSumWithIntOutOfPositiveBounds() {
        Assertions.assertNull(Calculator.calculateSum(1, 2147483647));
    }

    @Test
    @DisplayName("Сумма (int + int): результат меньше отрицательного значения для типа int")
    public void testSumWithIntOutOfNegativeBounds() {
        Assertions.assertNull(Calculator.calculateSum(-1, -2147483648));
    }

    @Test
    @DisplayName("Сумма (double + double): 2 положительных числа")
    public void testSumWithDoubleNumbers() {
        Assertions.assertEquals(11.2345, Calculator.calculateSum(1.1111, 10.1234));
    }

    @Test
    @DisplayName("Сумма (double + double): 2 положительных числа")
    public void testSumWithDoubleNegativeNumber() {
        Assertions.assertEquals(-5.95, Calculator.calculateSum(10.5, -16.45));
    }

    @Test
    @DisplayName("Сумма (double + double): 2 отрицательных числа")
    public void testSumWithDoubleNegativeNumbers() {
        Assertions.assertEquals(-52.222, Calculator.calculateSum(-1.0, -51.222));
    }

    @Test
    @DisplayName("Сумма (double + double): число и 0")
    public void testSumWithDoubleZero() {
        Assertions.assertEquals(0.001, Calculator.calculateSum(0.001, 0.0));
    }

    @Test
    @DisplayName("Сумма (int + double): 2 положительных числа")
    public void testSumWithIntDouble() {
        Assertions.assertEquals(6.234, Calculator.calculateSum(1, 5.234));
    }

    @Test
    @DisplayName("Сумма (int + double): положительное число и отрицательное число")
    public void testSumWithIntDoubleNegativeNumber() {
        Assertions.assertEquals(-2.8, Calculator.calculateSum(-5, 2.2));
    }

    @Test
    @DisplayName("Сумма (int + double): 2 отрицательных числа")
    public void testSumWithIntDoubleNegativeNumbers() {
        Assertions.assertEquals(-7, Calculator.calculateSum(-5, -2.0));
    }

    @Test
    @DisplayName("Сумма (int + double): число и 0")
    public void testSumWithIntDoubleZero() {
        Assertions.assertEquals(1, Calculator.calculateSum(1, 0.0));
    }

    // сложение чисел double + int
    @Test
    @DisplayName("Сумма (double + int): 2 положительных числа")
    public void testSumWithDoubleInt() {
        Assertions.assertEquals(11.01, Calculator.calculateSum(10.01, 1));
    }

    @Test
    @DisplayName("Сумма (double + int): 2 положительное число и отрицательное число")
    public void testSumWithDoubleIntNegativeNumber() {
        Assertions.assertEquals(-2.76, Calculator.calculateSum(1.24, -4));
    }

    @Test
    @DisplayName("Сумма (double + int): 2 отрицательных числа")
    public void testSumWithDoubleIntNegativeNumbers() {
        Assertions.assertEquals(-27.7, Calculator.calculateSum(-7.7, -20));
    }

    @Test
    @DisplayName("Сумма (double + int): число и 0")
    public void testSumWithDoubleIntZero() {
        Assertions.assertEquals(1.2, Calculator.calculateSum(1.2, 0));
    }

    @Test
    @DisplayName("Разница (int + int): 2 положительных чисел")
    public void testSubtractionWithIntNumbers() {
        Assertions.assertEquals(-13, Calculator.calculateSubtraction(7, 20));
    }

    @Test
    @DisplayName("Разница (int + int): положительное число и отрицательное число")
    public void testSubtractionWithIntNegativeNumber() {
        Assertions.assertEquals(51, Calculator.calculateSubtraction(1, -50));
    }

    @Test
    @DisplayName("Разница (int + int): 2 отрицательных числа")
    public void testSubtractionWithIntNegativeNumbers() {
        Assertions.assertEquals(30, Calculator.calculateSubtraction(-15, -45));
    }

    @Test
    @DisplayName("Разница (int + int): число и 0")
    public void testSubtractionWithIntZero() {
        Assertions.assertEquals(100, Calculator.calculateSubtraction(100, 0));
    }

    @Test
    @DisplayName("Разница (int + int): результат превышает положительное значение для типа int")
    public void testSubtractionWithIntOutOfPositiveBounds() {
        Assertions.assertNull(Calculator.calculateSubtraction(2147483647, -1));
    }

    @Test
    @DisplayName("Разница (int + int): результат меньше отрицательного значения для типа int")
    public void testSubtractionWithIntOutOfNegativeBounds() {
        Assertions.assertNull(Calculator.calculateSubtraction(-2147483648, 1));
    }

    ///////////////////////////////////////////////////////
    @Test
    @DisplayName("Разница (double + double): 2 положительных числа")
    public void testSubtractionWithDoubleNumbers() {
        Assertions.assertEquals(-2.13, Calculator.calculateSubtraction(1.54, 3.67));
    }

    @Test
    @DisplayName("Разница (double + double): положительное число и отрицательное число")
    public void testSubtractionWithDoubleNegativeNumber() {
        Assertions.assertEquals(-28.1, Calculator.calculateSubtraction(-8.1, 20.0));
    }

    @Test
    @DisplayName("Разница (double + double): 2 отрицательных числа")
    public void testSubtractionWithDoubleNegativeNumbers() {
        Assertions.assertEquals(1.8466, Calculator.calculateSubtraction(-1.1234, -2.97));
    }

    @Test
    @DisplayName("Разница (double + double): число и 0")
    public void testSubtractionWithDoubleZero() {
        Assertions.assertEquals(-8.8, Calculator.calculateSubtraction(-8.8, 0.0));
    }

}