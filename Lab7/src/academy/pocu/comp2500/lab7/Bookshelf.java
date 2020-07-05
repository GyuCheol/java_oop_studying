package academy.pocu.comp2500.lab7;

import java.util.ArrayList;
import java.util.Objects;

public class Bookshelf {

    private int maximumBookCount;
    private ArrayList<Book> bookList = new ArrayList<>();

    public Bookshelf(int maximumBookCount) {
        this.maximumBookCount = maximumBookCount;
    }

    public boolean add(Book book) {

        if (bookList == null) {
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

}
