package geometry;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public static Point createpoint(int x, int y){
        Point p3 = new Point();
        p3.setX(x);
        p3.setY(y);
        ;
        return p3;
    }
}
