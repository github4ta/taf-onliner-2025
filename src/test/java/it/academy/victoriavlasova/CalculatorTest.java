package it.academy.victoriavlasova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    @DisplayName("???????? ???????? ? ????????????? ??????")
    public void testCalculatorSum1(){
        Assertions.assertEquals(0, calculator.sum(1,-1));
    }
    @Test
    @DisplayName("???????? ???????? ? ??????? ???????? ????????? ????????")
    public void testCalculatorSum2() {
        Assertions.assertEquals(-1, calculator.sum(-2147483648, -2147483647));
    }
    @Test
    @DisplayName("???????? ???????? ? ???????? ???????")
    public void testCalculatorSum3() {
        Assertions.assertEquals(-4.75, calculator.sum(-2.15, -2.6));
    }
    @Test
    @DisplayName("???????? ???????? int + double")
    public void testCalculatorSum4() {
        Assertions.assertEquals(1.55, calculator.sum(1, 0.55));
    }
    @Test
    @DisplayName("???????? ???????? double + int")
    public void testCalculatorSum5() {
        Assertions.assertEquals(-0.22, calculator.sum(-0.22, 0));
    }
    @Test
    @DisplayName("???????? ???????? double + double c ?????????? ??????????")
    public void testCalculatorSum6() {
        Assertions.assertEquals(0, calculator.sum(-1.7*Math.pow(10,308), +1.7*Math.pow(10,308)));
    }
    @Test
    @DisplayName("???????? ???????? ????? #1")
    public void testCalculatorSum7() {
        Assertions.assertEquals("21", calculator.sum("10", "11"));
    }
    @Test
    @DisplayName("???????? ???????? ????? #2")
    public void testCalculatorSum8() {
        Assertions.assertEquals("???????????? ?????? ??????!", calculator.sum("ljkl", "jjo"));
    }
    @Test
    @DisplayName("???????? ????????? ? ????????????? ??????")
    public void testCalculatorSubtraction1(){
        Assertions.assertEquals(1,calculator.subtraction(0,-1));
    }
    @Test
    @DisplayName("???????? ????????? (double-double)")
    public void testCalculatorSubtraction2(){
        Assertions.assertEquals(0,calculator.subtraction(0.55,0.55));
    }
    @Test
    @DisplayName("???????? ????????? (double-int)")
    public void testCalculatorSubtraction3(){
        Assertions.assertEquals(2.50,calculator.subtraction(3.50,1));
    }
    @Test
    @DisplayName("???????? ????????? (int-double)")
    public void testCalculatorSubtraction4(){
        Assertions.assertEquals(1.50,calculator.subtraction(3,1.50));
    }
    @Test
    @DisplayName("???????? ????????? (int-double)")
    public void testCalculatorSubtraction5(){
        Assertions.assertEquals(1.50,calculator.subtraction(3,1.50));
    }
    @Test
    @DisplayName("???????? ????????? (int - int) c ?????????? ?????????? ")
    public void testCalculatorSubtraction6(){
        Assertions.assertEquals(2147483646,calculator.subtraction(2147483647,1));
    }
    @Test
    @DisplayName("???????? ????????? (int - double) c ?????????? ??????????")
    public void testCalculatorSubtraction7() {
        Assertions.assertEquals(-1.7*Math.pow(10,308), calculator.subtraction(0, 1.7*Math.pow(10,308)));
    }
    @Test
    @DisplayName("???????? ????????? c ??????? ???? String #1")
    public void testCalculatorSubtraction8() {
        Assertions.assertEquals("1", calculator.subtraction("9", "8"));
    }
    @Test
    @DisplayName("???????? ????????? c ??????? ???? String #2")
    public void testCalculatorSubtraction9() {
        Assertions.assertEquals("???????????? ?????? ??????!", calculator.subtraction("mlm", "ml,l"));
    }
    @Test
    @DisplayName("???????? ????????? int*int ? ?????????? ??????????")
    public void testCalculatorMultiplication1(){
        Assertions.assertEquals(0, calculator.multiplication(0, -2147483648));
    }
    @Test
    @DisplayName("???????? ????????? double*double")
    public void testCalculatorMultiplication2(){
        Assertions.assertEquals(4.4, calculator.multiplication(-8.8, -0.5),0.01);
    }
    @Test
    @DisplayName("???????? ????????? double*int ? ?????????? ??????????")
    public void testCalculatorMultiplication3(){
        Assertions.assertEquals(-1073741824, calculator.multiplication(0.5, -2147483648));
    }
    @Test
    @DisplayName("???????? ????????? int*double")
    public void testCalculatorMultiplication4(){
        Assertions.assertEquals(1.555, calculator.multiplication(1, 1.555), 0.01);
    }
    @Test
    @DisplayName("???????? ????????? ??? string #1")
    public void testCalculatorMultiplication5(){
        Assertions.assertEquals("10",calculator.multiplication("5","2"));
    }
    @Test
    @DisplayName("???????? ????????? ??? string #2")
    public void testCalculatorMultiplication6(){
        Assertions.assertEquals("???????????? ?????? ??????!",calculator.multiplication("kjjl","kll"));
    }

}
