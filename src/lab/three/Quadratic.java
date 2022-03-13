package lab.three;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();

        double disc = discriminant(a, b, c);
        if (disc > 0) System.out.printf("The equation has two roots %.5f and %.5f", r1(a, b, c), r2(a, b, c));
        else if (disc < 0) System.out.print("The equation has no real roots");
        else System.out.printf("The equation has one root %.5f", r1(a, b, c));
    }

    public static double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4*a*c;
    }

    public static double r1(double a, double b, double c) {
        return (-b + Math.sqrt(discriminant(a, b, c))) / 2*a;
    }
    public static double r2(double a, double b, double c) {
        return (-b - Math.sqrt(discriminant(a, b, c))) / 2*a;
    }
}
