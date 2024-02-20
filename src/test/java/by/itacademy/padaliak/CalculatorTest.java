package by.itacademy.padaliak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("int: positive + positive ")
    public void test1() {
        Assertions.assertEquals(23, Calculator.sum(20, 3));
    }

    @Test
    @DisplayName("int: negative + negative ")
    public void test2() {
        Assertions.assertEquals(-45, Calculator.sum(-20, -25));
    }

    @Test
    @DisplayName("int: negative + positive ")
    public void test3() {
        Assertions.assertEquals(25, Calculator.sum(-20, 45));
    }

    @Test
    @DisplayName("int: zero + zero ")
    public void test4() {
        Assertions.assertEquals(0, Calculator.sum(0, 0));
    }

    @Test
    @DisplayName("int: zero + positive ")
    public void test5() {
        Assertions.assertEquals(5657, Calculator.sum(0, 5657));
    }

    @Test
    @DisplayName("int: zero + negative ")
    public void test6() {
        Assertions.assertEquals(-5657, Calculator.sum(0, -5657));
    }

    @Test
    @DisplayName("int: 2147483647 plus 1")
    public void test7() {
        Assertions.assertEquals(-2147483648, Calculator.sum(2147483647, 1));
    }

    @Test
    @DisplayName("int: 2147483647 plus 0")
    public void test8() {
        Assertions.assertEquals(2147483647, Calculator.sum(2147483647, 0));
    }

    @Test
    @DisplayName("int: 2147483646 plus 1")
    public void test9() {
        Assertions.assertEquals(2147483647, Calculator.sum(2147483646, 1));
    }

    @Test
    @DisplayName("int: -2147483648  plus 1")
    public void test10() {
        Assertions.assertEquals(-2147483647, Calculator.sum(-2147483648, 1));
    }

    @Test
    @DisplayName("int: -2147483648 plus 0")
    public void test11() {
        Assertions.assertEquals(-2147483648, Calculator.sum(-2147483648, 0));
    }

    @Test
    @DisplayName("int: positive - positive")
    public void test12() {
        Assertions.assertEquals(17, Calculator.subtract(20, 3));
    }

    @Test
    @DisplayName("int: negative - negative")
    public void test13() {
        Assertions.assertEquals(-17, Calculator.subtract(-20, -3));
    }

    @Test
    @DisplayName("int: positive - negative")
    public void test14() {
        Assertions.assertEquals(23, Calculator.subtract(20, -3));
    }

    @Test
    @DisplayName("int: negative - positive")
    public void test15() {
        Assertions.assertEquals(-67, Calculator.subtract(-20, 47));
    }

    @Test
    @DisplayName("int: zero - zero")
    public void test16() {
        Assertions.assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    @DisplayName("int: zero - positive")
    public void test17() {
        Assertions.assertEquals(-67, Calculator.subtract(0, 67));
    }

    @Test
    @DisplayName("int: zero - negative")
    public void test18() {
        Assertions.assertEquals(67, Calculator.subtract(0, -67));
    }

    @Test
    @DisplayName("int: positive - zero")
    public void test19() {
        Assertions.assertEquals(78, Calculator.subtract(78, 0));
    }

    @Test
    @DisplayName("int: negative - zero")
    public void test20() {
        Assertions.assertEquals(-78, Calculator.subtract(-78, 0));
    }

    @Test
    @DisplayName("int: 2147483647 - zero")
    public void test21() {
        Assertions.assertEquals(2147483647, Calculator.subtract(2147483647, 0));
    }

    @Test
    @DisplayName("int: 2147483647 - 1")
    public void test22() {
        Assertions.assertEquals(2147483646, Calculator.subtract(2147483647, 1));
    }

    @Test
    @DisplayName("int: -2147483648 - zero")
    public void test23() {
        Assertions.assertEquals(-2147483648, Calculator.subtract(-2147483648, 0));
    }

    @Test
    @DisplayName("int: -2147483648 - 1")
    public void test24() {
        Assertions.assertEquals(-2147483647, Calculator.subtract(-2147483648, -1));
    }
}
