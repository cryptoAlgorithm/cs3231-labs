package lab.seven;

import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args){

        //using the default constructor that randomizes width & height
        Rectangle r1 = new Rectangle();
        System.out.println("r1: randomized width & height");
        System.out.println("width = "+r1.getWidth());
        System.out.println("height = "+r1.getHeight());
        System.out.println("area = "+r1.getArea());
        System.out.println("perimeter = "+r1.getPerimeter());
        System.out.println();


        //using the constructor that allows user to set width and height
        Rectangle r2 = new Rectangle(5,2);
        System.out.println("r2: width and height input into constructor");
        System.out.println("width = "+r2.getWidth());
        System.out.println("height = "+r2.getHeight());
        System.out.println("area = "+r2.getArea());
        System.out.println("perimeter = "+r2.getPerimeter());
        System.out.println();


        //using the copy constructor
        Rectangle r3 = new Rectangle(r2);
        System.out.println("r3: copy of r2");
        System.out.println("width = "+r3.getWidth());
        System.out.println("height = "+r3.getHeight());
        System.out.println("area = "+r3.getArea());
        System.out.println("perimeter = "+r3.getPerimeter());
        System.out.println();

    }
}
