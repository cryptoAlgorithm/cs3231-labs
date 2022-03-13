package lab.five;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter N: ");

        int n = s.nextInt();
        System.out.printf("The first %d prime numbers are", n);

        int i = 2;
        int p = 0;
        while (p < n) {
            if (isPrime(i)) {
                if (p %10==0) System.out.println();
                System.out.printf("%-5d", (i));

                p++;
            }
            i++;
        }
    }
    public static boolean isPrime(int n) {
        for (int i= 2; i <n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
