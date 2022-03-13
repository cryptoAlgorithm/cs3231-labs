package lab.nine;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    public Account() {
        dateCreated = new Date();
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public static double getAnnualInterestRate() { return annualInterestRate; }
    public static void setAnnualInterestRate(double annualInterestRate) { Account.annualInterestRate = annualInterestRate; }
    public Date getDateCreated() { return dateCreated; }
    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest() {
        return annualInterestRate / 1200 * balance;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
}