package Assignment2;

public class Employee {
    private final String empID;
    private final String empName;
    private final int empDuration;

    public Employee(String empID, String empName, int empDuration) {
        this.empID = empID;
        this.empName = empName;
        this.empDuration = empDuration;
    }

    public double calculateBonus(double basicSalary) {
        double bonus;
        if (empDuration <= 6) {
            bonus = 0.3 * basicSalary;
        } else if (empDuration <= 12) {
            bonus = 0.5 * basicSalary;
        } else {
            bonus = 0.8 * basicSalary;
        }
        return bonus;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nEmployment Duration: " + empDuration + " months";
    }
}
