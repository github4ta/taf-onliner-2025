package it.academy.yuliyaabramovitch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
//    ***SUM_TESTS***
    @Test
    public void testPositiveIntValuesSum() {
        Assertions.assertEquals(9, Calculator.calculateSum(3, 6));
    }
    @Test
    public void testNegativeIntValuesSum() {
        Assertions.assertEquals(-13, Calculator.calculateSum(-10, -3));
    }
    @Test
    public void testPositiveAndNegativeIntValuesSum() {
        Assertions.assertEquals(-2, Calculator.calculateSum(-10, 8));
    }
    @Test
    public void testPositiveIntAndZeroValuesSum() {
        Assertions.assertEquals(3, Calculator.calculateSum(0, 3));
    }
    @Test
    public void testNegativeIntAndZeroValuesSum() {
        Assertions.assertEquals(-3, Calculator.calculateSum(0, -3));
    }
    @Test
    public void testMaxIntAndIntValuesSum(){
        Assertions.assertEquals(-1, Calculator.calculateSum(-2147483648, 2147483647));
    }
    @Test
    public void testDoubleValuesSum(){
        Assertions.assertEquals(-0.7117, Calculator.calculateSum(-2, 1.2883), 0.000001);

    }
    @Test
    public void testIntAndDoubleValuesSum(){
        Assertions.assertEquals(-2.22, Calculator.calculateSum(-2, -0.22), 0.000001);
    }
    @Test
    public void testDoubleAndIntValuesSum(){
        Assertions.assertEquals(-0.78, Calculator.calculateSum(-2, 1.22), 0.000001);
    }
}
