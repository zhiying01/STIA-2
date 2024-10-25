/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupProject;
import java.util.*;
/**
 *
 * @author weioo
 */
public class TaxiFare {
    private String name, ic, phoneNO, from, to;
    private double kilometer, fare;
    private boolean day;
    private boolean night; 
   // private int surcharge;
    private boolean airport;
    private boolean luggage;
    private boolean orderByPhone;
    
   
    
    public TaxiFare(String name,String ic,String phoneNO,String from, String to, double kilometer, boolean day, boolean night, boolean airport, boolean luggage,boolean orderByPhone) {
        this.name = name;
        this.ic = ic;
        this.phoneNO = phoneNO;
        this.from = from;
        this.to = to;
        this.kilometer = kilometer;
        this.day = day;
        this.night = night;
        this.airport = airport;
        this.luggage = luggage;
        this.orderByPhone = orderByPhone;
        
        calculateTaxiFareDay();
        calculateTaxiFareNight();
        
}

    public double calculateTaxiFareDay(){
        double baseFare = 3;
        double perKilometerPrice = 1.25;
        double fare = baseFare + ((kilometer - 1) * perKilometerPrice);
      if(day == true){
        if(airport == true){
        if(kilometer <= 1){
            fare += baseFare + 12; 
        }
        if(kilometer > 1){
            fare += baseFare + ((kilometer-1) * perKilometerPrice) + 12;
        }
       }//airport
       if(luggage == true){
        if(kilometer <= 1){
            fare += baseFare + 1; 
        }
        if(kilometer > 1){
            fare += baseFare + ((kilometer-1) * perKilometerPrice) + 1;
        }
       }//luggage
       if(orderByPhone == true){
        if(kilometer <= 1){
            fare += baseFare + 12; 
        }
        if(kilometer > 1){
            fare += baseFare + ((kilometer-1) * perKilometerPrice) + 12;
        }
       }//orderByPhone
       
        if(kilometer <= 1){
            fare = baseFare; 
        }
        if(kilometer > 1){
            fare = baseFare + ((kilometer-1) * perKilometerPrice);
       }
         // Add surcharge if applicable
    if (airport) {
        fare += 12;
    }
    if (luggage) {
        fare += 1;
    }
    if (orderByPhone) {
        fare += 12;
    }
        this.fare = fare;
      }
        return fare;
    }
    
    public double calculateTaxiFareNight(){
        double baseFare = 4.5;
        double perKilometerPrice = 1.88;
        double fare = baseFare + ((kilometer - 1) * perKilometerPrice);
       if(night == true){
       if(airport == true){
        if(kilometer <= 1){
            fare += baseFare + 12; 
        }
        if(kilometer > 1){
            fare += baseFare + ((kilometer-1) * perKilometerPrice) + 12;
        }
       }//airport
       if(luggage == true){
        if(kilometer <= 1){
            fare += baseFare + 1; 
        }
        if(kilometer > 1){
            fare += baseFare + ((kilometer-1) * perKilometerPrice) + 1;
        }
       }//luggage
       if(orderByPhone == true){
        if(kilometer <= 1){
            fare += baseFare + 12; 
        }
        if(kilometer > 1){
            fare += baseFare + ((kilometer-1) * perKilometerPrice) + 12;
        }
       }//orderByPhone
       
        if(kilometer <= 1){
            fare = baseFare; 
        }
        if(kilometer > 1){
            fare = baseFare + ((kilometer-1) * perKilometerPrice);
       }
         if (airport) {
        fare += 12;
    }
    if (luggage) {
        fare += 1;
    }
    if (orderByPhone) {
        fare += 12;
    }

        this.fare = fare;
       }
        return fare;
    }
    
    public String getName(){
        return name;
    }
    
       public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDay(boolean day) {
        this.day = day;
    }
    
   
//    public double calculateTaxiFare() {
//        double baseFare = 0;
//        double perKilometerPrice = 0;
//        
//        if (dayOrNight.equals("day")) {
//            baseFare = 3.0;
//            perKilometerPrice = 1.25;
//        } 
//        else if (dayOrNight.equals("night")) {
//            baseFare = 4.5;
//            perKilometerPrice = 1.88;
//        }
//        else {
//            throw new IllegalArgumentException("Invalid day or night value");
//        }
//        
//        return baseFare + kilometer * perKilometerPrice;
//    }
    
   
    
    public String toString() {
         String dayOrNight = null;
        if(day == true){
             dayOrNight = "Day";
        }
        if(night == true){
            dayOrNight = "Night";
        }
        return "Name : "+ name
             + "\nIdentity card number:" + ic 
             + "\nPhone number:" + phoneNO
             + "\nkilometer: "+ kilometer
             + "\nFrom:" + from
             + "\nTo:" + to
             + "\nDay or Night:" + dayOrNight
             +String.format("\nFare: RM%.2f",fare);
    }
}

