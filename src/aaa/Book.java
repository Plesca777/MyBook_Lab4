package aaa;
//Lab3

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    ArrayList<Author> authors;

    public Book(String title) {
       super(title);
       this.authors=new ArrayList<Author>();

    }

    public void print(){
        System.out.println(this.title);
        authors.forEach(Author::print);
        elements.forEach(Element::print);
    }

    public void addAuthor(Author a1){
        authors.add(a1);
    }


}




/*

package aaa;


        import java.lang.reflect.Array;
        import java.util.ArrayList;
        import java.util.List;

public class Book {

    String name;
    ArrayList<String> paragraphs = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();
    ArrayList<String> tables = new ArrayList<>();


    public Book(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraph){
        paragraphs.add(paragraph);
    }

    public void createNewImage(String image){
        images.add(image);
    }

    public void createNewTable(String table){
        tables.add(table);
    }

    public void print(){
        for (int i=0; i<paragraphs.size(); i++){
            System.out.println(paragraphs.get(i));
        }
        for (int i=0; i<images.size(); i++){
            System.out.println(images.get(i));
        }
        for (int i=0; i<tables.size(); i++){
            System.out.println(tables.get(i));
        }
    }
}
  */