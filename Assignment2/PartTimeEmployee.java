/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

public class PartTimeEmployee extends Employee {
    private final int hoursWorked;
    private double totalSalary;

    public PartTimeEmployee(String empID, String empName, int empDuration, int hoursWorked) {
        super(empID, empName, empDuration);
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        double hourlyRate = 15.0;
        double basicSalary = hoursWorked * hourlyRate;
        double bonus = calculateBonus(basicSalary);
        totalSalary = basicSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHours Worked: " + hoursWorked + "\nTotal Salary: " + totalSalary;
    }
}