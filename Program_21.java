/*
 * Description : Find the value of the given sequence
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_21 {
    public static void main(String[] args) {
        System.out.println("Sequence: 1^2 - 2^2 + 3^2 - 4^2 + ... (upto n terms)");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int n = sc.nextInt();

            int sum = 0;
            for (int i = 1, j = 0; i <= n; ++i, ++j)
                sum += Math.pow(i, 2) * Math.pow(-1, j);
            
            System.out.println("Sum: " + sum);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
