package LabTest;

public class Book {
    private String title;
    private String field;
    private String author;
    private double price;
    private double priceTax;
    private int bonusPoint;
    private int quantity;
    
    public Book(String title, String field, String author, double price, int quantity) {
        this.title = title;
        this.field = field;
        this.author = author;
        this.price = price;
        this.priceTax = 0.00;
        this.bonusPoint = 0;
        this.quantity = quantity;
    }
    
    public void calculatePriceWithTax() {
        double taxRate = 0.03;
        this.priceTax = this.price + (this.price * taxRate);
    }
    
    public void determineBonusPoint() {
        if (this.quantity >= 2 && this.quantity <= 5) {
            this.bonusPoint = 10;
        } else if (this.quantity >= 6 && this.quantity <= 10) {
            this.bonusPoint = 20;
        } else {
            this.bonusPoint = 30;
        }
    }
    
    @Override
    public String toString() {
        return "Title: " + title + "\nField: " + field + "\nAuthor: " + author + "\nPrice: $" + price +
               "\nPrice with Tax: $" + priceTax + "\nBonus Points: " + bonusPoint + "\nQuantity: " + quantity;
    }
}
