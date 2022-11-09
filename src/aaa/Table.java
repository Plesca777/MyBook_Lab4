package aaa;

public class Table implements Element {

    String title;

    public Table(String title) {
        this.title = title;
    }


    @Override
    public void print() {
        System.out.println(title);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int nr) {
        return null;
    }
}
