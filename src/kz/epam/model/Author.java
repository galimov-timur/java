package kz.epam.model;

import java.util.HashSet;
import java.util.Set;

public class Author {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return  "------------------------------------------" + "\n" +
                "Имя автора: " + '\'' + name + '\'' + '\n' +
                "Книги: " + "\n" +
                 "\t" + books;
    }
}
