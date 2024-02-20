package it.academy.nataliakhodasevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testSumIntPositiveNegative() {
        Assertions.assertEquals(0, Calculator.sum(-1, 1));
    }

    @Test
    public void testSumIntNegativeNegative() {
        Assertions.assertEquals(-2, Calculator.sum(-1, -1));
    }

    @Test
    public void testSumIntPositivePositive() {
        Assertions.assertEquals(2, Calculator.sum(1, 1));
    }

    @Test
    public void testSumIntPositiveZero() {
        Assertions.assertEquals(1, Calculator.sum(1, 0));
    }

    @Test
    public void testSumIntNegativeZero() {
        Assertions.assertEquals(-1, Calculator.sum(-1, 0));
    }

    @Test
    public void testSubtractIntPositiveNegative() {
        Assertions.assertEquals(-2, Calculator.subtract(-1, 1));
    }

    @Test
    public void testSubtractIntNegativeNegative() {
        Assertions.assertEquals(0, Calculator.subtract(-1, -1));
    }

    @Test
    public void testSubtractIntPositivePositive() {
        Assertions.assertEquals(0, Calculator.subtract(1, 1));
    }

    @Test
    public void testSubtractIntPositiveZero() {
        Assertions.assertEquals(1, Calculator.subtract(1, 0));
    }

    @Test
    public void testSubtractIntNegativeZero() {
        Assertions.assertEquals(-1, Calculator.subtract(-1, 0));
    }


    @Test
    public void testMultiplyIntPositiveNegative() {
        Assertions.assertEquals(-1, Calculator.multiply(-1, 1));
    }

    @Test
    public void testMultiplyIntNegativeNegative() {
        Assertions.assertEquals(1, Calculator.multiply(-1, -1));
    }

    @Test
    public void testMultiplyIntPositivePositive() {
        Assertions.assertEquals(1, Calculator.multiply(1, 1));
    }

    @Test
    public void testMultiplyIntPositiveZero() {
        Assertions.assertEquals(0, Calculator.multiply(1, 0));
    }

    @Test
    public void testMultiplyIntNegativeZero() {
        Assertions.assertEquals(0, Calculator.multiply(-1, 0));
    }

    @Test
    public void testDivideIntPositiveNegative() {
        Assertions.assertEquals(-1, Calculator.divide(-1, 1));
    }

    @Test
    public void testDivideIntNegativeNegative() {
        Assertions.assertEquals(1, Calculator.divide(-1, -1));
    }

    @Test
    public void testDivideIntPositivePositive() {
        Assertions.assertEquals(1, Calculator.divide(1, 1));
    }

    @Test
    public void testDivideIntPositiveZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1, 0));
    }

    @Test
    public void testDivideIntNegativeZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-1, 0));
    }

    @Test
    public void testSumDoublePositiveNegative() {
        Assertions.assertEquals(0.0, Calculator.sum(-1.0, 1.0));
    }

    @Test
    public void testSumDoubleNegativeNegative() {
        Assertions.assertEquals(-2.0, Calculator.sum(-1.0, -1.0));
    }

    @Test
    public void testSumDoublePositivePositive() {
        Assertions.assertEquals(2.0, Calculator.sum(1.0, 1.0));
    }

    @Test
    public void testSumDoublePositiveZero() {
        Assertions.assertEquals(1.0, Calculator.sum(1.0, 0));
    }

    @Test
    public void testSumDoubleNegativeZero() {
        Assertions.assertEquals(-1.0, Calculator.sum(-1.0, 0));
    }

    @Test
    public void testSubtractDoublePositiveNegative() {
        Assertions.assertEquals(-2.0, Calculator.subtract(-1.0, 1.0));
    }

    @Test
    public void testSubtractDoubleNegativeNegative() {
        Assertions.assertEquals(0, Calculator.subtract(-1.1, -1.1));
    }

    @Test
    public void testSubtractDoublePositivePositive() {
        Assertions.assertEquals(0, Calculator.subtract(1.1, 1.1));
    }

    @Test
    public void testSubtractDoublePositiveZero() {
        Assertions.assertEquals(1.1, Calculator.subtract(1.1, 0));
    }

    @Test
    public void testSubtractDoubleNegativeZero() {
        Assertions.assertEquals(-1.1, Calculator.subtract(-1.1, 0));
    }

    @Test
    public void testMultiplyDoublePositiveNegative() {
        Assertions.assertEquals(-1.2100000000000002, Calculator.multiply(-1.1, 1.1));
    }

    @Test
    public void testMultiplyDoubleNegativeNegative() {
        Assertions.assertEquals(1.2100000000000002, Calculator.multiply(-1.1, -1.1));
    }

    @Test
    public void testMultiplyDoublePositivePositive() {
        Assertions.assertEquals(1.2100000000000002, Calculator.multiply(1.1, 1.1));
    }

    @Test
    public void testMultiplyDoublePositiveZero() {
        Assertions.assertEquals(0, Calculator.multiply(1.1, 0));
    }

    @Test
    public void testMultiplyDoubleNegativeZero() {
        Assertions.assertEquals(-0.0, Calculator.multiply(-1.1, 0));
    }

    @Test
    public void testDivideDoublePositiveNegative() {
        Assertions.assertEquals(-1, Calculator.divide(-1.1, 1.1));
    }

    @Test
    public void testDivideDoubleNegativeNegative() {
        Assertions.assertEquals(1, Calculator.divide(-1.0, -1.0));
    }

    @Test
    public void testDivideDoublePositivePositive() {
        Assertions.assertEquals(1, Calculator.divide(1.1, 1.1));
    }

    @Test
    public void testDivideDoublePositiveZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1.8, 0));
    }

    @Test
    public void testDivideDoubleNegativeZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-1.9, 0));
    }

    @Test
    public void testSumString() {
        Assertions.assertEquals("22.0", Calculator.sumString("10", "12.0"));
    }

    @Test
    public void testSumStringPositiveNegative() {
        Assertions.assertEquals("0.0", Calculator.sumString("-1", "1.0"));
    }

    @Test
    public void testSumStringNegativeNegative() {
        Assertions.assertEquals("-2.9", Calculator.sumString("-1", "-1.9"));
    }

    @Test
    public void testSumStringPositivePositive() {
        Assertions.assertEquals("2.9", Calculator.sumString("1", "1.9"));
    }

    @Test
    public void testSumStringPositiveZero() {
        Assertions.assertEquals("1.0", Calculator.sumString("1", "0"));
    }

    @Test
    public void testSumStringNegativeZero() {
        Assertions.assertEquals("-1.0", Calculator.sumString("-1", "0"));
    }

    @Test
    public void testSubtractStringPositiveNegative() {
        Assertions.assertEquals("-2.6", Calculator.subtractString("-1", "1.6"));
    }

    @Test
    public void testSubtractStringNegativeNegative() {
        Assertions.assertEquals("0.8999999999999999", Calculator.subtractString("-1", "-1.9"));
    }

    @Test
    public void testSubtractStringPositivePositive() {
        Assertions.assertEquals("-0.3999999999999999", Calculator.subtractString("1", "1.4"));
    }

    @Test
    public void testSubtractStringPositiveZero() {
        Assertions.assertEquals("1.0", Calculator.subtractString("1", "0"));
    }

    @Test
    public void testSubtractStringNegativeZero() {
        Assertions.assertEquals("-1.0", Calculator.subtractString("-1", "0"));
    }

    @Test
    public void testMultiplyStringPositiveNegative() {
        Assertions.assertEquals("-1.9", Calculator.multiplyString("-1", "1.9"));
    }

    @Test
    public void testMultiplyStringNegativeNegative() {
        Assertions.assertEquals("1.6", Calculator.multiplyString("-1", "-1.6"));
    }

    @Test
    public void testMultiplyStringPositivePositive() {
        Assertions.assertEquals("1.9", Calculator.multiplyString("1", "1.9"));
    }

    @Test
    public void testMultiplyStringPositiveZero() {
        Assertions.assertEquals("0.0", Calculator.multiplyString("1", "0"));
    }

    @Test
    public void testMultiplyStringNegativeZero() {
        Assertions.assertEquals("-0.0", Calculator.multiplyString("-1", "0"));
    }

    @Test
    public void testDivideStringPositiveNegative() {
        Assertions.assertEquals("-0.5555555555555556", Calculator.divideString("-1", "1.8"));
    }

    @Test
    public void testDivideStringNegativeNegative() {
        Assertions.assertEquals("0.7142857142857143", Calculator.divideString("-1", "-1.4"));
    }

    @Test
    public void testDivideStringPositivePositive() {
        Assertions.assertEquals("0.5882352941176471", Calculator.divideString("1", "1.7"));
    }

    @Test
    public void testDivideStringPositiveZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divideString("1", "0"));
    }

    @Test
    public void testDivideStringNegativeZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divideString("-1", "0"));
    }
}
