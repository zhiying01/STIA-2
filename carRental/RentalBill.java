package carRental;

public class RentalBill {

    private int billNo;
    private String customerName;
    private String license;
    private String icNo;
    private String address;
    private String plateNo;
    private int selectedDay;
    private String selectedMonth;
    private int selectedYear;
    private double hours;
    private String destination;
    private String carModel;
    private double payment;

    public RentalBill(int billNo, String customerName, String license, String icNo, String address, String plateNo, int selectedDay, String selectedMonth, int selectedYear, double hours, String destination, String carModel) {
        this.billNo = billNo;
        this.customerName = customerName;
        this.license = license;
        this.icNo = icNo;
        this.address = address;
        this.plateNo = plateNo;
        this.selectedDay = selectedDay;
        this.selectedMonth = selectedMonth;
        this.selectedYear = selectedYear;
        this.hours = hours;
        this.destination = destination;
        this.carModel = carModel;
    }

    public void calculatePayment() {
        if (hours < 24) {
            payment = 5 + ((hours - 1) * 4);
        } else if (hours == 24) {
            payment = 90;
        } else {
            payment = hours / 24 * 85;
        }
    }

    public String toString() {
        return "Bill No.: " + billNo
                + "\nCustomer's Name: " + customerName
                + "\nLicense: " + license
                + "\nI/C Number: " + icNo
                + "\nAddress: " + address
                + "\nPlate No: " + plateNo
                + "\nRental Date: " + selectedDay + "/" + selectedMonth + "/" + selectedYear
                + "\nRental Hours: " + hours
                + "\nDestination: " + destination
                + "\nCar Model: " + carModel
                + String.format("\nPayment: RM%.2f", payment);
    }
}
