// Book class (independent)
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}

// Library class (contains books)
class Library {
    String name;
    Book book; // Aggregation (Library has a Book)

    public Library(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public void displayLibrary() {
        System.out.println("Library: " + name);
        book.displayBook();
    }
}

// Main class
public class Aggregation{
    public static void main(String[] args) {
        // Creating a book object
        Book book1 = new Book("Java Programming", "James Gosling");

        // Creating a library object and associating it with the book
        Library lib = new Library("City Library", book1);

        // Display library details
        lib.displayLibrary();
    }
}
