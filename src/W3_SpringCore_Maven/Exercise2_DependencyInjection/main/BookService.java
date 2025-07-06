package W3_SpringCore_Maven.Exercise2_DependencyInjection.main;

public class BookService {
    private BookRepository bookRepository;

    // Setter for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        bookRepository.getBooks();
    }
}
