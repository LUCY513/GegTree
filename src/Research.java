import java.util.List;

public class Research {
    public static void printTree(String name, Tree tree){
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if(el.getPeopleFirst().getName().equals(name) &&
            el.getLink() == Person.PARENT);
                System.out.println((el.getPeopleFirst()));
        }
    }
}
