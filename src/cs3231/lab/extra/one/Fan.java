package cs3231.lab.extra.one;

public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }
    private boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void changeSpeed(int s) {
        speed = s;
    }
    public void turnOn(boolean f) {
        on = f;
    }
    public void changeRadius(double r) {
        radius = r;
    }
    public void changeColor(String c) {
        color = c;
    }

    @Override
    public String toString() {
        if (on) return "Fan speed: " + (speed == FAST ? "FAST" : (speed == MEDIUM) ? "MEDIUM" : "SLOW") + ", color: " + color
                + ", radius: " + radius;
        else return "Fan color: " + color + ", radius: " + radius + "\nfan is off";
    }
}
