package lab.five;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter three integers: ");

        System.out.printf("The minimum integer is %d", getMin(s.nextInt(), s.nextInt(), s.nextInt()));
    }
    public static int getMin(int n1, int n2, int n3) {
        return Math.min(n1, Math.min(n2, n3));
    }
}
