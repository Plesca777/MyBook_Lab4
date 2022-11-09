package aaa;

public class Paragraph implements Element{

    String text;

    public Paragraph(String text) {
        this.text = text;
    }


    @Override
    public void print() {
        System.out.println(text);
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
