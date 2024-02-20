package it.academy.victoriavlasova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    @DisplayName("sum with negative int")
    public void testCalculatorSum1(){
        Assertions.assertEquals(0, calculator.sum(1,-1));
    }
    @Test
    @DisplayName("sum with boundary values")
    public void testCalculatorSum2() {
        Assertions.assertEquals(-1, calculator.sum(-2147483648, 2147483647));
    }
    @Test
    @DisplayName("sum double+double")
    public void testCalculatorSum3() {
        Assertions.assertEquals(-4.75, calculator.sum(-2.15, -2.6));
    }
    @Test
    @DisplayName("sum int + double")
    public void testCalculatorSum4() {
        Assertions.assertEquals(1.55, calculator.sum(1, 0.55));
    }
    @Test
    @DisplayName("sum double + int")
    public void testCalculatorSum5() {
        Assertions.assertEquals(-0.22, calculator.sum(-0.22, 0));
    }
    @Test
    @DisplayName("sum double + double with boundary values")
    public void testCalculatorSum6() {
        Assertions.assertEquals(0, calculator.sum(-1.7*Math.pow(10,308), +1.7*Math.pow(10,308)));
    }
    @Test
    @DisplayName("sum with string #1")
    public void testCalculatorSum7() {
        Assertions.assertEquals("21", calculator.sum("10", "11"));
    }
    @Test
    @DisplayName("sum with string #2")
    public void testCalculatorSum8() {
        Assertions.assertEquals("Wrong format!", calculator.sum("ljkl", "jjo"));
    }
    @Test
    @DisplayName("subtraction int-int")
    public void testCalculatorSubtraction1(){
        Assertions.assertEquals(1,calculator.subtraction(0,-1));
    }
    @Test
    @DisplayName("subtraction double-double")
    public void testCalculatorSubtraction2(){
        Assertions.assertEquals(0,calculator.subtraction(0.55,0.55));
    }
    @Test
    @DisplayName("subtraction double-int")
    public void testCalculatorSubtraction3(){
        Assertions.assertEquals(2.50,calculator.subtraction(3.50,1));
    }
    @Test
    @DisplayName("subtraction int-double")
    public void testCalculatorSubtraction4(){
        Assertions.assertEquals(1.50,calculator.subtraction(3,1.50));
    }
    @Test
    @DisplayName("subtraction int - int with boundary values ")
    public void testCalculatorSubtraction5(){
        Assertions.assertEquals(2147483646,calculator.subtraction(2147483647,1));
    }
    @Test
    @DisplayName("subtraction int - double with boundary values")
    public void testCalculatorSubtraction6() {
        Assertions.assertEquals(-1.7*Math.pow(10,308), calculator.subtraction(0, 1.7*Math.pow(10,308)));
    }
    @Test
    @DisplayName("subtraction with String #1")
    public void testCalculatorSubtraction7() {
        Assertions.assertEquals("1", calculator.subtraction("9", "8"));
    }
    @Test
    @DisplayName("subtraction with String #2")
    public void testCalculatorSubtraction8() {
        Assertions.assertEquals("Wrong format!", calculator.subtraction("mlm", "ml,l"));
    }
    @Test
    @DisplayName("multiplication int*int with boundary values")
    public void testCalculatorMultiplication1(){
        Assertions.assertEquals(0, calculator.multiplication(0, -2147483648));
    }
    @Test
    @DisplayName("multiplication double*double")
    public void testCalculatorMultiplication2(){
        Assertions.assertEquals(4.4, calculator.multiplication(-8.8, -0.5),0.01);
    }
    @Test
    @DisplayName("multiplication double*int with boundary values")
    public void testCalculatorMultiplication3(){
        Assertions.assertEquals(-1073741824, calculator.multiplication(0.5, -2147483648));
    }
    @Test
    @DisplayName("multiplication int*double")
    public void testCalculatorMultiplication4(){
        Assertions.assertEquals(1.555, calculator.multiplication(1, 1.555), 0.01);
    }
    @Test
    @DisplayName("multiplication with string #1")
    public void testCalculatorMultiplication5(){
        Assertions.assertEquals("10",calculator.multiplication("5","2"));
    }
    @Test
    @DisplayName("multiplication with string #2")
    public void testCalculatorMultiplication6(){
        Assertions.assertEquals("Wrong format!",calculator.multiplication("kjjl","kll"));
    }
    @Test
    @DisplayName("division int/int with boundary values")
    public void testCalculatorDivision1(){
        Assertions.assertEquals(-1073741824,calculator.division(-2147483648,2));
    }
    @Test
    @DisplayName("division int/double")
    public void testCalculatorDivision2(){
        Assertions.assertEquals(0,calculator.division(0,1.5));
    }
    @Test
    @DisplayName("division double/double")
    public void testCalculatorDivision3(){
        Assertions.assertEquals(2.00,calculator.division(3.00,1.50));
    }
    @Test
    @DisplayName("division double/int")
    public void testCalculatorDivision4(){
        Assertions.assertEquals(-1.50,calculator.division(3.00,-2));
    }
    @Test
    @DisplayName("division with String #1")
    public void testCalculatorDivision5(){
        Assertions.assertEquals("2",calculator.division("4","2"));
    }
    @Test
    @DisplayName("division with String #2")
    public void testCalculatorDivision6(){
        Assertions.assertEquals("?an not be divided by zero!",calculator.division("4","0"));
    }
    @Test
    @DisplayName("division with String #3")
    public void testCalculatorDivision7(){
        Assertions.assertEquals("Wrong format!",calculator.division("klk;","nklml"));
    }
}
