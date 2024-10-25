package TextFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaxCalculatorOne {

    public static void main(String[] args) throws IOException {
        String name, status;
        int choice;
        double income, taxableIncome, deduction, taxAmount;

        Scanner scan = new Scanner(System.in);

        FileWriter fileWriter = new FileWriter("tax_report.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.print("Please enter 1 to insert taxpayer's information or 9999 to stop: ");
        choice = scan.nextInt();

        while (choice != 9999) {
            System.out.print("\nPlease enter the name of the taxpayer: ");
            name = scan.next() + scan.nextLine();
            System.out.print("Please enter the status [Single/Married]: ");
            status = scan.nextLine();
            System.out.print("Please enter the total income: ");
            income = scan.nextDouble();
            System.out.print("Please enter the deduction amount: ");
            deduction = scan.nextDouble();

            // Calculate taxable income
            taxableIncome = income - deduction;

            // Create Tax object
            Tax tax = new Tax(name, taxableIncome, status);

            // Call method calculateTax()
            taxAmount = tax.calculateTax();

            System.out.printf("The tax amount that needs to be paid is RM %.2f%n", taxAmount);
            System.out.println("*********************************************");

            // Set header of columns for the text file
            printWriter.printf("%-20s%-20s%-30s%-30s%n", "Name", "Status", "Income", "Tax");

            // Write to text file using printf
            printWriter.printf("%-20s%-20s%-30.2f%-30.2f%n", name, status, income, taxAmount);

            System.out.print("Please enter 1 to insert taxpayer's information or 9999 to stop: ");
            choice = scan.nextInt();
        }

        // Close stream
        printWriter.close();
        fileWriter.close();
    }
}
