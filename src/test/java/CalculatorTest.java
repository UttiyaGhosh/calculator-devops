import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void addingTwoFloatsTruePositive(){
        assertEquals("Adding two integer numbers for True Positive", 4, calculator.add(2, 2), DELTA);
        assertEquals("Adding two double numbers for True Positive", 5.3, calculator.add(2.1, 3.2), DELTA);
    }

    @Test
    public void addingTwoFloatsFalsePositive(){
        Calculator calculator = new Calculator();
        assertNotEquals("Adding two integer numbers for False Positive", 6, calculator.add(2, 2), DELTA);
        assertNotEquals("Adding two double numbers for False Positive", 7.3, calculator.add(2.1, 3.2), DELTA);
    }
}
