package account.teil2;


public class Account {
    private Person onwer;

    public Account(Person owner, Person vorname) {
        this.onwer = owner;
    }


    static double amount = 0;
    private double zinssatz = 0.01;
    public static String waehrung = "CHF";

    public static double getAmount() {
        return amount;
    }

    public double getZinsSatz() {
        return zinssatz;
    }

    public double getZins() {
        double zinsbetrag = amount * zinssatz;
        return zinsbetrag;
    }

    public double deposit(double einzahlung) {
        amount = einzahlung + amount;
        return einzahlung;
    }

    public double withdraw(double abhebung) {
        amount = amount - abhebung;
        return abhebung;
    }

    public void setZinssatz(double ZinsSatz) {
        zinssatz = ZinsSatz;
    }


    public static Person[] createAccountsForPeople(Person[] people) {
        Person[] account = new Person[people.length];
        for (int i = 0; i < people.length; i++) {
            account = new Person[]{App.people[i]};
        }
        return account;
    }


    public static void depositAndWithdrawRandomAmount(Account[] accounts) {
        for (Account account : accounts) {
            account.deposit(RandomHelper.getRandomDouble(1, 1000));
            account.withdraw(RandomHelper.getRandomDouble(1, 1000));
        }
    }
}
