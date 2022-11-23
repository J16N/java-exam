/*
 * Description : Replace 'a' with 'x' and 'A' with 'X'.
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_30 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String str = sc.nextLine();
            boolean found = false;

            if (str.contains("a")) {
                found = true;
                str = str.replaceAll("a", "x");
            }

            if (str.contains("A")) {
                found = true;
                str = str.replaceAll("A", "X");
            }

            if (found)
                System.out.println("New String: " + str);
            else
                System.out.println("String does not contain 'a' or 'A'.");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
