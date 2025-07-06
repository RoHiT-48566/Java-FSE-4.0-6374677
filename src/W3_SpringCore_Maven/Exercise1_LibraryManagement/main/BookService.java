package W3_SpringCore_Maven.Exercise1_LibraryManagement.main;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("BookService: Listing books...");
        bookRepository.getBooks();
    }
}
