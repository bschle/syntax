package account;

public class Account {
    static double balance;
    static final String currency = "CHF";
    static double interestRate;
    public static void main(String[] args) {
        balance = 0;
        interestRate = 0.01;
    }
    public static double getBalance() {
        return Account.balance;
    }

    public static double getInterestRate() {
        return Account.interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }
    public static void setDeposit(double balance) throws IllegalAccessException {
        if (balance > 0) {
            Account.balance += balance;
        } else {
            throw new IllegalAccessException("The amount has to be greater than 0 when depositing.");
        }
    }

    public static void setTakeOff(double balance) throws IllegalAccessException {
        if (Account.balance - balance > 0) {
            Account.balance -= balance;
        } else {
            throw new IllegalAccessException("The amount has to be greater than 0 when depositing.");

        }
    }


    public static double getInterest(double saldo) {
        return (saldo * Account.interestRate) / 100;
    }
}
