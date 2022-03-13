package lab.six;

import java.util.Scanner;

public class CircleDistance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = s.nextDouble(), y1 = s.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = s.nextDouble(), y2 = s.nextDouble();

        System.out.printf("The distance between the two points is %.3f km", getCircleDistance(x1, y1, x2, y2));
    }
    public static double getCircleDistance(double x1, double y1, double x2, double y2) {
        double rx1=Math.toRadians(x1), ry1 = Math.toRadians(y1), rx2 = Math.toRadians(x2), ry2 = Math.toRadians(y2);
        return 6371.01 * Math.acos(Math.sin(rx1) * Math.sin(rx2) + Math.cos(rx1) * Math.cos(rx2) * Math.cos(ry1 - ry2));
    }
}
