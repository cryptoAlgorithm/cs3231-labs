package lab.five;

import java.util.Scanner;

public class PentagonalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");

        int n = s.nextInt();
        System.out.printf("The first %d pentagonal numbers are", n);

        for (int i = 1; i <= n; i++) {
            if ((i-1) % 7 == 0) System.out.println();
            System.out.printf("%-8d", getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n) {
        return n * (3*n-1)/2;
    }
}
