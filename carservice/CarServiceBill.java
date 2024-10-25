
package carservice;

public class CarServiceBill {
    private String custName;
    private String plateNo;
    private String carModel;
    private double cc;
    private int km;
    private boolean membership;
    private double payment;
    private String services;

    public CarServiceBill(String custName, String plateNo, String carModel, double cc, int km, boolean membership, String services) {
        this.custName = custName;
        this.plateNo = plateNo;
        this.carModel = carModel;
        this.cc = cc;
        this.km = km;
        this.membership = membership;
        this.services = services;
    }

    public void determineFinalPayment(double total) {
        if (membership) {
            payment = total * 0.8; // 20% discount for members
        } else {
            payment = total;
        }
    }

    @Override
    public String toString() {
        return "Customer Name: " + custName +
                "\nPlate No: " + plateNo +
                "\nCar Model: " + carModel +
                "\nEngine Capacity: " + cc +
                "\nKilometers: " + km +
                "\nMembership: " + (membership ? "Yes" : "No") +
                "\nServices: " + services +
                "\nPayment: RM" + String.format("%.2f", payment);
    }
}
