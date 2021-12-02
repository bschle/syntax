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
        for (int array : myArray) {   System.out.print( array);}
        System.out.println("\n");

        //b
        int[] einhundert = new int[100];
        int x = 0;
        for(int i = 0;i<100;i++)
        {
            einhundert[x] = x;
                x += 1;
        }
        System.out.println("Aufgabe b\n");

        for (int hundert : einhundert) {   System.out.print(hundert);}
        System.out.println("\n");

        //c


        System.out.println("Aufgabe c\n");

        int zaehler = 0;
        for (int i = 0; i < einhundert.length; i++ )
        {
            zaehler += einhundert[i];
        }

        System.out.println(zaehler);

        System.out.println("\n");

        //d


        System.out.println("Aufgabe d\n");

        int[] iterieren = new int[100];
        System.out.println("itieren\n");
        for (int i = 0; i < iterieren.length; i++ )
        {
            iterieren[i] = i;
        }
        for (int iteriert : iterieren) {   System.out.print(iteriert);}

        System.out.println("\n");

        System.out.println("dekrementiere\n");
        int[] dekrementieren = new int[100];
        int minus = 0;
        for (int i = 0; i < dekrementieren.length; i++)
        {
            dekrementieren[i] = minus;
            minus -= 1;
        }
        for (int dekrementiert : dekrementieren) {   System.out.print(dekrementiert);}

        System.out.println("\n");

    }
}
