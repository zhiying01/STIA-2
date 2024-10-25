
package Inheritance;

public class TestStaffUUMInheritance {

    public static void main(String[] args) {
        StaffUUM staff = new StaffUUM();
        staff.setName("Aminah");
        staff.setStaffID("11900");
        staff.setSalary(6000.00);
        
        Malaysian Malaysian = new Malaysian();
        Malaysian.setICNum("760304-08-3800");
        Malaysian.setResidentalStatus("Permanant Residence");
        
        International International = new International();
        International.setPassportNum("F9888900");
        International.setOriginCountry("India");
        
        System.out.println("UUM Staff");
        System.out.println(staff.toString());
        System.out.println("Malaysian UUM Staff");
        System.out.println(Malaysian.toString());
        System.out.println("International UUM Staff");
        System.out.println(International.toString());
        
        
    }
    
}
