/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextFile;

/**
 *
 * @author zys
 */
public class Tax {
    private double taxableIncome;
    private String status;
    private double taxAmount;
    private String name;
    private final double RATE1 = 0.10; // tax rate 10%
    private final double RATE2 = 0.20; // tax rate 20%
    private final double RATE3 = 0.35; // tax rate 30%

    public Tax(String name, double taxableIncome, String status) {
        this.name = name;
        this.taxableIncome = taxableIncome;
        this.status = status;
    }
    public double calculateTax() {
        if (status.equals("Single")) {
            if (taxableIncome <= 21000) {
                taxAmount = RATE1 * taxableIncome;
            } else if (taxableIncome <= 51000) {
                taxAmount = RATE2 * taxableIncome;
            } else {
                taxAmount = RATE3 * taxableIncome;
            }
        } else {
            if (taxableIncome <= 35000) {
                taxAmount = RATE1 * taxableIncome;
            } else if (taxableIncome <= 86000) {
                taxAmount = RATE2 * taxableIncome;
            } else {
                taxAmount = RATE3 * taxableIncome;
            }
        }
        return taxAmount;
    }
}


