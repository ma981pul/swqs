import java.math.BigDecimal;

/**
 * This interface provides calculating methods for Calculators
 */
public interface ICalculator {

    /**
     *
     * @param firstNumber is the first summand
     * @param secondNumber is the second summand
     * @return the sum of firstNumber and secondNumber
     */
    int add (int firstNumber, int secondNumber);

    /**
     *
     * @param firstNumber is the dividend
     * @param secondNumber is the divisor
     * @return the division of firstNumber and secondNumber
     */
    double divide (int firstNumber, int secondNumber);
}
