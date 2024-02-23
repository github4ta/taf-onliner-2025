package it.academy.kulachek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSumInteger() {
        int result = calculator.sum(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSumDouble() {
        double result = calculator.sum(2.5, 4.5);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testSumIntegerAndDouble() {
        double result = calculator.sum(5, 2.5);
        Assertions.assertEquals(7.5, result);
    }

    @Test
    public void testSumDoubleAndInteger() {
        double result = calculator.sum(5.5, 5);
        Assertions.assertEquals(10.5, result);
    }

    @Test
    public void testSumString() {
        String result = calculator.sum("Hello ", "java!");
        Assertions.assertEquals("Hello java!", result);
    }

    @Test
    public void testSubtractIntegers() {
        int result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testSubtractDoubles() {
        double result = calculator.subtract(5.5, 2.5);
        Assertions.assertEquals(3.0, result);
    }

    @Test
    public void testSubtractIntegerAndDouble() {
        double result = calculator.subtract(5, 2.5);
        Assertions.assertEquals(2.5, result);
    }

    @Test
    public void testSubtractDoubleAndInteger() {
        double result = calculator.subtract(2.5, 5);
        Assertions.assertEquals(-2.5, result);
    }

    @Test
    public void testMultiplyIntegers() {
        int result = calculator.multiply(5, 3);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testMultiplyDoubles() {
        double result = calculator.multiply(2.5, 4.5);
        Assertions.assertEquals(11.25, result);
    }

    @Test
    public void testMultiplyIntegerAndDouble() {
        double result = calculator.multiply(5, 2.5);
        Assertions.assertEquals(12.5, result);
    }

    @Test
    public void testMultiplyDoubleAndInteger() {
        double result = calculator.multiply(2.5, 5);
        Assertions.assertEquals(12.5, result);
    }

    @Test
    public void testDivideIntegers() {
        int result = calculator.divide(6, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivideDoubles() {
        double result = calculator.divide(5.5, 2);
        Assertions.assertEquals(2.75, result);
    }

    @Test
    public void testDivideIntegerAndDouble() {
        double result = calculator.divide(5, 2.5);
        Assertions.assertEquals(2.0, result);
    }

    @Test
    public void testDivideDoubleAndInteger() {
        double result = calculator.divide(2.5, 5);
        Assertions.assertEquals(0.5, result);
    }




    @Test
    public void testSumPositiveAndNegative() {
        int result = calculator.sum(5, -3);
            Assertions.assertEquals(2, result);
}

    @Test
    public void testSumNegativeAndPositive() {
        int result = calculator.sum(-5, 3);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void testSubtractPositiveAndNegative() {
        int result = calculator.subtract(5, -3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtractNegativeAndPositive() {
        int result = calculator.subtract(-5, 3);
        Assertions.assertEquals(-8, result);
    }

    @Test
    public void testMultiplyPositiveAndNegative() {
        int result = calculator.multiply(5, -3);
        Assertions.assertEquals(-15, result);
    }

    @Test
    public void testMultiplyNegativeAndPositive() {
        int result = calculator.multiply(-5, 3);
        Assertions.assertEquals(-15, result);
    }

    @Test
    public void testDividePositiveAndNegative() {
        int result = calculator.divide(6, -3);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void testDivideNegativeAndPositive() {
        int result = calculator.divide(-6, 3);
        Assertions.assertEquals(-2, result);
    }

    @Test
    public void testDivideByZeroForInteger() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6, 0);
        });
    }

    @Test
    public void testSumEdgeValues() {
        double result = calculator.sum(Double.MAX_VALUE, Double.MAX_VALUE);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void testSubtractEdgeValues() {
        double result = calculator.subtract(Double.MAX_VALUE, Double.MAX_VALUE);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMultiplyEdgeValues() {
        double result = calculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void testDivideEdgeValues() {
        double result = calculator.divide(Double.MAX_VALUE, Double.MAX_VALUE);
        Assertions.assertEquals(1, result);
    }

}
