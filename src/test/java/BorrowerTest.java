import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower1;
    Book book1;
    @Before
    public void before(){
        borrower1 = new Borrower();
        book1 = new Book();
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
}
