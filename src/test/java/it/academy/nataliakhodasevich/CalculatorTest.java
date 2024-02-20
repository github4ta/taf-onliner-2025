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
        Assertions.assertEquals(0,Calculator.subtract(-1,1));
    }

    @Test
    public void testSubtractIntNegativeNegative(){
        Assertions.assertEquals(-2,Calculator.subtract(-1,-1));
    }

    @Test
    public void testSubtractIntPositivePositive(){
        Assertions.assertEquals(2,Calculator.subtract(1,1));
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
        Assertions.assertEquals(0,Calculator.multiply(-1,1));
    }

    @Test
    public void testMultiplyIntNegativeNegative(){
        Assertions.assertEquals(-2,Calculator.multiply(-1,-1));
    }

    @Test
    public void testMultiplyIntPositivePositive(){
        Assertions.assertEquals(2,Calculator.multiply(1,1));
    }

    @Test
    public void testMultiplyIntPositiveZero(){
        Assertions.assertEquals(1,Calculator.multiply(1,0));
    }

    @Test
    public void testMultiplyIntNegativeZero(){
        Assertions.assertEquals(-1,Calculator.multiply(-1,0));
    }


}
