package aaa;

import java.util.ArrayList;

public class TableOfContents implements Element {

    ArrayList<String> contents;

    public TableOfContents() {
        this.contents = new ArrayList<String>();
    }

    public void addEntry(String entry){
        contents.add(entry);
    }


    @Override
    public void print() {
        contents.forEach(System.out::println);
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}


