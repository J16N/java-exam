/*
 * Description : Balance checker
 * Author      : Mr. Rabbit
 */

public class Program_26 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.init(123, "Mr. Rabbit", "Savings", 1000);
        ba.display();
        System.out.println();

        ba.deposit(100);
        ba.display();
        System.out.println();

        ba.withdraw(500);
        ba.display();
        System.out.println();

        ba.withdraw(1000);
    }
}

class BankAccount {
    private int accNo;
    private String name, accType;
    private double bal;

    public void init(int accNo, String name, String accType, double bal) {
        this.accNo = accNo;
        this.name = name;
        this.accType = accType;
        this.bal = bal;
    }

    public void deposit(double amt) {
        bal += amt;
    }

    public void withdraw(double amt) {
        if (bal >= amt)
            bal -= amt;
        else
            System.out.println("Insufficient Balance.");
    }

    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Balance: " + bal);
    }
}