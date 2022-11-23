/*
 * Description : Exception handling in Java
 * Author      : Mr. Rabbit
 */

public class Program_42 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        }
        catch (Exception ex) {
            System.out.println("Exception caught!");
        }
    }
}
