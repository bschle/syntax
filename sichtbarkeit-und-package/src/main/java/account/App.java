package account;

import static account.Account.*;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        setDeposit(3);
        setTakeOff(1);
        setInterestRate(0.02);
        System.out.println(getBalance());
        System.out.println(getInterestRate());
    }
}
