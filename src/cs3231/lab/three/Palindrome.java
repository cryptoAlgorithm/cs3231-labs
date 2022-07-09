package cs3231.lab.three;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int n;
        try {
            n = s.nextInt();
            if (n < 100 || n > 999) {
                System.out.print("incorrect input");
                return;
            }
        } catch (Exception ignored) {
            System.out.print("incorrect input");
            return;
        }

        String st = Integer.toString(n);
        System.out.printf("%d is%s a palindrome", n, st.charAt(0) == st.charAt(2) ? "" : " not");
    }
}
