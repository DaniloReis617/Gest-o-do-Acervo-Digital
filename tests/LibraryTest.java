import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testBorrowBook() {
        User user = new User("Test User", "001");
        assertEquals(0, user.getBorrowedBooks());
        user.incrementBooksBorrowed();
        assertEquals(1, user.getBorrowedBooks());
    }

    @Test
    public void testReturnBook() {
        User user = new User("Test User", "001");
        user.incrementBooksBorrowed();
        assertEquals(1, user.getBorrowedBooks());
        user.decrementBooksBorrowed();
        assertEquals(0, user.getBorrowedBooks());
    }
}
