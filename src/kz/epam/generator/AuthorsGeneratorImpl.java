package kz.epam.generator;

import kz.epam.model.*;

import java.util.*;
import java.util.stream.Collectors;

public class AuthorsGeneratorImpl implements AuthorsGenerator {

    private BooksGenerator booksGenerator;

    private static final String[] namesForAuthors = {
            "Carol", "Paterson", "Wilson", "Shakespeare", "Tesla",
            "Tolstoy", "Wilde", "Dickens", "Obama", "Joyce", "Burns"
    };

    public AuthorsGeneratorImpl(BooksGenerator booksGenerator) {
        this.booksGenerator = booksGenerator;
    }

    @Override
    public List<Author> createAuthors() {
        int numberOfAuthors = namesForAuthors.length;
        int maxNumberOfBooks = 10;
        List<Author> authors = new ArrayList<>(numberOfAuthors);
        for(int i = 0; i < numberOfAuthors; i++) {
            Author author = new Author();
            author.setName(namesForAuthors[i]);
            author.setBooks(booksGenerator.generateRandomBooks(maxNumberOfBooks));
            authors.add(author);
        }
        return authors;
    }

    @Override
    public List<Author> splitAuthorsByGenre(List<Author> authors) {
        List<Author> authorsByGenre = new LinkedList<>();
        for(Author author : authors) {
            Map<Genre, List<Book>> booksByGenre = author.getBooks()
                    .stream()
                    .collect(Collectors.groupingBy(Book::getGenre));
            List<Author> authorByGenre = booksByGenre.values()
                    .stream()
                    .map(books -> (new Author(author.getName(), new HashSet<>(books))))
                    .collect(Collectors.toList());
            authorsByGenre.addAll(authorByGenre);
        }
        return authorsByGenre;
    }
}
