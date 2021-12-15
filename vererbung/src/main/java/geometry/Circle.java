package geometry;

public class Circle extends Shape {
    private int radius;
    private Point position;
    private Color fill;

    public Circle(Point position, int radius) {
        this.radius = radius;
        this.position = position;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public Point getPosition() {
        return this.position;
    }
}
