public class StaffUUM {
    private String staffID;
    private String staffname;
    private String school;
    private String stafftype;
    private double salary;
    
    public StaffUUM(String name, String staffID, String school, String staffType) {
        this.staffname = name;
        this.staffID = staffID;
        this.school = school;
        this.stafftype = staffType;
    }
    
    public void calculatePermanentSalary(double basic, double allowance) {
        this.salary = basic + allowance;
    }
    
    public void calculatePartTimeSalary(int hours, double rate) {
        this.salary = hours * rate;
    }
    
    public String toString() {
        return "Staff Name: " + this.staffname + "\n" +
               "Staff ID: " + this.staffID + "\n" +
               "School: " + this.school + "\n" +
               "Staff Type: " + this.stafftype + "\n" +
               "Salary: " + this.salary;
    }
}
