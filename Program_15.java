/*
 * Description : Consider the Student class that a student studies three subjects. 
 *               Each subject has a title, internal-marks and external-marks. Write a 
 *               Program to define such three students for each of which shows status 
 *               of individual subject (i.e. fail or pass) and total marks for the subjects.
 * Author      : Mr. Rabbit
 */

public class Program_15 {
    public static void main(String[] args) {
        Student s1 = new Student(
            "Mr. Rabbit",
            new Subject("Java", 70, 80),
            new Subject("Python", 80, 90),
            new Subject("C++", 60, 70)
        );

        Student s2 = new Student(
            "Mr. Rat",
            new Subject("Java", 30, 40),
            new Subject("Python", 70, 60),
            new Subject("C++", 50, 35)
        );

        Student s3 = new Student(
            "Mr. Cat",
            new Subject("Java", 40, 40),
            new Subject("Python", 50, 60),
            new Subject("C++", 80, 35)
        );

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class Student {
    private String name;
    private Subject s1, s2, s3;

    public Student(String name, Subject s1, Subject s2, Subject s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String toString() {
        return String.format(
            "Name: %s\nSubject 1:\n%s\n\nSubject 2:\n%s\n\nSubject 3:\n%s\n\n\n",
            name, s1, s2, s3
        );
    }
}

class Subject {
    private String name;
    private double emarks, imarks;

    public Subject(String name, double emarks, double imarks) {
        this.name = name;
        this.emarks = emarks;
        this.imarks = imarks;
    }

    public String toString() {
        String status = (emarks >= 40 && imarks >= 40) ? "Pass" : "Fail";
        double total = (emarks + imarks) / 200;
        
        return String.format(
            "Title: %s\nTotal Marks: %.2f\nStatus: %s", 
            name, total, status
        );
    }
}