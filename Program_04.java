/*
 * Description : Calculate area and volume of cone.
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_04 {
    public static void main(String[] args) {
        System.out.println("Area and Volume of Cone");
    
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double r = in.nextDouble();
            System.out.print("Enter height: ");
            double h = in.nextDouble();

            Cone c = new Cone(r, h);
            System.out.printf("\nArea: %.2f\n", c.getArea());
            System.out.printf("Volume: %.2f\n", c.getVolume());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Cone {
    private double r, h;

    Cone (double radius, double height) {
        r = radius;
        h = height;
    }

    public double getArea() {
        double l = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        return Math.PI * r * (r + l);
    }

    public double getVolume() {
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }
}
