package it.academy.yuliyaabramovitch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    //    ***SUM_TESTS***
    @Test
    @DisplayName("Positive 2 int Sum")
    public void testPositiveIntValuesSum() {
        Assertions.assertEquals(9, Calculator.calculateSum(3, 6));
    }

    @Test
    @DisplayName("Negative 2 int Sum")
    public void testNegativeIntValuesSum() {
        Assertions.assertEquals(-13, Calculator.calculateSum(-10, -3));
    }

    @Test
    @DisplayName("Positive and Negative int Sum")
    public void testPositiveAndNegativeIntValuesSum() {
        Assertions.assertEquals(-2, Calculator.calculateSum(-10, 8));
    }

    @Test
    @DisplayName("Positive int and Zero Sum")
    public void testPositiveIntAndZeroValuesSum() {
        Assertions.assertEquals(3, Calculator.calculateSum(0, 3));
    }

    @Test
    @DisplayName("Negative int and Zero Sum")
    public void testNegativeIntAndZeroValuesSum() {
        Assertions.assertEquals(-3, Calculator.calculateSum(0, -3));
    }

    @Test
    @DisplayName("Max 2 int Sum")
    public void testMaxIntAndIntValuesSum() {
        Assertions.assertEquals(0, Calculator.calculateSum(2147483647, 2147483647));
    }
    @Test
    @DisplayName("Min 2 int Sum")
    public void testMinIntAndIntValuesSum() {
        Assertions.assertEquals(0, Calculator.calculateSum(-2147483648, -2147483648));
    }

    @Test
    @DisplayName("2 Double Sum")
    public void testDoubleValuesSum() {
        Assertions.assertEquals(-1.1677, Calculator.calculateSum(-2.456, 1.2883), Util.DELTA);

    }

    @Test
    @DisplayName("Int and Double Sum")
    public void testIntAndDoubleValuesSum() {
        Assertions.assertEquals(-2.22, Calculator.calculateSum(-2, -0.22), Util.DELTA);
    }

    @Test
    @DisplayName("double and int Sum")
    public void testDoubleAndIntValuesSum() {
        Assertions.assertEquals(-1.22, Calculator.calculateSum(-2.22, 1), Util.DELTA);
    }

    //    ***SUBTRACTION_TESTS***
    @Test
    @DisplayName("Positive 2 int Subtraction")
    public void testPositiveIntValuesSubtraction() {
        Assertions.assertEquals(-1, Calculator.calculateSubtraction(2, 3));
    }
    @Test
    @DisplayName("Negative 2 int Subtraction")
    public void testNegativeIntValuesSubtraction() {
        Assertions.assertEquals(1, Calculator.calculateSubtraction(-2, -3));
    }
    @Test
    @DisplayName("Positive and Negative ")
    public void testPositiveAndNegativeIntValuesSubtraction() {
        Assertions.assertEquals(103, Calculator.calculateSubtraction(100, -3));
    }
    @Test
    @DisplayName("Positive int and Zero Subtraction")
    public void testPositiveIntAndZeroValuesSubtraction() {
        Assertions.assertEquals(3, Calculator.calculateSubtraction(3, 0));
    }
    @Test
    @DisplayName("Negative int and Zero Subtraction")
    public void testNegativeIntAndZeroValuesSubtraction() {
        Assertions.assertEquals(-3, Calculator.calculateSubtraction(-3, 0));
    }
    @Test
    @DisplayName("Max 2 int Subtraction")
    public void testMaxIntAndIntValuesSubtraction() {
        Assertions.assertEquals(0, Calculator.calculateSubtraction(2147483647, 2147483647));
    }
    @Test
    @DisplayName("Min 2 int Subtraction")
    public void testMinIntAndIntValuesSubtraction() {
        Assertions.assertEquals(0, Calculator.calculateSubtraction(-2147483648, -2147483648));
    }
    @Test
    @DisplayName("2 Double Subtraction")
    public void testDoubleValuesSubtraction() {
        Assertions.assertEquals(-3.7443, Calculator.calculateSubtraction(-2.456, 1.2883), Util.DELTA);

    }

    @Test
    @DisplayName("Int and Double Subtraction")
    public void testIntAndDoubleValuesSubtraction() {
        Assertions.assertEquals(-1.78, Calculator.calculateSubtraction(-2, -0.22), Util.DELTA);
    }

    @Test
    @DisplayName("double and int Subtraction")
    public void testDoubleAndIntValuesSubtraction() {
        Assertions.assertEquals(-3.22, Calculator.calculateSubtraction(-2.22, 1), Util.DELTA);
    }
}
