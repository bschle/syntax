package geometry;

public abstract class Shape {
    protected Color fill = Color.Black;
    protected Point position = new Point(0, 0);

    protected abstract double calculateArea();
    protected abstract double calculateCircumference();

    protected Color getFill() {
        return fill;
    }

}

