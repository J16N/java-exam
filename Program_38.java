/*
 * Description : Trimming the string
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_38 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String s = sc.nextLine();
            
            System.out.println("String Actual length: " + s.length());
            System.out.println("String Trimmed length: " + s.trim().length());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
