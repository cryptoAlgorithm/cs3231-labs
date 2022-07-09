package cs3231.lab.ten;

import java.util.ArrayList;

public class Bank {

    //declare an ArrayList of BankAccount objects
    private final ArrayList<BankAccount> accounts;

    public Bank() {

        //create ArrayList
        accounts = new ArrayList<>();
    }

    //add an account to this bank
    public void addAccount(BankAccount a) {
        accounts.add(a);
    }

    //Gets the sum of the balances of all accounts in this bank
    public double getTotalBalance() {
        double total =0;
        for(BankAccount a: accounts) {
            total = total + a.getBalance();
        }
        return total;
    }

    public int count(int bal) {
        int s = 0;
        for (BankAccount a: accounts) {
            if (a.getBalance() >= bal) s++;
        }
        return s;
    }

    public BankAccount find(int acctNumber) {
        for (BankAccount a: accounts) {
            if (a.getAccountNumber() == acctNumber) return a;
        }
        return null;
    }

    public int largest() {
        double m = -1;
        int d = 0;
        for (BankAccount a: accounts) {
            if (a.getBalance() > m) {
                m = a.getBalance();
                d = a.getAccountNumber();
            }
        }
        return d;
    }
}