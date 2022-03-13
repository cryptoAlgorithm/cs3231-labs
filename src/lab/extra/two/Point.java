package lab.extra.two;

public class Point {
    private double x, y;

    Point() {
        x = 0;
        y = 0;
    }
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
