public class Program_06 {
    public static void main(String[] args) {
        System.out.println("The first 10 numbers in fibonacci sequence are: ");

        for (int i = 0, a = 0, b = 1, c; i < 10; ++i) {
            if (i < 2) System.out.print(i + " ");
            else {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
