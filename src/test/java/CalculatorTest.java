import ie.gmit.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator myCalc;

    @DisplayName("Add two numbers")
    @Test
    void testAddTrue()
    {
        myCalc = new Calculator();
        assertEquals(10,myCalc.add(5,5));
    }

    @Test
    void testAddFalse()
    {
        myCalc = new Calculator();
        assertThrows(IllegalArgumentException.class,() -> myCalc.add(0,3));
    }


}
