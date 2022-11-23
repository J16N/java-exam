/*
 * Description : Program_34
 * Author      : Mr. Rabbit
 */

public class Program_34 {
    public static void main(String[] args) {
        EMP emp = new EMP(1, "Mr. ABC");
        Scientist sc = new Scientist(2, "Mr. XYZ", 4);
        Dscientist dsc = new Dscientist(3, "Mr. PQR", 5, 6);

        System.out.println("EMP: " + emp + "\n");
        System.out.println("Scientist: " + sc + "\n");
        System.out.println("Dscientist: " + dsc + "\n");
    }
}

class EMP {
    public int id;
    public String name;

    EMP(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + "\nName: " + name;
    }
}

class Scientist extends EMP {
    public int no_of_publications;

    Scientist(int id, String name, int no_of_publications) {
        super(id, name);
        this.no_of_publications = no_of_publications;
    }

    public String toString() {
        return super.toString() + "\nNo. of publications: " + no_of_publications;
    }
}

class Dscientist extends Scientist {
    public int awards;

    Dscientist(int id, String name, int no_of_publications, int awards) {
        super(id, name, no_of_publications);
        this.awards = awards;
    }

    public String toString() {
        return super.toString() + "\nAwards: " + awards;
    }
}