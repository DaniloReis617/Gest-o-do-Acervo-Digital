import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testBorrowBook() {
        Book book = new Book("Test Book", "Test Author", "9876543210");
        assertFalse(book.isBorrowed());
        book.setBorrowed(true);
        assertTrue(book.isBorrowed());
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("Test Book", "Test Author", "9876543210");
        book.setBorrowed(true);
        assertTrue(book.isBorrowed());
        book.setBorrowed(false);
        assertFalse(book.isBorrowed());
    }
}
