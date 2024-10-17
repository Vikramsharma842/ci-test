import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        // Test cases
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should equal 0");
        assertEquals(-1, calculator.add(-1, 0), "-1 + 0 should equal -1");
        assertEquals(10, calculator.add(7, 3), "7 + 3 should equal 10");
        assertEquals(4, calculator.add(1, 3), "1 + 3 should equal 4");
    }
}

