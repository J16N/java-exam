/*
 * Description : This program is to demonstrate the use of getters.
 * Author      : Mr. Rabbit
 */

public class Program_20 {
    public static void main(String[] args) {
        Television t = new Television("Sony", 26, "Color", "23-11-2022");
        System.out.println("Television Details:\n");
        System.out.println("Television Brand: " + t.getMaker());
        System.out.println("Television Size: " + t.getSize() + " inch");
        System.out.println("Television Color: " + t.getColor());
        System.out.println("Television Date of Purchase: " + t.getDateOfPurchase());
    }
}

class Television {
    private String maker;
    private int size;
    private String color;
    private String dateOfPurchase;

    public Television(String maker, int size, String color, String dateOfPurchase) {
        this.maker = maker;
        this.size = size;
        this.color = color;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getMaker() {
        return maker;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }
}