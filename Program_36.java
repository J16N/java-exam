/*
 * Description : Sort string in Java
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_36 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String s = sc.next();
            char[] chars = s.toUpperCase().toCharArray();
            Arrays.sort(chars);
            System.out.println("Sorted String: " + new String(chars));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
