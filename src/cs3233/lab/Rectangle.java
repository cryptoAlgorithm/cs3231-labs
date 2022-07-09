package cs3233.lab;

class Rectangle implements Printable, Shape {
    private double wi, hi;
    private Point tl;
    @Override
    public void print() {
        System.out.printf("Width: %.6f\n", wi);
        System.out.printf("Height: %.6f\n", hi);
        System.out.printf("Top-Left:%s\n", tl.toString());
    }

    @Override
    public double getArea() {
        return wi*hi;
    }

    @Override
    public double getPerimeter() {
        return wi*2+hi*2;
    }

    @Override
    public boolean contains(Point p) {
        return p.getX() >= tl.getX() && p.getY() >= tl.getY() && p.getX() <= tl.getX()+wi && p.getY() <= tl.getY()+hi;
    }

    public Rectangle(Point tl, double w, double h) {
        wi = w;
        hi = h;
        this.tl = tl;
    }
}