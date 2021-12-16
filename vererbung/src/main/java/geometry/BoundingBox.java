package geometry;

public class BoundingBox extends Rectangle {

    private Point topLeft;

    public BoundingBox(Point topLeft, int width, int height) {
        super(topLeft, width, height);
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getTopRight() {
        return topLeft;
    }

    public Point getBottomLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return topLeft;
    }
}
