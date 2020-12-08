import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IOperationTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testCalculate() {
        assertEquals(7, calculator.add(2, 5));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-23, calculator.add(-91, 68));
        assertEquals(5, calculator.subtract(22, 17));
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(-45, calculator.subtract(-45, 0));
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }
}