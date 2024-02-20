package it.academy.nataliakhodasevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSumIntPositiveNegative(){
        Assertions.assertEquals(0,Calculator.sum(-1,1));
    }

    @Test
    public void testSumIntNegativeNegative(){
        Assertions.assertEquals(-2,Calculator.sum(-1,-1));
    }

    @Test
    public void testSumIntPositivePositive(){
        Assertions.assertEquals(2,Calculator.sum(1,1));
    }

    @Test
    public void testSumIntPositiveZero(){
        Assertions.assertEquals(1,Calculator.sum(1,0));
    }

    @Test
    public void testSumIntNegativeZero(){
        Assertions.assertEquals(-1,Calculator.sum(-1,0));
    }

    @Test
    public void testSubtractIntPositiveNegative(){
        Assertions.assertEquals(-2,Calculator.subtract(-1,1));
    }

    @Test
    public void testSubtractIntNegativeNegative(){
        Assertions.assertEquals(0,Calculator.subtract(-1,-1));
    }

    @Test
    public void testSubtractIntPositivePositive(){
        Assertions.assertEquals(0,Calculator.subtract(1,1));
    }

    @Test
    public void testSubtractIntPositiveZero(){
        Assertions.assertEquals(1,Calculator.subtract(1,0));
    }

    @Test
    public void testSubtractIntNegativeZero(){
        Assertions.assertEquals(-1,Calculator.subtract(-1,0));
    }


    @Test
    public void testMultiplyIntPositiveNegative(){
        Assertions.assertEquals(-1,Calculator.multiply(-1,1));
    }

    @Test
    public void testMultiplyIntNegativeNegative(){
        Assertions.assertEquals(1,Calculator.multiply(-1,-1));
    }

    @Test
    public void testMultiplyIntPositivePositive(){
        Assertions.assertEquals(1,Calculator.multiply(1,1));
    }

    @Test
    public void testMultiplyIntPositiveZero(){
        Assertions.assertEquals(0,Calculator.multiply(1,0));
    }

    @Test
    public void testMultiplyIntNegativeZero(){
        Assertions.assertEquals(0,Calculator.multiply(-1,0));
    }

    @Test
    public void testDivideIntPositiveNegative(){
        Assertions.assertEquals(-1,Calculator.divide(-1,1));
    }

    @Test
    public void testDivideIntNegativeNegative(){
        Assertions.assertEquals(1,Calculator.divide(-1,-1));
    }

    @Test
    public void testDivideIntPositivePositive(){
        Assertions.assertEquals(1,Calculator.divide(1,1));
    }

    @Test
    public void testDivideIntPositiveZero(){
        Assertions.assertEquals(1,Calculator.divide(1,0));
    }

    @Test
    public void testDivideIntNegativeZero(){
        Assertions.assertEquals(-1,Calculator.divide(-1,0));
    }

    @Test
    public void testSumDoublePositiveNegative(){
        Assertions.assertEquals(0.0,Calculator.sum(-1.0,1.0));
    }

    @Test
    public void testSumDoubleNegativeNegative(){
        Assertions.assertEquals(-2.0,Calculator.sum(-1.0,-1.0));
    }

    @Test
    public void testSumDoublePositivePositive(){
        Assertions.assertEquals(2.0,Calculator.sum(1.0,1.0));
    }

    @Test
    public void testSumDoublePositiveZero(){
        Assertions.assertEquals(1.0,Calculator.sum(1.0,0));
    }

    @Test
    public void testSumDoubleNegativeZero(){
        Assertions.assertEquals(-1.0,Calculator.sum(-1.0,0));
    }

    @Test
    public void testSubtractDoublePositiveNegative(){
        Assertions.assertEquals(-2.0,Calculator.subtract(-1.0,1.0));
    }

    @Test
    public void testSubtractDoubleNegativeNegative(){
        Assertions.assertEquals(0,Calculator.subtract(-1.1,-1.1));
    }

    @Test
    public void testSubtractDoublePositivePositive(){
        Assertions.assertEquals(0,Calculator.subtract(1.1,1.1));
    }

    @Test
    public void testSubtractDoublePositiveZero(){
        Assertions.assertEquals(1.1,Calculator.subtract(1.1,0));
    }

    @Test
    public void testSubtractDoubleNegativeZero(){
        Assertions.assertEquals(-1.1,Calculator.subtract(-1.1,0));
    }


    @Test
    public void testMultiplyDoublePositiveNegative(){
        Assertions.assertEquals(-1.2100000000000002,Calculator.multiply(-1.1,1.1));
    }

    @Test
    public void testMultiplyDoubleNegativeNegative(){
        Assertions.assertEquals(1.2100000000000002,Calculator.multiply(-1.1,-1.1));
    }

    @Test
    public void testMultiplyDoublePositivePositive(){
        Assertions.assertEquals(1.2100000000000002,Calculator.multiply(1.1,1.1));
    }

    @Test
    public void testMultiplyDoublePositiveZero(){
        Assertions.assertEquals(0,Calculator.multiply(1.1,0));
    }

    @Test
    public void testMultiplyDoubleNegativeZero(){
        Assertions.assertEquals(0.0,Calculator.multiply(-1.1,0));
    }

    @Test
    public void testDivideDoublePositiveNegative(){
        Assertions.assertEquals(-1,Calculator.divide(-1.1,1.1));
    }

    @Test
    public void testDivideDoubleNegativeNegative(){
        Assertions.assertEquals(1,Calculator.divide(-1.0,-1.0));
    }

    @Test
    public void testDivideDoublePositivePositive(){
        Assertions.assertEquals(1,Calculator.divide(1.1,1.1));
    }

    @Test
    public void testDivideDoublePositiveZero(){
        Assertions.assertEquals(1,Calculator.divide(1.8,0));
    }

    @Test
    public void testDivideDoubleNegativeZero(){
        Assertions.assertEquals(-1,Calculator.divide(-1.9,0));
    }


}
