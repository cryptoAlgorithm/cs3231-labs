package lab.three;

import java.util.Scanner;

public class PointInTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter x and y: ");
        double x = s.nextDouble(), y = s.nextDouble();

        // math is not my passion
        System.out.printf("The point is%s in the triangle", inTriHardcoded(x, y) ? "" : " not");
    }

    public static boolean inTriHardcoded(double x, double y) {
        return x > 0 && y > 0 && y < (-0.5*x + 100);
    }
}
