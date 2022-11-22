/*
 * Description : Program to show inheritance
 * Author      : Mr. Rabbit
 */

public class Program_12 {
    public static void main(String[] args) {
        Parent p = new Parent(1, "Sherlock", "221B Baker Street");
        Parent c1 = new ChildOne(2, "Watson", "231A Boston", 90);
        Parent c2 = new ChildTwo(3, "Moriarty", "221C NYC", 25000, "B.S in Stat");

        System.out.println(p + "\n");
        System.out.println(c1 + "\n");
        System.out.println(c2);
    }
}

class Parent {
    private int id;
    private String name, addr;

    Parent(int id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public String toString() {
        return String.format("ID: %d\nName: %s\nAddress: %s", id, name, addr);
    }
}

class ChildOne extends Parent {
    private int marks;

    ChildOne(int id, String name, String addr, int marks) {
        super(id, name, addr);
        this.marks = marks;
    }

    public String toString() {
        return super.toString() + String.format("\nMarks: %d", marks);
    }
}

class ChildTwo extends Parent {
    private double salary;
    private String quali;

    ChildTwo(int id, String name, String addr, double salary, String quali) {
        super(id, name, addr);
        this.salary = salary;
        this.quali = quali;
    }

    public String toString() {
        return super.toString() + String.format("\nSalary: $%.2f\nQualification: %s", salary, quali);
    }
}