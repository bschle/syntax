public class Aufgabe4 {
    public static void main(String[] args) {
        for (int x = 1;x <= 10; x++ ) {
            System.out.print(x + "-er Reihe\t");
            for (int y = 1; y <= 10; y++){
                System.out.print(x*y + "\t");
            }
            System.out.println("\n");
        }
    }
}