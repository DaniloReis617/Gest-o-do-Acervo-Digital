CREATE TABLE books (
    isbn VARCHAR(20) PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    is_borrowed BOOLEAN
);

CREATE TABLE users (
    user_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    borrowed_books INT
);

INSERT INTO books (isbn, title, author, is_borrowed) VALUES
    ('1234567890', 'The Catcher in the Rye', 'J.D. Salinger', false),
    ('0987654321', 'To Kill a Mockingbird', 'Harper Lee', false);

INSERT INTO users (user_id, name, borrowed_books) VALUES
    ('001', 'Alice', 0),
    ('002', 'Bob', 0);
