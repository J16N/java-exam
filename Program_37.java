/*
 * Description : Demonstrating abstract class
 * Author      : Mr. Rabbit
 */

public class Program_37 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 15);
        Triangle tri = new Triangle(6, 7);

        System.out.println("\nRectangle Area: " + rec.area() + " sq. units");
        System.out.println("Triangle Area: " + tri.area() + " sq. units");
    }
}

abstract class TwoD {
    public double sideOne, sideTwo;

    TwoD(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public abstract double area();
}

class Rectangle extends TwoD {
    Rectangle(double sideOne, double sideTwo) {
        super(sideOne, sideTwo);
    }

    public double area() {
        return sideOne * sideTwo;
    }
}

class Triangle extends TwoD {
    Triangle(double sideOne, double sideTwo) {
        super(sideOne, sideTwo);
    }

    public double area() {
        return 0.5 * sideOne * sideTwo;
    }
}