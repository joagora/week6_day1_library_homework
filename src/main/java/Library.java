import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;


    public Library(int capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getBookCollectionCount(){
        return this.bookCollection.size();
    }

    public void addBook(Book book){
        if (checkIfSpaceInBookCollection() == false){
            return;
        } else {
            this.bookCollection.add(book);
        }

    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean checkIfSpaceInBookCollection(){
        if (getBookCollectionCount() < this.capacity) {
            return true;
        } else {
            return false;
        }
    }

    public void removeBookFromCollection(Book book){
        if (getBookCollectionCount() > 0){
            this.bookCollection.remove(book);
        } else {
            return;
        }
    }

}
