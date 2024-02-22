package it.academy.elenashushkevich;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testIntAddZero() {
        Assertions.assertEquals(0, calc.add(0, 0));
    }

    @Test
    public void testIntAddMax() {
        Assertions.assertEquals(0, calc.add(2147483647, 2147483647));
    }

    @Test
    public void testIntAddMin() {
        Assertions.assertEquals(0, calc.add(-2147483648, -2147483648));
    }

    @Test
    public void testIntAddMaxMin() {
        Assertions.assertEquals(0, calc.add(-2147483648, 2147483647));
    }

    @Test
    public void testDoubleAddMax() {
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calc.add(1.7e+308, 1.7e+308));
    }

    @Test
    public void testDoubleAddMin() {
        Double negativeInfinity = Double.NEGATIVE_INFINITY;
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, calc.add(-1.7e+308, -1.7e+308));
    }

    @Test
    public void testDoubleAddMaxMin() {
        Assertions.assertEquals(0.0, calc.add(-1.7e+308, 1.7e+308));
    }

    @Test
    public void testIntMaxDoubleMinAdd() {
        Assertions.assertEquals(-1.7E308, calc.add(2147483647, -1.7e+308));
    }

    @Test
    public void testIntDoubleAddMax() {
        Assertions.assertEquals(1.7E308, calc.add(2147483647, 1.7e+308));
    }

    @Test
    public void testIntDoubleAddMin() {
        Assertions.assertEquals(-1.7E308, calc.add(-2147483648, -1.7e+308));
    }

    @Test
    public void testIntDoubleAddMaxMin() {
        Assertions.assertEquals(-1.7E308, calc.add(2147483647, -1.7e+308));
    }

    @Test
    public void testDoubleMaxIntMinAdd() {
        Assertions.assertEquals(1.7E308, calc.add(1.7e+308, 2147483647));
    }

    @Test
    public void testDoubleIntAddMax() {
        Assertions.assertEquals(1.7E308, calc.add(1.7e+308, 2147483647));
    }

    @Test
    public void testDoubleIntAddMin() {
        Assertions.assertEquals(-1.7E308, calc.add(-1.7e+308, -2147483648));
    }

    @Test
    public void testDoubleIntAddMaxMin() {
        Assertions.assertEquals(1.7E308, calc.add(1.7e+308, -2147483648));
    }

    @Test
    public void testIntSubtractZero() {
        Assertions.assertEquals(0, calc.subtract(0, 0));
    }

    @Test
    public void testIntSubtractMax() {
        Assertions.assertEquals(0, calc.subtract(2147483647, 2147483647));
    }

    @Test
    public void testIntSubtractMin() {
        Assertions.assertEquals(0, calc.subtract(-2147483648, -2147483648));
    }

    @Test
    public void testIntSubtractMaxMin() {
        Assertions.assertEquals(1, calc.subtract(-2147483648, 2147483647));
    }

    @Test
    public void testDoubleSubtractMax() {
        Assertions.assertEquals(0.0, calc.subtract(1.7e+308, 1.7e+308));
    }

    @Test
    public void testDoubleSubtractMin() {
        Assertions.assertEquals(0.0, calc.subtract(-1.7e+308, -1.7e+308));
    }

    @Test
    public void testDoubleSubtractMaxMin() {
        Double negativeInfinity = Double.NEGATIVE_INFINITY;
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, calc.subtract(-1.7e+308, 1.7e+308));
    }

    @Test
    public void testIntMaxDoubleMinSubtract() {
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Assertions.assertEquals(1.7E308, calc.subtract(2147483647, -1.7e+308));
    }

    @Test
    public void testIntDoubleMaxSubtract() {
        Assertions.assertEquals(-1.7E308, calc.subtract(2147483647, 1.7e+308));
    }

    @Test
    public void testIntDoubleSubtractMin() {
        Assertions.assertEquals(1.7E308, calc.subtract(-2147483648, -1.7e+308));
    }

    @Test
    public void testIntDoubleSubtractMaxMin() {
        Assertions.assertEquals(1.7E308, calc.subtract(2147483647, -1.7e+308));
    }

    @Test
    public void testDoubleMaxIntMinSubtract() {
        Assertions.assertEquals(1.7E308, calc.subtract(1.7e+308, 2147483647));
    }

    @Test
    public void testDoubleIntSubtractMax() {
        Assertions.assertEquals(1.7E308, calc.subtract(1.7e+308, 2147483647));
    }

    @Test
    public void testDoubleIntSubtractMin() {
        Assertions.assertEquals(-1.7E308, calc.subtract(-1.7e+308, -2147483648));
    }

    @Test
    public void testDoubleIntSubtractMaxMin() {
        Assertions.assertEquals(1.7E308, calc.subtract(1.7e+308, -2147483648));
    }

    @Test
    public void testDoubleIntSubtractPositiveNegative() {
        Assertions.assertEquals(3.23, calc.subtract(0.23, -3));
    }

    @Test
    public void testDoubleIntSubtractNegative() {
        Assertions.assertEquals(0.34999999999999964, calc.subtract(-9.65, -10));
    }

    @Test
    public void testDoubleIntSubtractPositive() {
        Assertions.assertEquals(5.640000000000001, calc.subtract(9.64, 4));
    }

    @Test
    public void testIntAddMax1() {
        Assertions.assertEquals(0, calc.add(-2147483648, 2147483647));
    }

    @Test
    public void testStringAddEmptyNull() {

        Assertions.assertEquals("null", calc.add(null, ""));
    }

    @Test
    public void testStringSubtractNulls() {
        Assertions.assertNull(calc.add(null, null));
    }

    @Test
    public void testDivineIntZeroB() {
        Assertions.assertEquals(0, calc.divide(15, 0));
    }

    @Test
    public void testDivineDoubleIntZeroB() {
        assertThrows(ArithmeticException.class, () -> calc.divide(15.0, 0));
    }
    @Test
    public void testDivineIntDoubleZeroB() {
        Assertions.assertEquals(0, calc.divide(15, 0.0));
    }

}
