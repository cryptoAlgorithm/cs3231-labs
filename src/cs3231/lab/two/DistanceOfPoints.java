package cs3231.lab.two;

import java.util.Scanner;

public class DistanceOfPoints {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = s.nextDouble(); double y1 = s.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = s.nextDouble(); double y2 = s.nextDouble();

        double dist = distance(x1, y1, x2, y2);

        System.out.print("The distance between the two points is " + dist);
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), .5);
    }
}
