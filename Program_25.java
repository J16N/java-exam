/*
 * Description : String to character array
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_25 {
    public static void main(String[] args) {
        System.out.println("String to character array.");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String str = sc.nextLine();

            if (str.length() <= 30) {
                char[] arr = new char[50];
                Arrays.fill(arr, 'F');
                str.getChars(0, str.length(), arr, 10);
                System.out.println("Character Array: " + Arrays.toString(arr));
            }

            else 
                System.out.println("String length should be less than or equal to 30.");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
