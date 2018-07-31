import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    Book book1;
    @Before
    public void before(){
        library1 = new Library();
        book1 = new Book();
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
}
