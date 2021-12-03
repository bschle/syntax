public class Rectangle {
    private static int width;
    private static int height;
    public static void main(String[] args) {
    System.out.println("Flache:" + calculateArea(4,5) + "cm");
    System.out.println("Umfang" + calculateCircumference(4,5) + "cm");
    }
    public static double calculateArea(double width, double height)
    {return height * width;}
    public static double calculateCircumference(double width, double height)
    {return (2 * height) + (2 * width);}
}
