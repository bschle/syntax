// Default Package
import geometry.Point;
import geometry.Line;
public class LineApp {


    public static void main(String[] args) {


        Point p1 = Point.createpoint(1,1);
        Point p2 = Point.createpoint(4,4);


        double distance = Line.calculateDistance(p1, p2);

        System.out.println("Distanz zwischen P1 und P2 ist: " + distance);
    }
}

