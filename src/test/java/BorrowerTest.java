import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower1;
    @Before
    public void before(){
        borrower1 = new Borrower();
    }

    @Test
    public void canGetBookCollection(){
        assertEquals(0, borrower1.getBookCollectionSize());
    }
}
