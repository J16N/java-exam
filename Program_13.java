/*
 * Description : Find position of the substring in the string.
 * Author      : Mr. Rabbit
 */

public class Program_13 {
    public static void main(String[] args) {
        String s = "University of Technology";
        if (s.contains("Tech"))
            System.out.println("Position: " + s.indexOf("Tech") + 1);
        else
            System.out.println("Tech not found");
    }
}
