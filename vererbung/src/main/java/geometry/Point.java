package geometry;


public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        String x1 = Integer.toString(getX());
        String y1 = Integer.toString(getY());
        return x1.equals(y1);
    }

}




