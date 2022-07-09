package cs3231.lab.four;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a binary number: ");

        int b = s.nextInt();
        System.out.printf("%d equals %d in decimal", b, toDecimal(b));
    }
    public static int toDecimal(int b) {
        char a[] = Integer.toString(b).toCharArray();
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '1') s += Math.pow(2, a.length - i - 1);
        }
        return s;
    }
}
