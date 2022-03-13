package lab.extra.one;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        new LinearEquation(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
    }
}
