/*
 * Description : Sort array of strings
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_19 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String[] strings = in.nextLine().split(" ");

            System.out.println("Before Sorting: " + Arrays.toString(strings));
            Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
            System.out.println("After Sorting: " + Arrays.toString(strings));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
