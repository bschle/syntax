package app;

import geometry.Point;

public class PointApp {
    public static void main(String[] args) {
        Point.setX(2); // Die Werte werden
        Point.setY(3); // zweimal gesetzt

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(Point.getX() + "," + Point.getY());
    }
}
