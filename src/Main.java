import java.util.*;

public class Main {
    public static void main(String[] args) {
        Human people = new Human("Lucy", "Dobraya", "69");
        Human people1 = new Human("Timur", "Dobraya", "35");
        Human people2 = new Human("Selena", "Dobraya", "18");

        Tree tree = new Tree();
        tree.addLink(people1, people, Person.PARENT, Person.CHAILD);
        tree.addLink(people1, people2, Person.PARENT, Person.CHAILD);


        Research.printTree("Timur", tree);
    }
}