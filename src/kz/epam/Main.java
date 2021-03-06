package kz.epam;

import kz.epam.generator.AuthorsGenerator;
import kz.epam.generator.AuthorsGeneratorImpl;
import kz.epam.generator.BooksGenerator;
import kz.epam.generator.BooksGeneratorImpl;
import kz.epam.model.Author;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BooksGenerator booksGenerator = new BooksGeneratorImpl();
        AuthorsGenerator authorsGenerator = new AuthorsGeneratorImpl(booksGenerator);

        List<Author> authors = authorsGenerator.createAuthors();
        List<Author> authorsByGenre = authorsGenerator.splitAuthorsByGenre(authors);

        authors.forEach(System.out::println);
        authorsByGenre.forEach(System.out::println);
    }
}
