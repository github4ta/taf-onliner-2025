package it.academy.nataliakhodasevich;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test @DisplayName("sum positive and negative int check")
    public void testSumIntPositiveNegative() {
        Assertions.assertEquals(0, Calculator.sum(-1, 1));
    }

    @Test @DisplayName("sum negative and negative int check")
    public void testSumIntNegativeNegative() {
        Assertions.assertEquals(-2, Calculator.sum(-1, -1));
    }

    @Test @DisplayName("sum positive and positive int check")
    public void testSumIntPositivePositive() {
        Assertions.assertEquals(2, Calculator.sum(1, 1));
    }

    @Test @DisplayName("sum positive and zero int check")
    public void testSumIntPositiveZero() {
        Assertions.assertEquals(1, Calculator.sum(1, 0));
    }

    @Test @DisplayName("sum negative and zero int check")
    public void testSumIntNegativeZero() {
        Assertions.assertEquals(-1, Calculator.sum(-1, 0));
    }

    @Test @DisplayName("subtract positive and negative int check")
    public void testSubtractIntPositiveNegative() {
        Assertions.assertEquals(-2, Calculator.subtract(-1, 1));
    }

    @Test  @DisplayName("subtract negative and negative int check")
    public void testSubtractIntNegativeNegative() {
        Assertions.assertEquals(0, Calculator.subtract(-1, -1));
    }

    @Test @DisplayName("subtract positive and positive int check")
    public void testSubtractIntPositivePositive() {
        Assertions.assertEquals(0, Calculator.subtract(1, 1));
    }

    @Test @DisplayName("subtract positive and zero int check")
    public void testSubtractIntPositiveZero() {
        Assertions.assertEquals(1, Calculator.subtract(1, 0));
    }

    @Test @DisplayName("subtract negative and zero int check")
    public void testSubtractIntNegativeZero() {
        Assertions.assertEquals(-1, Calculator.subtract(-1, 0));
    }

    @Test @DisplayName("multiply positive and negative int check")
    public void testMultiplyIntPositiveNegative() {
        Assertions.assertEquals(-1, Calculator.multiply(-1, 1));
    }

    @Test @DisplayName("multiply negative and negative int check")
    public void testMultiplyIntNegativeNegative() {
        Assertions.assertEquals(1, Calculator.multiply(-1, -1));
    }

    @Test @DisplayName("multiply positive and positive int check")
    public void testMultiplyIntPositivePositive() {
        Assertions.assertEquals(1, Calculator.multiply(1, 1));
    }

    @Test  @DisplayName("multiply positive and zero int check")
    public void testMultiplyIntPositiveZero() {
        Assertions.assertEquals(0, Calculator.multiply(1, 0));
    }

    @Test  @DisplayName("multiply negative and zero int check")
    public void testMultiplyIntNegativeZero() {
        Assertions.assertEquals(0, Calculator.multiply(-1, 0));
    }

    @Test  @DisplayName("divide negative and positive int check")
    public void testDivideIntPositiveNegative() {
        Assertions.assertEquals(-1, Calculator.divide(-1, 1));
    }

    @Test  @DisplayName("divide negative and negative int check")
    public void testDivideIntNegativeNegative() {
        Assertions.assertEquals(1, Calculator.divide(-1, -1));
    }

    @Test @DisplayName("divide positive and positive int check")
    public void testDivideIntPositivePositive() {
        Assertions.assertEquals(1, Calculator.divide(1, 1));
    }

    @Test @DisplayName("divide positive and zero int check")
    public void testDivideIntPositiveZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1, 0));
    }

    @Test @DisplayName("divide negative and zero int check")
    public void testDivideIntNegativeZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-1, 0));
    }

    @Test @DisplayName("sum positive and negative double check")
    public void testSumDoublePositiveNegative() {
        Assertions.assertEquals(0.000, Calculator.sum(-1.0, 1.0), 0.001);
    }

    @Test  @DisplayName("sum negative and negative double check")
    public void testSumDoubleNegativeNegative() {
        Assertions.assertEquals(-2.000, Calculator.sum(-1.0, -1.0), 0.001);
    }

    @Test  @DisplayName("sum positive and positive double check")
    public void testSumDoublePositivePositive() {
        Assertions.assertEquals(2.000, Calculator.sum(1.0, 1.0), 0.001);
    }

    @Test  @DisplayName("sum positive and zero double check")
    public void testSumDoublePositiveZero() {
        Assertions.assertEquals(1.000, Calculator.sum(1.0, 0), 0.001);
    }

    @Test @DisplayName("sum negative and zero double check")
    public void testSumDoubleNegativeZero() {
        Assertions.assertEquals(-1.000, Calculator.sum(-1.0, 0), 0.001);
    }

    @Test @DisplayName("subtract positive and negative double check")
    public void testSubtractDoublePositiveNegative() {
        Assertions.assertEquals(-2.000, Calculator.subtract(-1.0, 1.0), 0.001);
    }

    @Test @DisplayName("subtract negative double from negative double")
    public void testSubtractDoubleNegativeNegative() {
        Assertions.assertEquals(0, Calculator.subtract(-1.1, -1.1), 0.001);
    }

    @Test @DisplayName("subtract positive double from positive double")
    public void testSubtractDoublePositivePositive() {
        Assertions.assertEquals(0, Calculator.subtract(1.1, 1.1));
    }

    @Test @DisplayName("subtract zero from positive double")
    public void testSubtractDoublePositiveZero() {
        Assertions.assertEquals(1.1, Calculator.subtract(1.1, 0));
    }

    @Test  @DisplayName("subtract zero from negative double")
    public void testSubtractDoubleNegativeZero() {
        Assertions.assertEquals(-1.100, Calculator.subtract(-1.1, 0), 0.001);
    }

    @Test @DisplayName("multiply positive double by negative double")
    public void testMultiplyDoublePositiveNegative() {
        Assertions.assertEquals(-1.210, Calculator.multiply(-1.1, 1.1), 0.001);
    }

    @Test @DisplayName("multiply negative double by negative double")
    public void testMultiplyDoubleNegativeNegative() {
        Assertions.assertEquals(1.210, Calculator.multiply(-1.1, -1.1), 0.001);
    }

    @Test @DisplayName("multiply positive double by positive double")
    public void testMultiplyDoublePositivePositive() {
        Assertions.assertEquals(1.210, Calculator.multiply(1.1, 1.1), 0.001);
    }

    @Test @DisplayName("multiply positive double by zero")
    public void testMultiplyDoublePositiveZero() {
        Assertions.assertEquals(0, Calculator.multiply(1.1, 0));
    }

    @Test @DisplayName("multiply negative double by zero")
    public void testMultiplyDoubleNegativeZero() {
        Assertions.assertEquals(-0.0, Calculator.multiply(-1.1, 0));
    }

    @Test @DisplayName("divide negative double by positive double")
    public void testDivideDoublePositiveNegative() {
        Assertions.assertEquals(-1, Calculator.divide(-1.1, 1.1));
    }

    @Test @DisplayName("divide negative double by negative double")
    public void testDivideDoubleNegativeNegative() {
        Assertions.assertEquals(1, Calculator.divide(-1.0, -1.0));
    }

    @Test @DisplayName("divide positive double by positive double")
    public void testDivideDoublePositivePositive() {
        Assertions.assertEquals(1, Calculator.divide(1.1, 1.1));
    }

    @Test @DisplayName("divide positive double by zero (IllegalArgumentException expected)")
    public void testDivideDoublePositiveZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1.8, 0));
    }

    @Test @DisplayName("divide negative double by zero (IllegalArgumentException expected)")
    public void testDivideDoubleNegativeZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-1.9, 0));
    }

    @Test @DisplayName("sum string negative int and string positive double")
    public void testSumStringPositiveNegative() {
        Assertions.assertEquals("0.0", Calculator.sumString("-1", "1.0"));
    }

    @Test @DisplayName("sum string negative int and string negative double")
    public void testSumStringNegativeNegative() {
        Assertions.assertEquals("-2.9", Calculator.sumString("-1", "-1.9"));
    }

    @Test @DisplayName("sum string positive int and string positive double")
    public void testSumStringPositivePositive() {
        Assertions.assertEquals("2.9", Calculator.sumString("1", "1.9"));
    }

    @Test @DisplayName("sum string positive int and string 0")
    public void testSumStringPositiveZero() {
        Assertions.assertEquals("1.0", Calculator.sumString("1", "0"));
    }

    @Test @DisplayName("sum string negative int and string 0")
    public void testSumStringNegativeZero() {
        Assertions.assertEquals("-1.0", Calculator.sumString("-1", "0"));
    }

    @Test @DisplayName("subtract string negative int and string positive double")
    public void testSubtractStringPositiveNegative() {
        Assertions.assertEquals("-2.6", Calculator.subtractString("-1", "1.6"));
    }

    @Test @DisplayName("subtract string negative int and string negative double")
    public void testSubtractStringNegativeNegative() {
        Assertions.assertEquals("0.8999999999999999", Calculator.subtractString("-1", "-1.9"));
    }

    @Test @DisplayName("subtract string positive int and string positive double")
    public void testSubtractStringPositivePositive() {
        Assertions.assertEquals("-0.3999999999999999", Calculator.subtractString("1", "1.4"));
    }

    @Test @DisplayName("subtract string positive int and string 0")
    public void testSubtractStringPositiveZero() {
        Assertions.assertEquals("1.0", Calculator.subtractString("1", "0"));
    }

    @Test @DisplayName("subtract string negative int and string 0")
    public void testSubtractStringNegativeZero() {
        Assertions.assertEquals("-1.0", Calculator.subtractString("-1", "0"));
    }

    @Test @DisplayName("multiply string negative int and string positive double")
    public void testMultiplyStringPositiveNegative() {
        Assertions.assertEquals("-1.9", Calculator.multiplyString("-1", "1.9"));
    }

    @Test @DisplayName("multiply string negative int and string negative double")
    public void testMultiplyStringNegativeNegative() {
        Assertions.assertEquals("1.6", Calculator.multiplyString("-1", "-1.6"));
    }

    @Test @DisplayName("multiply string positive int and string positive double")
    public void testMultiplyStringPositivePositive() {
        Assertions.assertEquals("1.9", Calculator.multiplyString("1", "1.9"));
    }

    @Test @DisplayName("multiply string positive int and string 0")
    public void testMultiplyStringPositiveZero() {
        Assertions.assertEquals("0.0", Calculator.multiplyString("1", "0"));
    }

    @Test @DisplayName("multiply string negative int and string 0")
    public void testMultiplyStringNegativeZero() {
        Assertions.assertEquals("-0.0", Calculator.multiplyString("-1", "0"));
    }

    @Test @DisplayName("divide string negative int by string positive double")
    public void testDivideStringPositiveNegative() {
        Assertions.assertEquals("-0.5555555555555556", Calculator.divideString("-1", "1.8"));
    }

    @Test @DisplayName("divide string negative int by string negative double")
    public void testDivideStringNegativeNegative() {
        Assertions.assertEquals("0.7142857142857143", Calculator.divideString("-1", "-1.4"));
    }

    @Test @DisplayName("divide string positive int by string positive double")
    public void testDivideStringPositivePositive() {
        Assertions.assertEquals("0.5882352941176471", Calculator.divideString("1", "1.7"));
    }

    @Test @DisplayName("divide string positive int by string 0 (IllegalArgumentException expected)")
    public void testDivideStringPositiveZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divideString("1", "0"));
    }

    @Test @DisplayName("divide string negative int by string 0 (IllegalArgumentException expected)")
    public void testDivideStringNegativeZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divideString("-1", "0"));
    }
}
