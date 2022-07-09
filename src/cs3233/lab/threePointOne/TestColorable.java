package cs3233.lab.threePointOne;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
            new Square(2),
            new Circle(5),
            new Square(5),
            new Circle(3),
            new Square(4.5)
        };//complete the code

        //add relevant code below

        for (GeometricObject obj : objects) {
            System.out.println("Area is " + obj.getArea());
            if (obj instanceof Colorable) ((Colorable) obj).howToColor();
        }
    }
}