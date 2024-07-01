import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Book findBook(String isbn) {
        return books.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst().orElse(null);
    }

    public User findUser(String id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean borrowBook(String isbn, String userId) {
        Book book = findBook(isbn);
        User user = findUser(userId);
        if (book != null && !book.isBorrowed() && user != null) {
            book.borrowBook();
            user.incrementBooksBorrowed();
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn, String userId) {
        Book book = findBook(isbn);
        User user = findUser(userId);
        if (book != null && book.isBorrowed() && user != null) {
            book.returnBook();
            user.decrementBooksBorrowed();
            return true;
        }
        return false;
    }

    public void listBooks() {
        books.forEach(System.out::println);
    }

    public void listUsers() {
        users.forEach(System.out::println);
    }
}
