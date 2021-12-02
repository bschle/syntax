
import javax.swing.*;

public class Aufgabe6 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Wie ist mein Vorname");

        while (!name.equals("Levin"))
        {
            name = JOptionPane.showInputDialog(null, "Wie ist mein Vorname");
            System.out.println("Das bin ich nicht!");
        }
        System.out.println("Das bin ich");




    }
}