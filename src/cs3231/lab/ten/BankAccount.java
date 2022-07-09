package cs3231.lab.ten;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int acctNum) {
        accountNumber = acctNum;
        balance=0;
    }

    public BankAccount(int acctNum, double initialAmt) {
        accountNumber = acctNum;
        balance=initialAmt;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance = balance + amt;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}