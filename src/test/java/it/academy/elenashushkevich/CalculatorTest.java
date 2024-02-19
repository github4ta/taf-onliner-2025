package it.academy.elenashushkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testIntAddZero(){
        Assertions.assertEquals(0, calc.add(0,0));
    }

    @Test
    public void testIntAddMax(){
        Assertions.assertEquals(-2, calc.add(2147483647,2147483647));
    }

    @Test
    public void testIntAddMin(){
        Assertions.assertEquals(0, calc.add(-2147483648,-2147483648));
    }

    @Test
    public void testIntAddMaxMin(){
        Assertions.assertEquals(-1, calc.add(-2147483648,2147483647));
    }



    @Test
    public void testStringAddEmptyNull(){
        Assertions.assertEquals(null, calc.add("",null));
    }

    @Test
    public void testStringSubtractNulls(){
        Assertions.assertEquals("a or b is null!" , calc.substract(null,null));
    }

}
