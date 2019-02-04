import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void hasAdd(){
        assertEquals(9, calculator.add(3, 6));
    }

    @Test
    public void hasSubtract(){
        assertEquals(2, calculator.subtract(10, 8));
    }

    @Test
    public void hasMultiply(){
        assertEquals(20, calculator.multiply(4,5));
    }

    @Test
    public void hasDivide(){
        assertEquals(7, calculator.divide(21, 3));
    }
}
