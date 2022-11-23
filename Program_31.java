/*
 * Description : Program_31
 * Author      : Mr. Rabbit
 */

public class Program_31 {
    public static void main(String[] args) {
        B b = test(new A());
        System.out.println("B: " + b.s);
    }

    private static B test(A a) {
        a.p = 10;
        System.out.println("A: " + a.p);
        B b = new B();
        b.s = "Hello";
        return b;
    }
}

class A {
    public int p;
}

class B {
    public String s;
}