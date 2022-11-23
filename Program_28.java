/*
 * Description : Abstract classes
 * Author      : Mr. Rabbit
 */

public class Program_28 {
    public static void main(String[] args) {
        A a = new B();
        a.test1();
        a.test2();
    }
}

abstract class A {
    public void test1() {
        System.out.print("Hello, ");
    }

    public void test2() {
        System.out.println("World!");
    }
}

class B extends A {}