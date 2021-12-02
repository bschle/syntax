
import javax.swing.*;

public class Aufgabe5 {
    public static void main(String[] args) {
        int zahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte Zahl eingeben"));
        if (zahl<=-1) {
            System.out.println("Deine Zahl ist kleiner 0");}
        if (zahl>=1){
            System.out.println("Deine Zahl ist grösser 0");
        }
        if (zahl==0)
        {System.out.println("Deine Zahl ist die 0");
        }

    }
}


