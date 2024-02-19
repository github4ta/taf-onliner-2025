package it.academy.antondomenikov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddIntIntPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.addIntInt(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testAddIntIntNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.addIntInt(-3, -4);
        assertEquals(-7, result);
    }

    @Test
    public void testAddIntIntZeroAndPositive() {
        Calculator calculator = new Calculator();
        int result = calculator.addIntInt(0, 5);
        assertEquals(5, result);
    }

    @Test
    public void testAddIntIntZeroAndNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.addIntInt(0, -5);
        assertEquals(-5, result);
    }
}