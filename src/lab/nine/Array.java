package lab.nine;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = (int) Math.floor(Math.random()*101) - 50;
        System.out.println("Contents of Array:");
        for (int v : a) System.out.print(v + " ");

        System.out.println("\nAverage Value: " + average(a));
        System.out.println("Largest Value: " + largest(a));
        System.out.println("Second Smallest Value: " + smallest2(a));
    }

    public static double average(int[] a) {
        int s = 0;
        for (int v : a) s += v;
        return s/((double)a.length);
    }

    public static int largest(int[] a) {
        int m = -Integer.MAX_VALUE;
        for (int v : a) if (v > m) m = v;
        return m;
    }

    public static int smallest2(int[] a) {
        Arrays.sort(a);
        int s = a[0];
        for (int j : a) {
            if (j != s) return j;
        }
        return a[a.length-1];
    }
}
