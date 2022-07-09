package cs3233.lab.threePointOne;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(0,0), 2.5, 5);
        r1.print();

        Rectangle r2 = new Rectangle(new Point(5,8), 7, 2);
        r2.print();
    }
}
