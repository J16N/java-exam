/*
 * Description : Demonstrating custom exceptions
 * Author      : Mr. Rabbit
 */

public class Program_43 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Current salary: " + p.salary);

        while (true) {
            try {
                System.out.println("Withdrawing 10000...");
                p.withdraw(10000);
                System.out.println("Remaining salary: " + p.salary);
            }
            catch (PayOutOfBoundException ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
    }
}

class PayOutOfBoundException extends Exception {
    PayOutOfBoundException(String message) {
        super(message);
    }
}

class Person {
    public double salary = 31000;

    public void withdraw(double amount) throws PayOutOfBoundException {
        if (salary < 10000)
            throw new PayOutOfBoundException("Salary is below 10000!");
        
        salary -= amount;
    }
}