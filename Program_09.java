/*
 * Description : GCD of 2 numbers
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_09 {
    public static void main(String[] args) {
        System.out.println("GCD of 2 numbers.");
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("1st Number: ");
            int a = in.nextInt();
            System.out.print("2nd Number: ");
            int b = in.nextInt();
            System.out.printf("GCD of %d and %d is %d", a, b, gcd(a, b));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static int gcd(int a, int b) {
        int c = a % b;
        if (c == 0) return b;
        return gcd(b, c);
    }
}
