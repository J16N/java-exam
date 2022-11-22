/*
 * Description : Convert string to char array.
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_16 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = in.next();

            char[] c = s.toCharArray();
            System.out.println("Array: " + Arrays.toString(c));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
