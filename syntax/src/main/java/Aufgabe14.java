import java.util.Arrays;

public class Aufgabe14 {
    public static void main(String[] args) {

        String[] nadeln = new String[11];
        Arrays.fill(nadeln, " ");
        String star = "*";
        int x = 0;

        for (int i = 0; i < 11 / 2; i++) {

            nadeln[nadeln.length / 2 - x] = star;
            for (String number : nadeln) {
                System.out.print(number);
            }

            x += 1;
            star += "**";
            System.out.print("\n");

            Arrays.fill(nadeln, " ");
        }
    }
}