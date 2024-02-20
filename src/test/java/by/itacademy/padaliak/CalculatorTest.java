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
}
