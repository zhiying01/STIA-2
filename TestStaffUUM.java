import java.util.Scanner;

public class TestStaffUUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter staff ID: ");
            String staffID = input.nextLine();
            
            System.out.print("Enter staff name: ");
            String staffName = input.nextLine();
            
            System.out.print("Enter school: ");
            String school = input.nextLine();
            
            System.out.print("Enter staff type (1 - permanent, 2 - part-time): ");
            String staffType = input.nextLine();
            
            if(!staffType.equals("1") && !staffType.equals("2")) {
                System.out.println("Exiting program...");
                break;
            }
            
            StaffUUM staff;
            
            if(staffType.equals("1")) {
                System.out.print("Enter basic salary: ");
                double basic = input.nextDouble();
                
                System.out.print("Enter allowance: ");
                double allowance = input.nextDouble();
                
                staff = new StaffUUM(staffName, staffID, school, staffType);
                staff.calculatePermanentSalary(basic, allowance);
            }
            else {
                System.out.print("Enter total hours worked: ");
                int hours = input.nextInt();
                
                System.out.print("Enter rate per hour: ");
                double rate = input.nextDouble();
                
                staff = new StaffUUM(staffName, staffID, school, staffType);
                staff.calculatePartTimeSalary(hours, rate);
            }
            
            System.out.println(staff.toString());
            input.nextLine();
            
            System.out.print("Do you want to continue calculating salaries? (y/n): ");
            String answer = input.nextLine();
            
            if(!answer.equalsIgnoreCase("y")) {
                System.out.println("Thank You!!");
                break;
            }
        }
        
        input.close();
    }
}
