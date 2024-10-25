package calculator;

public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double calcSum() throws Exception {
        int sum = number1 + number2;
        if (sum <= 0) {
            throw new Exception("The sum is less than or equal to 0");
        }
        return sum;
    }

    public double calcDivision() throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Invalid division by 0");
        }
        double division = (double) number1 / number2;
        return division;
    }

    public double calcAverage() throws Exception {
        double average = (number1 + number2) / 2.0;
        if (average < 1 || average > 10) {
            throw new Exception("The average must be between 1 to 10");
        }
        return average;
    }
}
