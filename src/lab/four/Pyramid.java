package lab.four;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int l = s.nextInt();
        for (int h = 1; h <= l; h++) {
            for (int f = 0; f < l - h; f++) System.out.print("   ");
            for (int p = h; p >= 1; p--) System.out.printf("%-3d", p);
            for (int p = 2; p <= h; p++) System.out.printf("%-3d", p);
            System.out.println();
        }

    }
}