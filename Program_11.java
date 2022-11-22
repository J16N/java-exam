/*
 * Description : Method overloading in Figure
 * Author      : Mr. Rabbit
 */

public class Program_11 {
    public static void main(String[] args) {
        Figure p = new Figure();
        Figure c = new Figure();
        Figure s = new Figure();
        Figure cy = new Figure();

        p.calArea(3, 2, 2);
        c.calArea(6, 6, 6);
        s.calArea(4);
        cy.calArea(5, 7);

        System.out.println(p);
        System.out.println(c);
        System.out.println(s);
        System.out.println(cy);
    }
}

class Figure {
    private String name;
    private double area;

    public void calArea(double l, double b, double h) {
        name = l == b && l == h ? "Parallelopiped" : "Cube";
        area = (2 * l * b) + (2 * b * h) + (2 * h * l);
    }

    public void calArea(double r) {
        name = "Sphere";
        area = 4 * Math.PI * Math.pow(r, 2);
    }

    public void calArea(double r, double h) {
        name = "Cylinder";
        area = (2 * Math.PI * Math.pow(r, 2)) + (2 * Math.PI * r * h);
    }

    public String toString() {
        return String.format("Area of %s is %.2f sq. unit", name, area);
    }
}