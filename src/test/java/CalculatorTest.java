import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(2,1));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    public void canDivide(){
        assertEquals(3.5, calculator.divide(7,2), 0.00);
    }


}