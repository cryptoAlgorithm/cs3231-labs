package cs3231.lab.extra.two;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        menu();
    }

    // Good thing this isn't IO
    public static int getFibonacci(int n) {
        int n1 = 1, n2 = 0;
        if (n == 1) return 1;
        for (int i = 0; i < n-2; i++) {
            int s = n1 + n2;
            n2 = n1;
            n1 = s;
        }
        return n1 + n2;
    }

    public static void dispFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%-5d", getFibonacci(i));
            if (i%8 == 0)System.out.println();
        }
    }

    public static double goldenRatio(int n) {
        return getFibonacci(n+1)/(double)getFibonacci(n);
    }

    public static void menu() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Select one of the options below:\n"+
                    "Option 1: Find nth Fibonacci number\n" +
                    "Option 2: Display first n Fibonacci number\n" +
                    "Option 3: Find nth order approximation to Golden Ratio\n" +
                    "Select an option (1, 2, 3): ");
            switch(s.nextInt()) {
                case 1:
                    System.out.print("Enter n: ");
                    System.out.println("The nth number in the Fibonacci Sequence is " + getFibonacci(s.nextInt()));
                    break;
                case 2:
                    System.out.print("Enter n: ");
                    dispFibonacci(s.nextInt());
                    break;
                case 3:
                    System.out.print("Enter n: ");
                    System.out.println("The nth order approximation of the Golden Ratio is " + goldenRatio(s.nextInt()));
                    break;
                default:
                    System.out.println("Error! Enter only an integer!");
                    return;
            }
            System.out.println();
        }
    }
}
