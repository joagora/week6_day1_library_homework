import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> bookCollection;

    public Borrower(){
        this.bookCollection = new ArrayList<>();
    }

    public int getBookCollectionSize(){
        return this.bookCollection.size();
    }

    public void addBook(Book book){
        this.bookCollection.add(book);
    }
}
