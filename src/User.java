public class User {
    private String name;
    private String id;
    private int booksBorrowed;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.booksBorrowed = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getBorrowedBooks() {
        return booksBorrowed;
    }

    public void incrementBooksBorrowed() {
        booksBorrowed++;
    }

    public void decrementBooksBorrowed() {
        booksBorrowed--;
    }

    @Override
    public String toString() {
        return String.format("User[ID=%s, Name=%s, Books Borrowed=%d]", id, name, booksBorrowed);
    }
}
