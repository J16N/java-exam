/*
 * Description : Get the password
 * Author      : Mr. Rabbit
 */

public class Program_40 {
    public static void main(String[] args) {
        Person p = new Person("Alom Madan Kanto", "1234536344564");
        System.out.println("Password: " + p.getPassword());
    }
}

class Person {
    private String fname, mname, lname;
    private String roll;

    Person(String name, String roll) {
        String[] names = name.split(" ");
        if (names.length == 3) {
            this.fname = names[0];
            this.mname = names[1];
            this.lname = names[2];
        }
        else if (names.length == 2) {
            this.fname = names[0];
            this.lname = names[1];
        }
        else {
            this.fname = names[0];
        }
        this.roll = roll;
    }

    public String getPassword() {
        return fname.substring(0, 1) + 
               mname.substring(0, 1) + 
               lname.substring(0, 1) + 
               roll.substring(roll.length() - 4);
    }
}