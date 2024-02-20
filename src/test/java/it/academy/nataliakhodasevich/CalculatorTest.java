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


}
