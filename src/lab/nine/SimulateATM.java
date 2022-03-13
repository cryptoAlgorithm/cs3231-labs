package lab.nine;

import java.util.Scanner;

public class SimulateATM {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) accounts[i] = new Account(i, 100);

        Scanner s = new Scanner(System.in);
        Account a = null;
        do {
            System.out.print("Enter an id: ");
            int i = s.nextInt();
            if (i < 0 || i > 9) {
                System.out.println("Invalid id");
                continue;
            }
            a = accounts[i];
        } while (a == null);
        while (true) {
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");

            switch(s.nextInt()) {
                case 1:
                    System.out.printf("The balance is $%.2f\n", a.getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    a.withdraw(s.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    a.deposit(s.nextDouble());
                    break;
                case 4:
                    return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
