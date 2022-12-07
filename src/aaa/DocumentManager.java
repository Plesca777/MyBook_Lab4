package aaa;

public class DocumentManager {

    private static DocumentManager instance;
    private Book book;

    public static DocumentManager getInstance(){

        synchronized (DocumentManager.class){
            if(instance==null){
                instance=new DocumentManager();
            }
        }
        return instance;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
