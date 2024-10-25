package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scan = new Scanner(System.in);
        char ans = 'y';

        do {
            try {
                System.out.print("Enter number 1: ");
                number1 = scan.nextInt();

                System.out.print("Enter number 2: ");
                number2 = scan.nextInt();

                Calculator calculator = new Calculator(number1, number2);

                System.out.println("SUM = " + calculator.calcSum());
                System.out.println("AVERAGE = " + calculator.calcAverage());
                System.out.println("DIVISION = " + calculator.calcDivision());

                ans = 'n';
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! It should be digits only.");
                scan.nextLine(); // Clear the input buffer
            } catch (ArithmeticException e) {
                System.out.println("Invalid division by 0!");
                scan.nextLine(); // Clear the input buffer
            } catch (Exception e) {
                System.out.println("CAUTION!! " + e.getMessage());
                scan.nextLine(); // Clear the input buffer
            }
        } while (ans == 'y');

        scan.close();
    }
}
