package kz.epam.generator;

import kz.epam.model.Author;

import java.util.List;

/**
 * Base interface for Authors Generator
 */
public interface AuthorsGenerator {

    /**
     * Each author from provided list is split to several objects by genre.
     * @param authors list of Authors
     * @return modified list of authors
     */
    List<Author> splitAuthorsByGenre(List<Author> authors);

    /**
     * Creates and returns List of Authors
     * @return List of created authors
     */
    List<Author> createAuthors();
}
