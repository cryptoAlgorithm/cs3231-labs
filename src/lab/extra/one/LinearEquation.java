package lab.extra.one;

public class LinearEquation {
    private final int a, b, c, d, e, f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a*d - b*c) != 0;
    }
    public double getX() {
        return (e*d-b*f)/(a*d-b*(double)c);
    }
    public double getY() {
        return (a*f-e*c)/(a*d-b*(double)c);
    }
}
