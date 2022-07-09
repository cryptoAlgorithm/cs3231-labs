package cs3231.lab.four;

import java.util.Scanner;

public class SmallestN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter x: ");

        int x = s.nextInt();

        int n = smallestn(x);
        System.out.println(n + " is the lowest number, such that n^2 is greater than 1000");
        System.out.printf("Proof: %d^2 = %.0f\n", n-1, Math.pow(n-1, 2));
        System.out.printf("Proof: %d^2 = %.0f", n, Math.pow(n, 2));
    }
    public static int smallestn(int x) {
        int n = 0;
        while (Math.pow(n, 2) < x) { n++; }
        return n;
    }
}
