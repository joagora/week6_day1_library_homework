import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;
    @Before
    public void before(){
        book1 = new Book(GenreType.COMEDY);
    }

    @Test
    public void hasGenre(){
        assertEquals(GenreType.COMEDY, book1.getGenre());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Funny", book1.getDescription());
    }
}
