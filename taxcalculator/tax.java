package taxcalculator;

public class tax {
    private String name;
    private double taxableIncome;
    private String status;
    private double taxAmount;
    private static final double RATE1 = 0.10; //tax rate 10%
    private static final double RATE2 = 0.20; //tax rate 20%
    private static final double RATE3 = 0.35; //tax rate 35%

    // Constructor
    public tax(String name, double taxableIncome, String status) {
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
        } else if (status.equals("Married")) {
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

