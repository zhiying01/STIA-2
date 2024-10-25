package Inheritance;

public class StaffUUM {

    private String name;
    private String staffID;
    private double salary;

    public void setName(String staffName) {
        this.name = staffName;
    }

    public void setStaffID(String ID) {
        this.staffID = ID;
    }

    public void setSalary(Double staffSalary) {
        this.salary = staffSalary;
    }

    public String toString() {
        return "Name: " + name + "\nStaff ID: " + staffID + "\nsalary: " + salary;
    }
}
