package it.academy.nataliagvozdeva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSumIntAIntB(){
        Assertions.assertEquals(11, Calculator.sum(1, 10), "Метод sum работает некорректно.");
    }
    @Test
    public void testSubtractionIntAIntB(){
        Assertions.assertEquals(-9, Calculator.subtraction(1, 10), "Метод subtraction работает некорректно.");
    }
    @Test
    public void testDivisionIntAIntB(){
        Assertions.assertEquals(1, Calculator.division(5, 5), "Метод division работает некорректно.");
    }
    @Test
    public void testMultiplicationIntAIntB(){
        Assertions.assertEquals(25, Calculator.multiplication(5, 5), "Метод multiplication работает некорректно.");
    }
    @Test
    public void testSumDoubleADoubleB(){
        Assertions.assertEquals(11.6, Calculator.sum(1.5, 10.1), "Метод sum работает некорректно.");
    }
    @Test
    public void testSubtractionDoubleADoubleB(){
        Assertions.assertEquals(0.0, Calculator.subtraction(10.1, 10.1), "Метод subtraction работает некорректно.");
    }
    @Test
    public void testDivisionDoubleADoubleB(){
        Assertions.assertEquals(1.0, Calculator.division(5.0, 5.0), "Метод division работает некорректно.");
    }
    @Test
    public void testMultiplicationDoubleADoubleB(){
        Assertions.assertEquals(25, Calculator.multiplication(5, 5), "Метод multiplication работает некорректно.");
    }
    @Test
    public void testSumIntADoubleB(){
        Assertions.assertEquals(6.8, Calculator.sum(1, 5.8), "Метод sum работает некорректно.");
    }
    @Test
    public void testSubtractionIntADoubleB(){
        Assertions.assertEquals(90.0, Calculator.subtraction(100, 10.0), "Метод subtraction работает некорректно.");
    }
    @Test
    public void testDivisionIntADoubleB(){
        Assertions.assertEquals(1.0, Calculator.division(5, 5.0), "Метод division работает некорректно.");
    }
    @Test
    public void testMultiplicationIntADoubleB(){
        Assertions.assertEquals(25.0, Calculator.multiplication(5, 5.0), "Метод multiplication работает некорректно.");
    }
    @Test
    public void testSumDoubleAIntB(){
        Assertions.assertEquals(11.9, Calculator.sum(1.9, 10), "Метод sum работает некорректно.");
    }
    @Test
    public void testSubtractionDoubleAIntB(){
        Assertions.assertEquals(90.0, Calculator.subtraction(100.0, 10), "Метод subtraction работает некорректно.");
    }
    @Test
    public void testDivisionDoubleAIntB(){
        Assertions.assertEquals(1.0, Calculator.division(5.0, 5), "Метод division работает некорректно.");
    }
    @Test
    public void testMultiplicationDoubleAIntB(){
        Assertions.assertEquals(25.0, Calculator.multiplication(5.0, 5), "Метод multiplication работает некорректно.");
    }
    @Test
    public void testSumStringAStringB(){
        Assertions.assertEquals("108", Calculator.sum("100", "8"), "Метод sum работает некорректно.");
    }
    @Test
    public void testSubtractionStringAStringB(){
        Assertions.assertEquals("-9", Calculator.subtraction("1", "10"), "Метод subtraction работает некорректно.");
    }
    @Test
    public void testDivisionStringAStringB(){
        Assertions.assertEquals("1", Calculator.division("5", "5"), "Метод division работает некорректно.");
    }
    @Test
    public void testMultiplicationStringAStringB(){
        Assertions.assertEquals("25", Calculator.multiplication("5", "5"), "Метод multiplication работает некорректно.");
    }
}
