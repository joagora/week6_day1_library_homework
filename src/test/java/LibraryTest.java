import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    @Before
    public void before(){
        library1 = new Library();
    }

    @Test
    public void canGetBookCollectionCount(){
        assertEquals(0, library1.getBookCollectionCount());
    }
}
