package app;

import geometry.Line;

public class LineApp {
    public static void main(String[] args) {
        Line.x1 = 1;
        Line.y1 = 1;
        Line.x2 = 4;
        Line.y2 = 4;
        double distance = Line.calculateDistance(Line.x1, Line.y1, Line.x2, Line.y2);
        System.out.println("Distance: " + distance);
    }
}
