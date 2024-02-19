import it.academy.yuliyaabramovitch.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testPositiveIntValuesSumCalculating() {
        Assertions.assertEquals(8, Calculator.calculateSum(2147483647, 2147483647));
    }
    @Test
    public void testNegativeIntValuesSumCalculating() {
        Assertions.assertEquals(-13, Calculator.calculateSum(-10, -3));
    }
    @Test
    public void testPositiveAndNegativeIntValuesSumCalculating() {
        Assertions.assertEquals(-2, Calculator.calculateSum(-10, 8));
    }
    @Test
    public void testPositiveIntAndZeroValuesSumCalculating() {
        Assertions.assertEquals(3, Calculator.calculateSum(0, 3));
    }
    @Test
    public void testNegativeIntAndZeroValuesSumCalculating() {
        Assertions.assertEquals(-3, Calculator.calculateSum(0, -3));
    }
    @Test
    public void testMaxIntAndIntValuesSumCalculating(){
        Assertions.assertEquals(-1, Calculator.calculateSum(-2147483648, 2147483647));
    }
}
