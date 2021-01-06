import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator implements ICalculator{

    int result;

    @Override
    public int add (int firstNumber, int secondNumber) {
        result = firstNumber + secondNumber;
        if (firstNumber >= 0 && secondNumber >= 0) {
            if (result < 0) throw new IllegalArgumentException("Number is too high");
        } else if (firstNumber <= 0 && secondNumber <= 0) {
            if (result > 0) throw new IllegalArgumentException("Number is too low");
        }
        return result;

    }

    @Override
    public double divide(int firstNumber, int secondNumber){
        if (secondNumber == 0) throw new ArithmeticException("divisor must not be 0");
        return (double) firstNumber / (double) secondNumber;
    }

}
