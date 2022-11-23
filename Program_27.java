/*
 * Description : Check if the given sub-string is present in the string.
 * Author      : Mr. Rabbit
 */

public class Program_27 {
    public static void main(String[] args) {
        String str = "Academy of Technology";
        if (str.contains("Academy")) {
            System.out.printf("String contains 'Academy' at position %d.", str.indexOf("Academy"));
        }
        else {
            System.out.println("String does not contain 'Academy'.");
        }
    }
}
