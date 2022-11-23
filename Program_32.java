/*
 * Description : Overriden methods in child class must have broader access specifier than its parent
 * Author      : Mr. Rabbit
 */

public class Program_32 {
    public static void main(String[] args) {
        A a = new A();
        a.test();
        B b = new B();
        b.test();
    }
}

class A {
    public void test() {
        System.out.println("In class A");
    }
}

class B extends A {
    void test() {
        System.out.println("In class B");
    }
}