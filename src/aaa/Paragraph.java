package aaa;

public class Paragraph implements Element{

    String text;
    AlignStrategy allignStrategy=null;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.allignStrategy=alignStrategy;
    }

    @Override
    public void print() {
        if (allignStrategy==null)
            System.out.println(text);
        else
            this.allignStrategy.render(this);
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
