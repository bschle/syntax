package account.teil1;

import java.util.Random;

public class Account {
    static double balance;
    static final String currency = "CHF";
    static double interestRate;
    public void main(String[] args) {
        balance = 0;
        interestRate = 0.01;


        System.out.println("Der Reichste");


        Account[] accounts = Account.createAccounts(10);

        Random random = new Random();



        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account();
        }
        for (int i = 0; i < 10; i++) {
            accounts[i] = deposit(RandomHelper.getRandomDouble(1, 1000));
            accounts[i] = withdraw(RandomHelper.getRandomDouble(1, 1000));
        }


    }
    public Account deposit(double zahl){return zahl;}

    public static Account[] createAccounts(int numberOfAccountsToCreate) {
        Account[] accounts = new Account[numberOfAccountsToCreate];
        for (int i = 0; i < numberOfAccountsToCreate; i++) {
            accounts[i] = new Account();
        }
        return accounts;
    }

}
