package LabTest;

import java.util.Scanner;

public class BookTester {

    private Book[] arrBook;
    private int i;
    private int choice;

    public BookTester() {
        arrBook = new Book[100];
        i = 0;
        choice = -1;
    }

    public void printArray() {
        for (int j = 0; j < i; j++) {
            System.out.println(arrBook[j]);
            System.out.println("--------------");
        }
    }
    public static void main(String[] args) {
    BookTester bookTester = new BookTester();
    Scanner scanner = new Scanner(System.in);
    
    while (bookTester.choice != 0) {
        System.out.println("Menu:");
        System.out.println("1) Buy books");
        System.out.println("2) Display transactions");
        System.out.println("0) Exit");
        
        System.out.println("Enter your choice:");
        bookTester.choice = scanner.nextInt();
        
        switch (bookTester.choice) {
            case 1:
                bookTester.buyBooks();
                break;
            case 2:
                bookTester.displayTransaction();
                break;
            case 0:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    
    scanner.close();
}


    public void buyBooks() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Book title:");
        String title = scanner.nextLine();

        System.out.print("Field:");
        String field = scanner.nextLine();

        System.out.print("Author:");
        String author = scanner.nextLine();

        System.out.print("Quantity:");
        int quantity = scanner.nextInt();

        System.out.print("Price:");
        double price = scanner.nextDouble();

        Book book = new Book(title, field, author, price, quantity);
        book.calculatePriceWithTax();
        book.determineBonusPoint();

        arrBook[i] = book;
        i++;

        System.out.println("<<The object has been created and kept in the array>>");
    }

    public void displayTransaction() {
        BookTester bookTester = new BookTester();
        Scanner scanner = new Scanner(System.in);
        while (bookTester.choice != 0) {
            System.out.println("Main Menu:");
            System.out.println("1) Buy books");
            System.out.println("2) Display transactions");
            System.out.println("0) Exit");
            System.out.println("PLEASE CHOOSE ONE OF THE ABOVE OPTIONS:");
            bookTester.choice = scanner.nextInt();

            switch (bookTester.choice) {
                case 1:
                    bookTester.buyBooks();
                    break;
                case 2:
                    bookTester.displayTransaction();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}