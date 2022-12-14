package aaa;

import java.util.ArrayList;

public class Section implements Element{

    String title;
    ArrayList<Element> elements;

    public Section(String title) {
        this.title=title;
        this.elements=new ArrayList<Element>();
    }

    @Override
    public void print() {
        System.out.println(title);
        elements.forEach(element -> element.print());
    }

    @Override
    public void add(Element element) {
        this.elements.add(element);
    }

    @Override
    public void remove(Element element) {
        this.elements.remove(element);
    }

    @Override
    public Element get(int nr) {
        this.elements.get(nr);
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for(Element element: elements){
            element.accept(visitor);
        }
    }
}
