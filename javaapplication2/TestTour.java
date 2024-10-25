
package javaapplication2;

import java.util.Scanner;

public class TestTour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter receipt number: ");
        String receiptNo = input.nextLine();
        System.out.print("Enter package name (I/D): ");
        String packageName = input.nextLine();
        System.out.print("Enter number of adults: ");
        int noOfAdult = input.nextInt();
        System.out.print("Enter number of children: ");
        int noOfChild = input.nextInt();
        
        TourReceipt receipt = new TourReceipt(receiptNo, packageName.equals("i") ? "Island Hopping" : "Day Tour", noOfAdult, noOfChild);
        if (packageName.equals("i")) {
            receipt.calcIslandHopping();
        } else if (packageName.equals("d")) {
            receipt.calcDayTour();
        }
        System.out.println(receipt.toString());
        
        input.close();
    }
}