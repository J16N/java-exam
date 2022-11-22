/*
 * Description : Value of the program 1 - 1/2^2 + 1/3^2 - 1/4^2 + ... 
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_02 {
    public static void main(String[] args) {
        System.out.println("Sequence: 1 - 1/2^2 + 1/3^2 - 1/4^2 + ... (upto n terms)");
        System.out.print("Enter N: ");

        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            
            double ans = 0;
            for (int i = 1, j = 0; i <= n; ++i, ++j)
                ans += Math.pow(-1, j) * (1.0 / Math.pow(i, 2));
            
            System.out.printf("Ans: %.2f\n", ans);

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
