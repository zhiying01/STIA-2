
package project;

public class TaxiFare {
    private String name;
    private double kilometer;
    private String dayOrNight; 
    
public TaxiFare(String name, double kilometer, String dayOrNight) {
        this.name = name;
        this.kilometer = kilometer;
        this.dayOrNight = dayOrNight;
}
public double calculateTaxiFare() {
        double baseFare = 0;
        double perKilometerPrice = 0;

        if (dayOrNight.equals("day")) {
            baseFare = 3.0;
            perKilometerPrice = 1.25;
        } else {
            baseFare = 4.5;
            perKilometerPrice = 1.88;
        }
        
        return baseFare + kilometer * perKilometerPrice;
    }
    @Override
    public String toString() {
        return "Name : "+name
                +"\nkilometer: "+kilometer
                +"\nDay or Night: " +dayOrNight
            +String.format("\nFare: RM%.2f", calculateTaxiFare()
        );
    }
}
