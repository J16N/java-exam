/*
 * Description : Print the sequence 1 - 1/1! + 1/2! - 1/3! + ... (upto n terms)
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_39 {
    public static void main(String[] args) {
        System.out.println("Sequence: 1 - 1/1! + 1/2! - 1/3! + ... (upto n terms)");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            double sum = 1;
            double factorial = 1;

            for (int i = 2, j = 1; i <= n; ++i, ++j) {
                factorial *= j;
                sum += Math.pow(-1, j) * Math.pow(factorial, -1);
            }

            System.out.println("Sum: " + sum);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
