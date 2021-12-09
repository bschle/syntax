package account.teil2;

public class Person {
    public static Person owner;
    public static Person[] people;

    private static Person Vorname;
    private static Person Nachname;

    public static void main(String[] args) {

    }

    public void setNachname(Person nachname) {
        this.Nachname = nachname;
    }

    public void setVorname(Person vorname) {
        this.Vorname = vorname;
    }


    public static Person getNachname() {
        return Nachname;
    }


    public static Person getVorname() {
        return Vorname;
    }
}
