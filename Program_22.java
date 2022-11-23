/*
 * Description : Extract portion of the given string.
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_22 {
    public static void main(String[] args) {
        System.out.println("Extract portion of the string.");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String str = sc.nextLine();
            System.out.print("Start Index: ");
            int start = sc.nextInt();
            System.out.print("End Index: ");
            int end = sc.nextInt();

            System.out.println("Extracted String: " + str.substring(start, end));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
