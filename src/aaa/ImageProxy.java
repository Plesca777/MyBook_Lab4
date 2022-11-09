package aaa;
//Lab3
import java.awt.*;

public class ImageProxy implements Element,Picture{
    public String url;
    public int dim;
    public Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        //this.dim = dim;
    }

    public Image loadImage() {
        if (realImage==null)
            realImage=new Image(url);
        return realImage;
    }


    @Override
    public void print() {
        loadImage().print();
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
    public String url() {
        return url;
    }

    @Override
    public int dim() {
        return dim;
    }

    @Override
    public String content() {
        return null;
    }
}
