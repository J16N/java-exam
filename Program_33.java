/*
 * Description : Program to sort array of strings
 * Author      : Mr. Rabbit
 */

import java.util.*;

public class Program_33 {
    public static void main(String[] args) {
        String s = "This is a very good practice to use good constructor in coding of a good class, good is always good";
        String[] strings = s.split(" ");

        System.out.println("Unsorted array: " + Arrays.toString(strings));
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted array: " + Arrays.toString(strings));
    }
}
