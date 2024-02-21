package it.academy.olyaabramovich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static it.academy.olyaabramovich.Calculator.INT_MAX_VALUE;
import static it.academy.olyaabramovich.Calculator.INT_MIN_VALUE;

public class CalculatorTest {
    double delta = 0.00000001;

    @Test
    @DisplayName("Сумма (int + int): 2 положительных числа")
    public void testSumWithIntNumbers() {
        Assertions.assertEquals(101, Calculator.calculateSum(1, 100));
    }

    @Test
    @DisplayName("Сумма (int + int): 2 отрицательных числа")
    public void testSumWithIntNegativeNumber() {
        Assertions.assertEquals(-10001, Calculator.calculateSum(-1, -10000));
    }

    @Test
    @DisplayName("Сумма (int + int): число и 0")
    public void testSumWithIntZero() {
        Assertions.assertEquals(INT_MAX_VALUE, Calculator.calculateSum(0, INT_MAX_VALUE));
    }

    @Test
    @DisplayName("Сумма (int + int): результат в max границах типа int")
    public void testSumWithinPositiveBounds() {
        Assertions.assertEquals(INT_MAX_VALUE, Calculator.calculateSum(1, 2147483646));
    }

    @Test
    @DisplayName("Сумма (int + int): результат превышает положительное значение для типа int")
    public void testSumWithIntOutOfPositiveBounds() {
        Assertions.assertNull(Calculator.calculateSum(1, INT_MAX_VALUE));
    }

    @Test
    @DisplayName("Сумма (int + int): результат в min границах типа int")
    public void testSumWithinNegativeBounds() {
        Assertions.assertEquals(INT_MIN_VALUE, Calculator.calculateSum(-1, -2147483647));
    }

    @Test
    @DisplayName("Сумма (int + int): результат меньше отрицательного значения для типа int")
    public void testSumWithIntOutOfNegativeBounds() {
        Assertions.assertNull(Calculator.calculateSum(-1, INT_MIN_VALUE));
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
        Assertions.assertNull(Calculator.calculateSubtraction(INT_MAX_VALUE, -1));
    }

    @Test
    @DisplayName("Разница (int + int): результат меньше отрицательного значения для типа int")
    public void testSubtractionWithIntOutOfNegativeBounds() {
        Assertions.assertNull(Calculator.calculateSubtraction(INT_MIN_VALUE, 1));
    }

    @Test
    @DisplayName("Разница (int + int): результат в max границах типа int")
    public void testSubtractionWithinPositiveBounds() {
        Assertions.assertEquals(2147483647, Calculator.calculateSubtraction(INT_MAX_VALUE - 1, -1));
    }

    @Test
    @DisplayName("Разница (int + int): результат в min границах типа int")
    public void testSubtractionWithinNegativeBounds() {
        Assertions.assertEquals(-2147483648, Calculator.calculateSubtraction(INT_MIN_VALUE + 1, 1));
    }


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

    @Test
    @DisplayName("Разница (int + double): 2 положительных числа")
    public void testSubtractionWithIntDouble() {
        Assertions.assertEquals(-8.861, Calculator.calculateSubtraction(9, 17.861));
    }

    @Test
    @DisplayName("Разница (int + double): положительное число и отрицательное число")
    public void testSubtractionWithIntDoubleNegativeNumber() {
        Assertions.assertEquals(-102.2, Calculator.calculateSubtraction(-100, 2.2));
    }

    @Test
    @DisplayName("Разница (int + double): 2 отрицательных числа")
    public void testSubtractionWithIntDoubleNegativeNumbers() {
        Assertions.assertEquals(0, Calculator.calculateSubtraction(-1, -1.0));
    }

    @Test
    @DisplayName("Разница (int + double): число и 0")
    public void testSubtractionWithIntDoubleZero() {
        Assertions.assertEquals(100, Calculator.calculateSubtraction(100, 0.0));
    }

    @Test
    @DisplayName("Разница (double + int): 2 положительных числа")
    public void testSubtractionWithDoubleInt() {
        Assertions.assertEquals(-1.11, Calculator.calculateSubtraction(7.89, 9));
    }

    @Test
    @DisplayName("Разница (double + int): положительное число и отрицательное число")
    public void testSubtractionWithDoubleIntNegativeNumber() {
        Assertions.assertEquals(-34.2, Calculator.calculateSubtraction(-15.2, 19));
    }

    @Test
    @DisplayName("Разница (double + int): 2 отрицательных числа")
    public void testSubtractionWithDoubleIntNegativeNumbers() {
        Assertions.assertEquals(997.13, Calculator.calculateSubtraction(-1.87, -999));
    }

    @Test
    @DisplayName("Разница (double + int): число и 0")
    public void testSubtractionWithDoubleIntZero() {
        Assertions.assertEquals(-8.87, Calculator.calculateSubtraction(-8.87, 0.0));
    }

    @Test
    @DisplayName("Умножение (int + int): 2 положительных числа")
    public void testMultiplicationWithIntPositiveNumbers() {
        Assertions.assertEquals(33250, Calculator.calculateMultiplication(35, 950));
    }

    @Test
    @DisplayName("Умножение (int + int): положительное число и отрицательное число")
    public void testMultiplicationWithIntNegativeNumber() {
        Assertions.assertEquals(-400, Calculator.calculateMultiplication(40, -10));
    }

    @Test
    @DisplayName("Умножение (int + int): 2 отрицательных числа")
    public void testMultiplicationWithIntNegativeNumbers() {
        Assertions.assertEquals(18, Calculator.calculateMultiplication(-2, -9));
    }

    @Test
    @DisplayName("Умножение (int + int): число и 0")
    public void testMultiplicationWithIntZero() {
        Assertions.assertEquals(0, Calculator.calculateMultiplication(0, 8));
    }

    @Test
    @DisplayName("Умножение (int + int): результат ниже положительной границы типа int")
    public void testMultiplicationWithIntPositiveBounds() {
        Assertions.assertEquals(2147483646, Calculator.calculateMultiplication(2, 1073741823));
    }

    @Test
    @DisplayName("Умножение (int + int): минимальное значение типа int")
    public void testMultiplicationWithIntNegativeBounds() {
        Assertions.assertEquals(INT_MIN_VALUE, Calculator.calculateMultiplication(-2, 1073741824));
    }

    @Test
    @DisplayName("Умножение (int + int): результат превышает положительное значение для типа int")
    public void testMultiplicationWithIntOutOfPositiveBounds() {
        Assertions.assertNull(Calculator.calculateMultiplication(2, 1073741824));
    }

    @Test
    @DisplayName("Умножение (int + int): результат меньше отрицательного значения для типа int")
    public void testMultiplicationWithIntOutOfNegativeBounds() {
        Assertions.assertNull(Calculator.calculateMultiplication(-2, 1073741825));
    }

    @Test
    @DisplayName("Умножение (double + double): 2 положительных числа")
    public void testMultiplicationWithDoublePositiveNumbers() {
        Assertions.assertEquals(6.5453835, Calculator.calculateMultiplication(1.23, 5.32145), delta);
    }

    @Test
    @DisplayName("Умножение (double + double): положительное число и отрицательное число")
    public void testMultiplicationWithDoubleNegativeNumber() {
        Assertions.assertEquals(-2.85, Calculator.calculateMultiplication(-1.0, 2.85), delta);
    }

    @Test
    @DisplayName("Умножение (double + double): 2 отрицательных числа")
    public void testMultiplicationWithDoubleNegativeNumbers() {
        Assertions.assertEquals(2.7643, Calculator.calculateMultiplication(-2.513, -1.1), delta);
    }

    @Test
    @DisplayName("Умножение (double + double): число и 0")
    public void testMultiplicationWithDoubleZero() {
        Assertions.assertEquals(0, Calculator.calculateMultiplication(0.0, 8.40), delta);
    }

    @Test
    @DisplayName("Умножение (int + double): 2 положительных числа")
    public void testMultiplicationWithIntDoublePositiveNumbers() {
        Assertions.assertEquals(7.326, Calculator.calculateMultiplication(6.6, 1.11), delta);
    }

    @Test
    @DisplayName("Умножение (int + double): положительное число и отрицательное число")
    public void testMultiplicationWithIntDoubleNegativeNumber() {
        Assertions.assertEquals(-24.584, Calculator.calculateMultiplication(7, -3.512), delta);
    }

    @Test
    @DisplayName("Умножение (int + double): 2 отрицательных числа")
    public void testMultiplicationWithIntDoubleNegativeNumbers() {
        Assertions.assertEquals(555.555, Calculator.calculateMultiplication(-101.01, -5.5), delta);
    }

    @Test
    @DisplayName("Умножение (int + double): число и 0")
    public void testMultiplicationWithIntDoubleZero() {
        Assertions.assertEquals(0, Calculator.calculateMultiplication(0, 17.8), delta);
    }

    @Test
    @DisplayName("Умножение (double + int): 2 положительных числа")
    public void testMultiplicationWithDoubleIntPositiveNumbers() {
        Assertions.assertEquals(102.6, Calculator.calculateMultiplication(17.1, 6), delta);
    }

    @Test
    @DisplayName("Умножение (double + int): положительное число и отрицательное число")
    public void testMultiplicationWithDoubleIntNegativeNumber() {
        Assertions.assertEquals(-25.5, Calculator.calculateMultiplication(-2.55, 10), delta);
    }

    @Test
    @DisplayName("Умножение (double + int): 2 отрицательных числа")
    public void testMultiplicationWithDoubleIntNegativeNumbers() {
        Assertions.assertEquals(-11998.8, Calculator.calculateMultiplication(-99.99, 120), delta);
    }

    @Test
    @DisplayName("Умножение (double + int): число и 0")
    public void testMultiplicationWithDoubleIntZero() {
        Assertions.assertEquals(0, Calculator.calculateMultiplication(0.0, 150), delta);
    }

    @Test
    @DisplayName("Деление (int + int): деление без остатка")
    public void testDivisionWithIntPositiveNumbers1() {
        Assertions.assertEquals(3, Calculator.calculateDivision(15, 5));
    }

    @Test
    @DisplayName("Деление (int + int): деление с остатком")
    public void testDivisionWithIntPositiveNumbers2() {
        Assertions.assertEquals(1, Calculator.calculateDivision(7, 5));
    }

    @Test
    @DisplayName("Деление (int + int): положительное число и отрицательное число")
    public void testDivisionWithIntNegativeNumber() {
        Assertions.assertEquals(-1, Calculator.calculateDivision(6, -5));
    }

    @Test
    @DisplayName("Деление (int + int): 2 отрицательных числа")
    public void testDivisionWithIntNegativeNumbers() {
        Assertions.assertEquals(0, Calculator.calculateDivision(-9, -10));
    }

    @Test
    @DisplayName("Деление (int + int): число и 0")
    public void testDivisionWithIntZero() {
        Assertions.assertNull(Calculator.calculateDivision(7, 0));
    }

    @Test
    @DisplayName("Деление (int + int): максимальное значение типа int")
    public void testDivisionWithIntPositiveBounds() {
        Assertions.assertEquals(INT_MAX_VALUE, Calculator.calculateDivision(-2147483647, -1));
    }

    @Test
    @DisplayName("Деление (int + int): результат превышает положительное значение для типа int")
    public void testDivisionWithIntOutOfPositiveBounds() {
        Assertions.assertNull(Calculator.calculateDivision(INT_MIN_VALUE, -1));
    }

    @Test
    @DisplayName("Деление (double + double): деление без остатка")
    public void testDivisionWithDoublePositiveNumbers() {
        Assertions.assertEquals(5, Calculator.calculateDivision(15.0, 3.0));
    }

    @Test
    @DisplayName("Деление (double + double): деление с остатком")
    public void testDivisionWithDoublePositiveNumbers2() {
        Assertions.assertEquals(33.333333333333, Calculator.calculateDivision(100.0, 3.0), delta);
    }

    @Test
    @DisplayName("Деление (double + double): положительное число и отрицательное число")
    public void testDivisionWithDoubleNegativeNumber() {
        Assertions.assertEquals(-4.111, Calculator.calculateDivision(-16.444, 4.0));
    }

    @Test
    @DisplayName("Деление (double + double): 2 отрицательных числа")
    public void testDivisionWithDoubleNegativeNumbers() {
        Assertions.assertEquals(0.9, Calculator.calculateDivision(-9.0, -10.0));
    }

    @Test
    @DisplayName("Деление (double + double): число и 0")
    public void testDivisionWithDoubleZero() {
        Assertions.assertNull(Calculator.calculateDivision(7.0, 0.0));
    }

    @Test
    @DisplayName("Деление (int + double): деление без остатка")
    public void testDivisionWithIntDoublePositiveNumber() {
        Assertions.assertEquals(5.0, Calculator.calculateDivision(15, 3.0), delta);
    }

    @Test
    @DisplayName("Деление (int + double): положительное число и отрицательное число")
    public void testDivisionWithIntDoubleNegativeNumber() {
        Assertions.assertEquals(-2.0, Calculator.calculateDivision(9, -4.5), delta);
    }

    @Test
    @DisplayName("Деление (int + double): 2 отрицательных числа")
    public void testDivisionWithIntDoubleNegativeNumbers() {
        Assertions.assertEquals(6.066666666, Calculator.calculateDivision(-91, -15.0), delta);
    }

    @Test
    @DisplayName("Деление (int + double): число и 0")
    public void testDivisionWithIntDoubleZero() {
        Assertions.assertNull(Calculator.calculateDivision(0, 0.0));
    }

    @Test
    @DisplayName("Деление (double + int): деление без остатка")
    public void testDivisionWithDoubleIntPositiveNumber() {
        Assertions.assertEquals(2.0, Calculator.calculateDivision(4.0, 2), delta);
    }

    @Test
    @DisplayName("Деление (double + int): положительное число и отрицательное число")
    public void testDivisionWithDoubleIntNegativeNumber() {
        Assertions.assertEquals(-4.0, Calculator.calculateDivision(-80.0, 20), delta);
    }

    @Test
    @DisplayName("Деление (double + int): 2 отрицательных числа")
    public void testDivisionWithDoubleIntNegativeNumbers() {
        Assertions.assertEquals(2.5, Calculator.calculateDivision(-100.0, -40), delta);
    }

    @Test
    @DisplayName("Деление (double + int): число и 0")
    public void testDivisionWithDoubleIntZero() {
        Assertions.assertNull(Calculator.calculateDivision(16.0, 0));
    }
}
