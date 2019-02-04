import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;


    @Test
    public void hasAdd(){
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.add(3, 6));
    }

    @Test
    public void hasSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(10, 8));
    }

    @Test
    public void hasMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.multiply(4,5));
    }

    @Test
    public void hasDivide(){
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.divide(21, 3));
    }
}
