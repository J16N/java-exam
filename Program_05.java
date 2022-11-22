/*
 * Description : Find prime number betweeen 0 and 200
 * Author      : Mr. Rabbit
 */

public class Program_05 {
    public static void main(String[] args) {
        System.out.println("The prime numbers between 0 and 200 are: ");
        for (int i = 0; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
