public class Aufgabe12 {
    public static void main(String[] args) {
        //a
        int[] myArray = new int[5];
        myArray[0] = 0;
        myArray[1] = 1;
        myArray[2] = 2;
        myArray[3] = 3;
        myArray[4] = 4;
        System.out.println("Aufgabe a\n");
        for (int array : myArray) {
            System.out.print(array);
        }
        System.out.println("\n");

        //b
        int[] einhundert = new int[100];
        for (int i = 0; i < 100; i++) {
            einhundert[i] = i;
        }
        System.out.println("Aufgabe b\n");

        for (int hundert : einhundert) {
            System.out.print(hundert);
        }
        System.out.println("\n");

        //c


        System.out.println("Aufgabe c\n");

        int zaehler = 0;
        for (int i = 0; i < einhundert.length; i++) {
            zaehler += einhundert[i];
        }

        System.out.println(zaehler);

        System.out.println("\n");

        //d


        System.out.println("Aufgabe d\n");
        int o = 0;
        for (int v = 0; v < einhundert.length; v++) {
            einhundert[o] = einhundert[o] + 1;
            o += 1;
        }
        for (int hundert : einhundert) {
            System.out.print(hundert);
        }

        // wieder normal setzen
        for (int i = 0; i < 100; i++) {
            einhundert[i] = i;
        }

        System.out.println("\n");
        int o2 = 0;
        for (int p = 0; p < einhundert.length; p++) {
            einhundert[o2] = einhundert[o2] - 1;
            o2 += 1;
        }
        for (int hundert : einhundert) {
            System.out.print(hundert);
        }

        System.out.println("\n");
        // fertig mit Aufgabe 12

    }
}
