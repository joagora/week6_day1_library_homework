import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before(){
        library1 = new Library(4);
        book1 = new Book(GenreType.THRILLER);
        book2 = new Book(GenreType.DRAMA);
        book3 = new Book(GenreType.THRILLER);
        book4 = new Book(GenreType.COMEDY);
        book5 = new Book(GenreType.COMEDY);
    }

    @Test
    public void canGetBookCollectionCount(){
        assertEquals(0, library1.getBookCollectionCount());
    }

    @Test
    public void canAddBook(){
        library1.addBook(book1);
        assertEquals(1, library1.getBookCollectionCount());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(4, library1.getCapacity());
    }

    @Test
    public void canCheckIfSpaceForBook(){
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        assertEquals(false, library1.checkIfSpaceInBookCollection());
    }

    @Test
    public void doesNotAddIfNoSpace(){
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        assertEquals(4, library1.getBookCollectionCount());
    }

    @Test
    public void canRemoveBook(){
        library1.addBook(book1);
        assertEquals(1, library1.getBookCollectionCount());
        library1.removeBookFromCollection();
        assertEquals(0, library1.getBookCollectionCount());
    }

}
