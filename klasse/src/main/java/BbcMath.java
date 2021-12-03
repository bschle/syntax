import java.security.KeyStore;

public class BbcMath {

    public static void main(String[] args) {



        // Aufgaben zu Methodenüberladung:
        // Schreibe die Methode "add" viermal. Verwende immer den Methodennamen "add" und Methodenüberladung.


        System.out.println("Add mit Integer: " + add(i));
        System.out.println("Add mit Long: " + add(l));
        System.out.println("Add mit Float: " + add(f));
        System.out.println("Add mit Double: " + add(d));

        // Extra
        System.out.println("Ist 7 gerade? " + isEven(7));
        System.out.println("Ist 8 gerade? " + isEven(8));
    }
    static int i = 10; // Wenn du nichts angibst, ist 10 ein Integer
    static long l = 10L; // Durch das kleine "l", wird die 10 zu einem Long
    static float f = 10f; // Durch das kleine "f", wird die 10 zum Float
    static double d = 10d; // Durch das kleine "d", wird die 10 zu einem Double


    static int add(int i)
    {return i + i;}
    static long add(long l)
    {return l + l;}
    static float add(float f)
    {return f + f;}
    static double add(double d)
    {return d + d;}

    static  boolean isEven(int x)
    {return x % 2 == 0;}
    {

    }

}
