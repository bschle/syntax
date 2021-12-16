package geometry;

public class Rectangle extends Shape {
    private int width;
    private int height;
    private Point position;
    private Color fill;

    protected Rectangle(Point topLeft, int width, int height) {
        this.position = topLeft;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return width + height + width + height;
    }
}
