package Inheritance;

public class Malaysian {

    private String icNum;
    private String residentalStatus;

    public void setICNum(String icNum) {
        this.icNum = icNum;
    }

    public void setResidentalStatus(String residentalStatus) {
        this.residentalStatus = residentalStatus;
    }

    public String toString() {
        return "IC Num: " + icNum + "\nResidental Status: " + residentalStatus;
    }
}
