import java.util.Scanner;

public class Ex5t3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter IC number: ");
        String icNumber = scanner.nextLine();
        
        String birthStateCode = icNumber.substring(7,9);
        String birthState = getStateName(birthStateCode);
        
        String birthDate = icNumber.substring(0,6);
        int birthYearPrefix = Integer.parseInt(icNumber.substring(0,2));
        
        int birthYear = (birthYearPrefix >= 00 && birthYearPrefix <= 21)? 2000+ birthYearPrefix : 1900 + birthYearPrefix;
        
        String day = birthDate.substring(0, 2);
        String month = getMonthName(birthDate.substring(2, 4));
        String year = birthDate.substring(4,6);
        
        String output = "Name: ".concat(name)
                .concat("\nIC Number:" ).concat(icNumber)
                .concat("\nBirth Date: ").concat(day).concat("").concat(month).concat("").concat(year)
                .concat("\nBirth Year: ").concat(Integer.toString(birthYear))
                .concat("\nBirth State: ").concat(birthState);
        System.out.println(output);
    }
    private static String getStateName(String stateCode){
        switch(stateCode){
            case "01":return "Johor";
            case "02":return "Kedah";
            case "03":return "Kelantan";
            case "04":return "Malacca";
            case "05":return "Negeri Sembilan";
            case "06":return "Pahang";
            case "07":return "Penang";
            case "08":return "Perak";
            case "09":return "Perlis";
            case "10":return "Selangor";
            case "11":return "Terengganu";
            case "12":return "Sabah";
            case "13":return "Sarawak";
            case "14":return "Federal Territory of Kuala Lumpur";
            case "15":return "Federal Territory of Labuan";
            case "16":return "Feberal Territory of Putrajaya";
            default:return "Unknown";
    }
    }
    private static String getMonthName(String monthCode){
        switch(monthCode){
            case "01":return "January";
            case "02":return "February";
            case "03":return "March";
            case "04":return "April";
            case "05":return "May";
            case "06":return "June";
            case "07":return "July";
            case "08":return "August";
            case "09":return "September";
            case "10":return "October";
            case "11":return "November";
            case "12":return "December";
            default:return "Unknown";
        }
    }
}
