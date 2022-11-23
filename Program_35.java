/*
 * Description : Demonstrating static initializer block
 * Author      : Mr. Rabbit
 */

public class Program_35 {
    private static final int X;
    static {
        System.out.println("Program_35 is loaded.");
        System.out.println("Initializing static variable...");
        X = 10;
    }

    public static void main(String[] args) {
        System.out.println("X: " + X);
    }
}
