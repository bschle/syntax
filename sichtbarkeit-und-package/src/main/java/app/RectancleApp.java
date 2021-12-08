package app;

import geometry.Rectancle;

public class RectancleApp {

    public static void main(String[] args) {
        double area = Rectancle.calculateArea(4, 4);
        String areaAsString = Double.toString(area);
        System.out.println("Flaeche: " + areaAsString + "cm");

        double circumference = Rectancle.calculateCircumference(4, 4);
        String circumferenceAsString = Double.toString(circumference);
        System.out.println("Umfang: " + circumferenceAsString + "cm");
    }
}
