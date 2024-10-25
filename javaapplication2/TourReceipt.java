/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

public class TourReceipt {
    private String receiptNo;
    private String packageName;
    private int noOfAdult;
    private int noOfChild;
    private double totalPrice;
    
    public TourReceipt(String receiptNo, String packageName, int noOfAdult, int noOfChild) {
        this.receiptNo = receiptNo;
        this.packageName = packageName;
        this.noOfAdult = noOfAdult;
        this.noOfChild = noOfChild;
    }
    
    public void calcIslandHopping() {
        if (noOfAdult + noOfChild >= 8 && noOfAdult + noOfChild <= 10) {
            totalPrice = 150 * noOfAdult + 100 * noOfChild;
            totalPrice *= 0.95; // 5% discount
        } else {
            totalPrice = 150 * noOfAdult + 100 * noOfChild;
        }
    }
    
    public void calcDayTour() {
        totalPrice = 258 * noOfAdult + 200 * noOfChild;
    }
    
    public String toString() {
        String output = "------Your Receipt-----" +"\n"
                        +"Receipt No.: " + receiptNo + "\n"
                        + "Package Name: " + packageName + "\n"
                        + "Number of Adults: " + noOfAdult + "\n"
                        + "Number of Children: " + noOfChild + "\n"
                        + "Total Price: RM " + String.format("%.2f", totalPrice)+"\n"
                        + "-------Thank You-------";
        if (packageName.equals("i") && noOfAdult + noOfChild >= 8 && noOfAdult + noOfChild <= 10) {
            output += " (5% discount applied)"; 
        }
        return output;
    }
}