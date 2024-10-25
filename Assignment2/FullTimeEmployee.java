/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;

public class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double totalSalary;

    public FullTimeEmployee(String empID, String empName, int empDuration, double basicSalary) {
        super(empID, empName, empDuration);
        this.basicSalary = basicSalary;
    }

    public void calculateSalary() {
        double bonus = calculateBonus(basicSalary);
        totalSalary = basicSalary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBasic Salary: " + basicSalary + "\nTotal Salary: " + totalSalary;
    }
}