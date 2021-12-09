package account.teil2;
import account.teil2.Person;

import static account.teil2.Account.createAccountsForPeople;
import static account.teil2.Person.personen;

public class App {
    public static void main(String[] args) {
        System.out.println(createAccountsForPeople(personen));
    }
}