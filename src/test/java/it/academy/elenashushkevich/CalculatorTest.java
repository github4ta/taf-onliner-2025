package it.academy.elenashushkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testIntAddZero() {
        Assertions.assertEquals(0, calc.add(0, 0));
    }

    @Test
    public void testIntAddMax() {
        Assertions.assertEquals(-2, calc.add(2147483647, 2147483647));
    }

    @Test
    public void testIntAddMin() {
        Assertions.assertEquals(0, calc.add(-2147483648, -2147483648));
    }

    @Test
    public void testIntAddMaxMin() {
        Assertions.assertEquals(-1, calc.add(-2147483648, 2147483647));
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
        Assertions.assertEquals(-1.7E308, calc.add(2147483647,-1.7e+308 ));
    }

    @Test
    public void testIntDoubleAddMax() {
        Assertions.assertEquals(1.7E308, calc.add(2147483647,1.7e+308 ));
    }

    @Test
    public void testIntDoubleAddMin() {
        Assertions.assertEquals(-1.7E308, calc.add(-2147483648,-1.7e+308 ));
    }

    @Test
    public void testIntDoubleAddMaxMin() {
        Assertions.assertEquals(-1.7E308, calc.add(2147483647, -1.7e+308));
    }


    @Test
    public void testStringAddEmptyNull() {

        // Assertions.assertEquals(null, calc.add("",null));
    }

    @Test
    public void testStringSubtractNulls() {
        Assertions.assertNull(calc.add(null, null));
        // Assertions.assertEquals("a or b is null!" , calc.substract(null,null));
    }

}
