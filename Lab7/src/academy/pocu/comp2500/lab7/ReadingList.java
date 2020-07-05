package academy.pocu.comp2500.lab7;

import java.util.ArrayList;
import java.util.Objects;

public class ReadingList {

    private String name;
    private ArrayList<Book> bookList = new ArrayList<>();

    public ReadingList(String name) {
        this.name = name;
    }

    public boolean add(Book book) {

        if (book == null) {
            return false;
        }

        for (Book b : bookList) {
            if (b == book) {
                return false;
            }
        }

        bookList.add(book);

        return true;

    }

    public boolean remove(Book book) {

        if (bookList.contains(book) == false) {
            return false;
        }

        bookList.remove(book);
        return true;

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int id = 1;

        for (Book b : bookList) {

            sb.append(id);
            sb.append('.');
            sb.append(' ');
            sb.append(b.toString());
            sb.append('\n');

            ++id;
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReadingList that = (ReadingList) o;

        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = name.hashCode();
        int id = 1;

        for (Book b : bookList) {
            hash += (b.hashCode() << id);
            ++id;
        }

        return hash;
    }
}
