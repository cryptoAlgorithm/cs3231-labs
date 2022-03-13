package lab.two;

import java.util.Scanner;

public class RightChange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Purchase Price (in cents): ");
        long pp = s.nextLong();
        System.out.print("Amount Tendered (in cents): ");
        long at = s.nextLong();

        double c = at - pp;
        System.out.printf("\nYour change is: $%.2f\n", c / 100d);
        int twoDollar = (int) (c / 200);
        c -= twoDollar * 200;
        System.out.println(twoDollar + " $2 note");
        int oneDollar = (int) (c / 100);
        c -= oneDollar * 100;
        System.out.println(oneDollar + " $1 coin");
        int fiftyCent = (int) (c / 50);
        c -= fiftyCent * 50;
        System.out.println(fiftyCent + " 50 cents coin");
        int twentyCent = (int) (c / 20);
        c -= twentyCent * 20;
        System.out.println(twentyCent + " 20 cents coin");
        System.out.println((int) (c / 10) + " 10 cents coin");

        System.out.print("\nThank you for your business. Come back soon.");
    }
}
