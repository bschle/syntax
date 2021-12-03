import java.util.Arrays;

public class Aufgabe14 {
    public static void main(String[] args) {

        String[] row = new String[88];
        Arrays.fill(row, " ");
        String star = "*";
        int gap = 0;

        for (int i = 0; i < row.length / 2; i++) {

            row[row.length / 2 - gap] = star;
            for (String Christmastree : row) {
                System.out.print(Christmastree);
            }

            gap += 1;
            star += "**";
            System.out.print("\n");

            Arrays.fill(row, " ");
        }
    }
}