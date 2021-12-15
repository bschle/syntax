package geometry;

public class BoundingBox extends Rectangle{

    private Point topLeft;
    protected BoundingBox(Point topLeft, int width, int height) {
        super(topLeft, width, height);
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }
}
