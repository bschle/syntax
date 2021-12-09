package account.teil1;


import java.util.Random;

public class Account {

    private double betrag = 0;
    private double zinssatz = 0.01;
    public static String waehrung = "CHF";

    public double getBetrag() {
        return betrag;
    }

    public double getZinsSatz() {
        return zinssatz;
    }

    public double getZins() {
        double zinsbetrag = betrag * zinssatz;
        return zinsbetrag;
    }

    public double deposit(double einzahlung) {
        betrag = einzahlung + betrag;
        return einzahlung;
    }

    public double withdraw(double takeOff) {
        betrag = betrag - takeOff;
        return takeOff;
    }

    public void setZinssatz(double ZinsSatz) {
        zinssatz = ZinsSatz;
    }

    public static Account[] createAccounts(int numberOfAccountsToCreate) {
        Account[] accounts = new Account[numberOfAccountsToCreate];
        for (int i = 0; i < numberOfAccountsToCreate; i++) {
            Account account = new Account();
            accounts[i] = account;
        }
        return accounts;
    }

    public static void depositAndWithdrawRandomAmount(Account[] accounts) {
        for (Account account : accounts) {
            account.deposit(RandomHelper.getRandomDouble(1, 1000));
            account.withdraw(RandomHelper.getRandomDouble(1, 1000));
        }
    }
}
