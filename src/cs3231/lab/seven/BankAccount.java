package cs3231.lab.seven;

import java.util.regex.Pattern;

public class BankAccount {
    static private int numAccounts = 0;
    private String accNumber;
    private String accHolder;
    private double accBalance = 0;

    public BankAccount(String n, String h, double a) {
        numAccounts++;
        if (Pattern.compile("\\d{3}-\\d{5}-\\d").matcher(n).matches()) accNumber = n;
        else {
            System.out.println("Error: Account number is in format XXX-XXXXX-X");
            return;
        }

        if (a >= 500) accBalance = a;
        else {
            System.out.println("Error: Minimum balance is $500");
            return;
        }
        accHolder = h;
    }

    public double getBalance() {
        return accBalance;
    }

    public static int getNumAccount() {
        return numAccounts;
    }

    public void deposit(double add) {
        if (add <= 0) return;
        accBalance += add;
    }
    public void withdraw(double w) {
        if (w <= 0 || w > accBalance) return;
        accBalance -= w;
    }
}
