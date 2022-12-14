package aaa;

public class ContentVisitor implements Visitor{

    int contentNumber;
    TableOfContents tableOfContents;

    public ContentVisitor(TableOfContents tableOfContents){
        this.tableOfContents=tableOfContents;
        this.contentNumber=0;
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        this.contentNumber++;
        tableOfContents.addEntry(section.title+"......"+this.contentNumber);
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.contentNumber++;

    }

    @Override
    public void visitImage(Image image) {
        this.contentNumber++;


    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {

    }

    @Override
    public void visitTable(Table table) {
        this.contentNumber++;

    }
}
