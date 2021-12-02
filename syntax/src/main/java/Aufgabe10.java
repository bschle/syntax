import javax.swing.*;

public class Aufgabe10 {
    public static void main(String[] args) {
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib die erste Zahl eim"));
        String operator = JOptionPane.showInputDialog(null, "Bitte gib den Operator ein");
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib die zweite Zahl ein"));
        double resultat = 0;
        switch (operator)
        {
            case "*":
                resultat = zahl1 * zahl2;
                break;
            case "/":
                resultat = zahl1 / zahl2;
                break;
            case "-":
                resultat = zahl1 - zahl2;
                break;
            case "+":
                resultat = zahl1 + zahl2;
                break;
            case "%":
                resultat = zahl1 % zahl2;
                break;
            default:
                resultat = 0;


        }

        System.out.println(zahl1 + operator + zahl2 + "ergibt " + resultat);
    }
}
