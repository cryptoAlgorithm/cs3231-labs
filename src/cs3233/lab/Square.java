package cs3233.lab;

public class Square extends GeometricObject implements Colorable {
    private final int s;
    public Square(int size){
        s = size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea() {
        return s*s;
    }

    @Override
    public double getPerimeter() {
        return s*4;
    }
}
