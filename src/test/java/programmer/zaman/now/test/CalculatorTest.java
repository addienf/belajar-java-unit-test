package programmer.zaman.now.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Calculator")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Function Calculator.add(Integer, Integer")
    public void testAddSuccess(){
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Test Success Function Calculator.devide(Integer, Integer)")
    public void testDevideSuccess(){
        var result = calculator.devide(100, 10);
        assertEquals(10, result);
    }

    @Test
    @DisplayName("Test Fail Function Calculator.devide(Integer, Integer)")
    public void testDevideError(){
        assertThrows(IllegalArgumentException.class, () ->{
           calculator.devide(100, 0);
        });
    }
}
