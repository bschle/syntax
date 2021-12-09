package account.teil2;

import java.util.Arrays;

import static account.teil2.Account.createAccountsForPeople;

public class App {

    public static Person[] people;


    public static void main(String[] args) {
        String[] vornames = {"Levin", "Valmir", "Benjamin", "Nils", "Jesse", "Lenny", "Noah", "Ilian", "Mika", "Jasmin", "Cassandra"};
        String[] backnames = {"Schaad", "Halimaji", "Raemy", "Meister", "Kühni", "Herren", "Zysset", "Häsler", "Hannapel", "Mortean", "Saba"};
        String[] people = new String[11];
        for (int i = 0; i < people.length; i++) {
            String vorname = vornames[i];
            String backname = backnames[i];
            Account.amount += RandomHelper.getRandomDouble(1, 1000);
            people[i] = vorname + " " + backname + " " + Account.getAmount();
        }


        System.out.println(people[getMax()];

    }
}