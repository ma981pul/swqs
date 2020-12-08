public class Calculator {

    public double add (double firstNumber, double secondNumber) {
        Addition addition = new Addition();
        return addition.calculate(firstNumber, secondNumber);
    }

    public double subtract (double firstNumber, double secondNumber) {
        Subtraction subtraction = new Subtraction();
        return subtraction.calculate(firstNumber, secondNumber);
    }
}
