package kz.epam.generator;

import kz.epam.model.*;
import java.util.*;

public class BooksGeneratorImpl implements BooksGenerator {
    private final Random random = new Random();
    private static final String[] namesForBooks = {
            "Lord of the Flies", "Dune", "The Giver", "The Hobbit, or There and Back Again", "The Alchemist", "The Hunger Games",
            "To Kill a Mockingbird", "The Kite Runner", "The Book Thief", "The Help", "Angels & Demons", "Looking for Alaska",
            "Catching Fire", "Water for Elephants", "Pride and Prejudice", "Dracula", "Fahrenheit 451", "The Outsiders"
    };

    @Override
    public Set<Book> generateRandomBooks(int maxBooks) {
        Set<Book> books = new HashSet<>();
        int numberOfBooks = 1 + random.nextInt(maxBooks);
        while(books.size() < numberOfBooks) {
            int quantityOfBookNames = namesForBooks.length;
            int quantityOfBookGenres = Genre.values().length;
            String bookName = namesForBooks[random.nextInt(quantityOfBookNames)];
            Genre bookGenre = Genre.values()[random.nextInt(quantityOfBookGenres)];
            Book book = new Book();
            book.setName(bookName);
            book.setGenre(bookGenre);
            books.add(book);
        }
        return books;
    }
}
