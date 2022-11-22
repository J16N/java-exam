/*
 * Description : Demonstrating inheritance chain.
 * Author      : Mr. Rabbit
 */

public class Program_18 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("Climbing up the inheritance chain...");
        c.show();
    }
}

class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
        super.show();
    }
}

class C extends B {
    void show() {
        System.out.println("Class C");
        super.show();
    }
}