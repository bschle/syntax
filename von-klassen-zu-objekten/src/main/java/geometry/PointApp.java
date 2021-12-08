package geometry;

// Default Package
public class PointApp {

    public void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setX(1);
        p1.setY(2);
        p2.setX(3);
        p2.setY(4);
        String p1x = Integer.toString(p1.getX());
        String p1y = Integer.toString(p1.getY());
        String p2x = Integer.toString(p2.getX());
        String p2y = Integer.toString(p2.getY());
        System.out.println("Point 1 : X= " + p1x + " Y= " + p1y);
        System.out.println("Point 2 : X= " + p2x + " Y= " + p2y);
    }
}
