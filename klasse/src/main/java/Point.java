public class Point<puplic> {

    private static int x;
    private static int y;

    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }


    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int setX(int getx)
    {return x = getx;}
    public static int setY(int gety)
    {return y = gety;}

}
