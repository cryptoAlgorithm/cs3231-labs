package cs3231.lab.seven;

public class Rectangle {
    private double width = 0, height = 0;

    public Rectangle() {
        width = Math.floor(Math.random() * 10 + 1);
        height = Math.floor(Math.random() * 10 + 1);
    }
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    public Rectangle(Rectangle r) {
        width = r.getWidth();
        height = r.getHeight();
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("This is not a valid width!");
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height < 0) {
            System.out.println("This is not a valid height!");
            return;
        }
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }
    public double getPerimeter() {
        return width * 2 + height * 2;
    }
}
