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

    public void borrowBook(Library library){
        if (library.getBookCollectionCount() > 0){
            Book removedBook = library.removeBookFromCollection();
            this.bookCollection.add(removedBook);

        }
    }
}
