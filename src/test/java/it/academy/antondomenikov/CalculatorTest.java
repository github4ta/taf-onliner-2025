package it.academy.antondomenikov;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void setUpCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testAddIntIntPositiveNumbers() {
        int result = calculator.addIntInt(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testAddIntIntNegativeNumbers() {
        int result = calculator.addIntInt(-3, -4);
        assertEquals(-7, result);
    }

    @Test
    public void testAddIntIntZeroAndPositive() {
        int result = calculator.addIntInt(0, 5);
        assertEquals(5, result);
    }

    @Test
    public void testAddIntIntZeroAndNegative() {
        int result = calculator.addIntInt(0, -5);
        assertEquals(-5, result);
    }

    @Test
    public void testAddIntIntPositiveOverflow() {
        int result = calculator.addIntInt(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void testAddIntIntNegativeOverflow() {
        int result = calculator.addIntInt(Integer.MIN_VALUE, -1);
        assertEquals(Integer.MAX_VALUE, result);

    }

}