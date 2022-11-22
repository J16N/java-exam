/*
 * Description : Show that static variable of class is shared by all objects.
 * Author      : Mr. Rabbit
 */

public class Program_10 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        System.out.println("Before increment A1: ");
        System.out.println("t = " + a1.t);
        System.out.println("s = " + A.s + "\n");

        System.out.println("Before increment A2: ");
        System.out.println("t = " + a2.t);
        System.out.println("s = " + A.s + "\n");

        a1.increment();

        System.out.println("After increment A1: ");
        System.out.println("t = " + a1.t);
        System.out.println("s = " + A.s + "\n");

        System.out.println("After A1 increment A2: ");
        System.out.println("t = " + a2.t);
        System.out.println("s = " + A.s + "\n");

        System.out.println("We see the value of s has changed in a2 event though a2 is not incremented.");
        System.out.println("This is because s is a static variable and it is shared by all instances of the class.");
    }
}

class A {
    public int t = 1;
    public static int s = 2;

    public void increment() { 
        t++; 
        s++;
    }
}
