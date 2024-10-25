public class Rectangle {
    private final double width;
    private final double length;
    private final double height;

    public Rectangle(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getVolume() {
        return width * length * height;
    }
}