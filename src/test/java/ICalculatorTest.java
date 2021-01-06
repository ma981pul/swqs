import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ICalculatorTest {

    ICalculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        assertEquals(0, calculator.add(0, 0));
        assertEquals(10, calculator.add(5, 5));
        assertEquals(-10, calculator.add(-5, -5));
        assertEquals(1000, calculator.add(637, 363));
        assertEquals(-1000, calculator.add(-637, -363));
        assertEquals(Integer.MAX_VALUE - 1, calculator.add(Integer.MAX_VALUE - 728374, 728373));
        assertEquals(Integer.MIN_VALUE + 1, calculator.add(Integer.MIN_VALUE + 728374, -728373));
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MAX_VALUE - 728374, 728374));
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MIN_VALUE + 728374, -728374));
    }

    @Test
    public void addTooLargeNumbersTest() {
        try {
            calculator.add(Integer.MAX_VALUE - 8, 9);
        } catch(IllegalArgumentException e) {
            assertEquals("Number is too high", e.getMessage());
        }
        try {
            calculator.add(Integer.MIN_VALUE + 8, -9);
        } catch(IllegalArgumentException e) {
            assertEquals("Number is too low", e.getMessage());
        }

    }

    @Test
    public void divideTest() {
        assertEquals(0.0, calculator.divide(0, 8), 0);
        assertEquals(9.0, calculator.divide(-81, -9), 0);
        assertEquals(-9.0, calculator.divide(81, -9), 0);
        assertEquals(2.5, calculator.divide(5, 2), 0);
        assertEquals(-2.5, calculator.divide(5, -2), 0);
        assertEquals((double)(Integer.MAX_VALUE - 1) / 2, calculator.divide(Integer.MAX_VALUE - 1, 2), 0);
        assertEquals((double)(Integer.MIN_VALUE + 1) / 2, calculator.divide(Integer.MIN_VALUE + 1, 2), 0);
        assertEquals((double)(Integer.MAX_VALUE) / 2, calculator.divide(Integer.MAX_VALUE, 2), 0);
        assertEquals((double)(Integer.MIN_VALUE) / 2, calculator.divide(Integer.MIN_VALUE, 2), 0);
    }

    @Test(expected=ArithmeticException.class)
    public void divideWithZeroTest() {
        calculator.divide(12, 0);
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}