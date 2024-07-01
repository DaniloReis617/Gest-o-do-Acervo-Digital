import java.util.Scanner;

public class MainConsole {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add initial books and users for demonstration
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        library.addUser(new User("Alice", "001"));
        library.addUser(new User("Bob", "002"));

        // Menu loop
        while (true) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. List Books");
            System.out.println("2. List Users");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    library.listUsers();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void borrowBook() {
        System.out.print("Enter ISBN of the book to borrow: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        if (!library.borrowBook(isbn, userId)) {
            System.out.println("Error borrowing book. Please check ISBN and user ID.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter ISBN of the book to return: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        if (!library.returnBook(isbn, userId)) {
            System.out.println("Error returning book. Please check ISBN and user ID.");
        }
    }
}
