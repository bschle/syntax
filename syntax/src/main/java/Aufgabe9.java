import javax.swing.*;

public class Aufgabe9 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Wie ist mein Vorname");
        int weight = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib dein Gewicht an"));
        double size = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib deine Grösse an"));

        System.out.println(name + " " +  "dein BMI Wert ist" + " " +  (weight / Math.pow(size, 2)));
    }
}
