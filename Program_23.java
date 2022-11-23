/*
 * Description : Trees and gardens
 * Author      : Mr. Rabbit
 */

public class Program_23 {
    public static void main(String[] args) {
        Garden.display();
    }
}

class Garden {
    public static void display() {
        Tree t1 = new Tree(1, 5, 7, 100);
        Tree t2 = new Tree(2, 6, 8, 200);
        MangoTree m1 = new MangoTree(3, 7, 9, 300);
        MangoTree m2 = new MangoTree(4, 8, 10, 400);

        display(t1, t2, m1, m2);
        System.out.println("After 1 year:\n");
        
        t1.annualUpdate();
        t2.annualUpdate();
        m1.annualUpdate();
        m2.annualUpdate();

        display(t1, t2, m1, m2);
    }

    private static void display(Tree t1, Tree t2, MangoTree m1, MangoTree m2) {
        System.out.println("Tree Details:\n");
        System.out.println("Tree 1:\n" + t1 + "\n");
        System.out.println("Tree 2:\n" + t2 + "\n");
        System.out.println("Mango Tree 1:\n" + m1 + "\n");
        System.out.println("Mango Tree 2:\n" + m2 + "\n");
    }
}

class Tree {
    protected int treeCode;
    protected double height, width, amount;

    Tree (int treeCode, double height, double width, double amount) {
        this.treeCode = treeCode;
        this.height = height;
        this.width = width;
        this.amount = amount;
    }

    public void annualUpdate() {
        height += 5;
        width += 5;
        amount += 100;
    }

    public String toString() {
        return String.format(
            "Tree Code: %d\nTree Height: %.2f\nTree Width: %.2f\nTree Amount: %.2f\n",
            treeCode, height, width, amount
        );
    }
}

class MangoTree extends Tree {
    protected int yield;
    
    MangoTree(int treeCode, double height, double width, double amount) {
        super(treeCode, height, width, amount);
    }

    public void annualUpdate() {
        super.annualUpdate();
        yield += 10;
    }

    public String toString() {
        return String.format(
            "Mango Tree Code: %d\n" + 
            "Mango Tree Height: %.2f\n" + 
            "Mango Tree Width: %.2f\n" + 
            "Mango Tree Amount: %.2f\n" + 
            "Mango Tree Yield: %d\n",
            treeCode, height, width, amount, yield
        );
    }
}