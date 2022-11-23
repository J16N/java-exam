/*
 * Description: Demonstrating String.replace() in Java.
 * Author     : Mr. Rabbit
 */

public class Program_29 {
    public static void main(String[] args) {
        String s = "This is a very good practice to use good constructor in good coding of a class, good is good";
        System.out.println("Old String: " + s);
        s = s.replace("good", "bad");
        System.out.println("New String: " + s);
    }
}
