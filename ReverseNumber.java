import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            String num = input.next();
            Integer.parseInt(num);
            if (num.length() == 4) {
                String revNum = new StringBuilder(num).reverse().toString();
                System.out.println("Reversed Number: " + revNum);
            }
            else {
                System.out.println("The number must be 4 digits long.");
            }
            
        }
        catch (NumberFormatException e) {
            System.out.println("Input must be a number.");
            System.exit(1);
        }
    }
}