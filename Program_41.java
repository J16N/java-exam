/*
 * Description : Demonstrating constructor calling of parent class when
 *               child class is called instantiated.
 * Author      : Mr. Rabbit
 */

public class Program_41 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("A constructor called!");
    }
}

class B extends A {
    B() {
        System.out.println("B constructor called!");
    }
}