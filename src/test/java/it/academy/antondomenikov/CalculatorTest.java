package it.academy.antondomenikov;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUpCalculator() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("1.Test addition with positive numbers")
    public void testAddIntIntPositiveNumbers() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    @DisplayName("2.Test addition with negative numbers")
    public void testAddIntIntNegativeNumbers() {
        assertEquals(-7, calculator.add(-3, -4));
    }

    @Test
    @DisplayName("3.Test addition with zero and positive number")
    public void testAddIntIntZeroAndPositive() {
        assertEquals(5, calculator.add(0, 5));
    }

    @Test
    @DisplayName("4.Test addition with zero and negative number")
    public void testAddIntIntZeroAndNegative() {
        assertEquals(-5, calculator.add(0, -5));
    }

    @Test
    @DisplayName("5.Test addition with positive overflow")
    public void testAddIntIntPositiveOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test
    @DisplayName("6.Test addition with negative overflow")
    public void testAddIntIntNegativeOverflow() {
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1));

    }

    @Test
    @DisplayName("7.Test subtraction with positive numbers")
    public void testSubtractIntIntPositiveNumbers() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    @DisplayName("8.Test subtraction with negative result")
    public void testSubtractIntIntNegativeResult() {
        assertEquals(-2, calculator.subtract(3, 5));
    }

    @Test
    @DisplayName("9.Test subtraction with zero and positive number")
    public void testSubtractIntIntZeroAndPositive() {
        assertEquals(-5, calculator.subtract(0, 5));
    }

    @Test
    @DisplayName("10.Test subtraction with zero and one negative number")
    public void testSubtractIntIntZeroAndOneNegative() {
        assertEquals(5, calculator.subtract(0, -5));
    }

    @Test
    @DisplayName("11.Test subtraction with two negative numbers")
    public void testSubtractIntIntTwoNegative() {
        assertEquals(-1, calculator.subtract(-6, -5));
    }

    @Test
    @DisplayName("12.Test subtraction with positive overflow")
    public void testSubtractIntIntPositiveOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MAX_VALUE, -1));
    }

    @Test
    @DisplayName("13.Test subtraction with negative overflow")
    public void testSubtractIntIntNegativeOverflow() {
        assertEquals(Integer.MAX_VALUE, calculator.subtract(Integer.MIN_VALUE, 1));
    }

    @Test
    @DisplayName("14.Test multiplication with both positive numbers")
    public void testMultiplyIntIntBothPositive() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    @DisplayName("15.Test multiplication with one negative number")
    public void testMultiplyIntIntOneNegative() {
        assertEquals(-12, calculator.multiply(-3, 4));
    }

    @Test
    @DisplayName("16.Test multiplication with both negative numbers")
    public void testMultiplyIntIntBothNegative() {
        assertEquals(12, calculator.multiply(-3, -4));
    }

    @Test
    @DisplayName("17.Test multiplication with one zero")
    public void testMultiplyIntIntOneZero() {
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    @DisplayName("18.Test multiplication with both zeros")
    public void testMultiplyIntIntBothZero() {
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    @DisplayName("19.Test multiplication with positive overflow")
    public void testMultiplyIntIntPositiveOverflow() {
        assertEquals(Integer.MAX_VALUE, calculator.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    @DisplayName("20.Test multiplication with negative overflow")
    public void testMultiplyIntIntNegativeOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.multiply(Integer.MIN_VALUE, 2));
    }

    @Test
    @DisplayName("21.Test divide with two positive numbers (even,int)")
    public void testEvenDivideTwoPositiveNumbers() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    @DisplayName("22. Test divide with one negative numbers (even,int)")
    public void testEvenDivideOneNegativeNumber() {
        assertEquals(-2, calculator.divide(-6, 3));
    }

    @Test
    @DisplayName("23. Test divide with two negative numbers (even,int)")
    public void testEvenDivideTwoNegativeNumber() {
        assertEquals(2, calculator.divide(-8, -4));
    }

    @Test
    @DisplayName("24. Test divide with one negative numbers (odd,int)")
    public void testOddDivideOneNegativeNumber() {
        assertEquals(-1, calculator.divide(-5, 3));
    }

    @Test
    @DisplayName("25. Test divide with one negative numbers (odd,int)")
    public void testOddDivideTwoNegativeNumber() {
        assertEquals(1, calculator.divide(-7, -4));
    }

    @Test
    @DisplayName("26. Test divide by Zero")
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));
    }

    @Test
    @DisplayName("27. Test divide Zero by number (int)")
    void testDivideZeroByNumber() {
        assertEquals(0, calculator.divide(0, 9));
    }

    @Test
    @DisplayName("28. Test divide by 1 (int)")
    public void testDivideByOne() {
        assertEquals(5, calculator.divide(5, 1));
    }
}