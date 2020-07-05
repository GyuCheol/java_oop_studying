package academy.pocu.comp2500.lab7;

import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int publishedYear;
    private Genre genre;

    public Book(String title, Author author, int publishedYear, Genre genre) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", this.title, this.author.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishedYear, genre);
    }
}
