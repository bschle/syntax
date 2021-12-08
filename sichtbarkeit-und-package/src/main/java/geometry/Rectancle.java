package geometry;

public class Rectancle {

    public static void main(String[] args) {
        double area = calculateArea(4, 4);
        String areaAsString = Double.toString(area);
        System.out.println("Flaeche: " + areaAsString + "cm");

        double circumference = calculateCircumference(4, 4);
        String circumferenceAsString = Double.toString(circumference);
        System.out.println("Umfang: " + circumferenceAsString + "cm");
    }

    public static double calculateArea(int width, int height) {
        double area = width * height;
        return area;
    }

    public static double calculateCircumference(int width, int height) {
        double circumference = 2 * width * height;
        return circumference;
    }
}
