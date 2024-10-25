/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextFile;
/**
 *
 * @author zys
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaxCalculatorIterative {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String name, status;
        int choice;
        double income, taxableIncome, deduction, taxAmount;

        // Setup file and stream
        FileWriter fileWriter = new FileWriter("tax_report.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        System.out.print("Please enter 1 to insert taxpayer's information or 9999 to stop: ");
        choice = scan.nextInt();

        printWriter.printf("%-20s%-20s%-30s%-30s%n", "Name", "Status", "Income", "Tax");

        while (choice != 9999) {
            // Read input
            System.out.print("\nPlease enter the name of the taxpayer: ");
            name = scan.next() + scan.nextLine();
            System.out.print("Please enter the status [Single/Married]: ");
            status = scan.nextLine();
            System.out.print("Please enter the total income: ");
            income = scan.nextDouble();
            System.out.print("Please enter the deduction amount: ");
            deduction = scan.nextDouble();

            taxableIncome = income - deduction;
            Tax tax = new Tax(name, taxableIncome, status);
            taxAmount = tax.calculateTax();

            System.out.printf("The tax amount that needs to be paid is RM %.2f%n", taxAmount);
            System.out.println("*********************************************");
            printWriter.printf("%-20s%-20s%-30.2f%-30.2f%n", name, status, income, taxAmount);

            System.out.print("Please enter 1 to insert taxpayer's information or 9999 to stop: ");
            choice = scan.nextInt();
        }
        printWriter.close();
        fileWriter.close();
    }
}

