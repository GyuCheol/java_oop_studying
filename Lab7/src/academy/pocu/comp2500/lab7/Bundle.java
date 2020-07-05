package academy.pocu.comp2500.lab7;

import java.util.HashSet;
import java.util.Objects;

public class Bundle {

    private String name;
    private HashSet<Book> bookSet = new HashSet<>();

    public Bundle(String name) {
        this.name = name;
    }

    public boolean add(Book book) {
        if (bookSet.contains(book)) {
            return false;
        }

        bookSet.add(book);

        return true;
    }

    public boolean remove(Book book) {
        if (bookSet.contains(book) == false) {
            return false;
        }

        bookSet.remove(book);

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bundle bundle = (Bundle) o;

        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = name.hashCode();

        for (Book b : bookSet) {
            hash += b.hashCode();
        }

        return hash;
    }
}
