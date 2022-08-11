// Взаимосвязь между двумя людьми
public class Link {
    private Human peopleFirst;
    private Human peopleSecond;
    private Person link;              // Взаимосвязь

    public Link(Human peopleFirst, Human peopleSecond, Person link) {
        this.peopleFirst = peopleFirst;
        this.peopleSecond = peopleSecond;
        this.link = link;
    }

    public Human getPeopleFirst() {
        return peopleFirst;
    }

    public Human getPeopleSecond() {
        return peopleSecond;
    }

    public Person getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "peopleFirst=" + peopleFirst +
                ", peopleSecond=" + peopleSecond +
                ", link=" + link +
                '}';
    }
}
