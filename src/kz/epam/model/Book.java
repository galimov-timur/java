package kz.epam.model;

import java.util.Objects;

public class Book {
    private String name;
    private Genre genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre);
    }

    @Override
    public String toString() {
        return  "\n\t\t" + "Название: '" + name + '\''+ ", " + "\n\t\t" +
                "жанр: '" + genre + '\'' + "\n\t";
    }
}