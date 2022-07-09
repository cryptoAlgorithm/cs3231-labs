package cs3233.lab;

import java.awt.geom.Point2D;

public class CentredCircle extends Circle {
    private Point2D.Double center = new Point2D.Double();

    public CentredCircle() {
        super();
    }

    public CentredCircle(String colour, double radius, Point2D.Double centre) {
        super(colour, radius);
        this.center = centre;
    }

    public void setCentre(Point2D.Double centre) {
        center = centre;
    }

    public Point2D.Double getCentre() {
        return center;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CentredCircle) {
            CentredCircle circle = (CentredCircle) obj;
            return circle.center.x == center.x && circle.center.y == center.y && super.equals(obj);
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + super.colour + ", " + super.radius + ", (" + center.x+","+center.y+")]";
    }
}
