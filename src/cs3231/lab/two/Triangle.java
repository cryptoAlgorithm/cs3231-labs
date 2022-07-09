package cs3231.lab.two;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x1, x2, x3, y1, y2, y3;
        try {
            x1 = s.nextDouble();
            y1 = s.nextDouble();
            x2 = s.nextDouble();
            y2 = s.nextDouble();
            x3 = s.nextDouble();
            y3 = s.nextDouble();
        } catch(Exception ignored) {
            System.out.print("incorrect input");
            return;
        }

        System.out.printf(
                "The area of the triangle is %.1f",
                computeArea(x1, y1, x2, y2, x3, y3)
        );
    }

    public static double computeArea(double x1, double y1,double x2, double y2,double x3, double y3){
        double s1 = dist(x1, y1, x2, y2),
                s2 = dist(x2, y2, x3, y3),
                s3 = dist(x3, y3, x1, y1),
                s = (s1 + s2 + s3) / 2;
        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), .5);
    }

    public static double dist(double x1, double y1, double x2, double y2) {
        return Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), .5);
    }
}
