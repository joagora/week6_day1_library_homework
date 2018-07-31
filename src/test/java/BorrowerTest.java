import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower1;
    Book book1;
    Library library1;
    @Before
    public void before(){
        borrower1 = new Borrower();
        book1 = new Book(GenreType.COMEDY);
        library1 = new Library(4);
    }

    @Test
    public void canGetBookCollection(){
        assertEquals(0, borrower1.getBookCollectionSize());
    }

    @Test
    public void canAddBook(){
        borrower1.addBook(book1);
        assertEquals(1, borrower1.getBookCollectionSize());
    }

    @Test
    public void canBorrowBookRemoveFromLibrary(){
        library1.addBook(book1);
        assertEquals(1, library1.getBookCollectionCount());
        borrower1.borrowBook(library1);
        assertEquals(1, borrower1.getBookCollectionSize());
        assertEquals(0, library1.getBookCollectionCount());
    }
}
