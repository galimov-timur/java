package kz.epam;

import kz.epam.model.Book;

import java.util.Set;

/**
 * Base interface for books generator
 */
public interface BooksGenerator {
    /**
     * Generates a set of random books
     * @param maxBooks maximum number of books generated
     * @return set of generated books
     */
    Set<Book> generateRandomBooks(int maxBooks);
}
