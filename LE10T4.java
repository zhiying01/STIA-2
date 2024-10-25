import java.util.Scanner;

public class LE10T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Please enter the width of the rectangle: ");
            double width = input.nextDouble();
            System.out.print("Please enter the length of the rectangle: ");
            double length = input.nextDouble();
            System.out.print("Please enter the height of the rectangle: ");
            double height = input.nextDouble();

            Rectangle rect = new Rectangle(width, length, height);
            System.out.println("The length of the rectangle is " + rect.getLength());
            System.out.println("The height of the rectangle is " + rect.getHeight());
            System.out.println("The area of the rectangle is " + rect.getArea());
            System.out.println("The perimeter of the rectangle is " + rect.getPerimeter());

            double volume = rect.getVolume();
            System.out.println("The volume of the rectangle is " + volume);

            double area = rect.getArea();
            System.out.println("Division is " + area / 0);
        } catch (ArithmeticException e) {
            System.out.println("Invalid division by 0!");
            System.out.println("Message from getMessage(): " + e.getMessage());
            System.out.println("Message from printStackTrace():");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Message from printStackTrace():");
            e.printStackTrace();
        } finally {
            System.out.println("~End of Program~");
        }
    }
}