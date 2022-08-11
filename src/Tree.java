import java.util.ArrayList;
import java.util.List;

// Хранение множество взаимосвязей между людми
public class Tree {
    // Хранит связи между людьми
    private List<Link> links = new ArrayList<>();

    public List<Link> getLinks(){
        return links;
    }

    public void addLink (Human p1, Human p2, Person link1, Person link2){
        Link l1 = new Link(p1, p2, link1);
        Link l2 = new Link(p2, p1, link2);

        // Записываем заимосвязь между людми
        links.add(l1);
        links.add(l2);
    }


}
