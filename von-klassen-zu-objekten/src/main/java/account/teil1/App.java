package account.teil1;

import account.teil1.Account;

public class App {
    public static void main(String[] args) {
        Account[] accounts = Account.createAccounts(10);
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account();
            System.out.println(accounts[i]);
        }
    }
}