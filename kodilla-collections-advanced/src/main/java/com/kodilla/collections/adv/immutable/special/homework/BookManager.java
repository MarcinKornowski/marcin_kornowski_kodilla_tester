package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    protected List<Book> books = new ArrayList<>();

    public BookManager() {
    }

    public Book createBook(String title, String author) {

        Book book = new Book(title, author);

        for(Book comparedBook: books) {
            if(comparedBook.equals(book)) {
                return comparedBook;
            }
        }

        books.add(book);
        return  book;

    }

}