import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI extends JFrame {
    private Library library;
    private JTextArea displayArea;
    private JTextField isbnField;
    private JTextField userIdField;

    public LibraryGUI(Library library) {
        this.library = library;
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 2));

        controlPanel.add(new JLabel("ISBN:"));
        isbnField = new JTextField();
        controlPanel.add(isbnField);

        controlPanel.add(new JLabel("User ID:"));
        userIdField = new JTextField();
        controlPanel.add(userIdField);

        JButton borrowButton = new JButton("Borrow Book");
        borrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrowBook();
            }
        });
        controlPanel.add(borrowButton);

        JButton returnButton = new JButton("Return Book");
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnBook();
            }
        });
        controlPanel.add(returnButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private void borrowBook() {
        String isbn = isbnField.getText().trim();
        String userId = userIdField.getText().trim();
        if (library.borrowBook(isbn, userId)) {
            displayArea.append("Book borrowed successfully.\n");
        } else {
            displayArea.append("Error borrowing book. Please check ISBN and user ID.\n");
        }
        clearFields();
    }

    private void returnBook() {
        String isbn = isbnField.getText().trim();
        String userId = userIdField.getText().trim();
        if (library.returnBook(isbn, userId)) {
            displayArea.append("Book returned successfully.\n");
        } else {
            displayArea.append("Error returning book. Please check ISBN and user ID.\n");
        }
        clearFields();
    }

    private void clearFields() {
        isbnField.setText("");
        userIdField.setText("");
    }

    public static void main(String[] args) {
        // Create a library and add some books and users for demonstration
        Library library = new Library();
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "1234567890"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
        library.addUser(new User("Alice", "001"));
        library.addUser(new User("Bob", "002"));

        // Create and show the GUI
        LibraryGUI gui = new LibraryGUI(library);
        gui.setVisible(true);
    }
}
