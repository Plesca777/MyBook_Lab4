package aaa;

import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture{

    String imageName;

    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void print() {
        System.out.println(imageName);
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
        visitor.visitImage(this);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public int dim() {
        return 0;
    }

    @Override
    public String content() {
        return null;
    }
}
