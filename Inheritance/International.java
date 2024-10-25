package Inheritance;

public class International {

    private String passportNum;
    private String originCountry;

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String toString() {
        return "Passport Number: " + passportNum + "\nOriginal Country: " + originCountry;
    }
}
