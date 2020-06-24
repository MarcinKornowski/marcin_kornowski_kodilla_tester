package com.kodilla.soap_library.repository;

import com.kodilla.books.soap.Book;
import com.kodilla.books.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {

    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {

        Book book1 = new Book();
        book1.setBookNumber("1SF");
        book1.setTitle("Book1");
        book1.setAuthor("Author1");
        book1.setPubYear(2000);
        book1.setGenre(Genre.FANTASY);
        books.put(book1.getBookNumber(), book1);

        Book book2 = new Book();
        book2.setBookNumber("2SF");
        book2.setTitle("Book2");
        book2.setAuthor("Author2");
        book2.setPubYear(2005);
        book2.setGenre(Genre.FANTASY);
        books.put(book2.getBookNumber(), book2);

        Book book3 = new Book();
        book3.setBookNumber("1CR");
        book3.setTitle("Title3");
        book3.setAuthor("Author3");
        book3.setPubYear(2010);
        book3.setGenre(Genre.CRIMINAL);
        books.put(book3.getBookNumber(), book3);

        Book book4 = new Book();
        book4.setBookNumber("1DC");
        book4.setTitle("Title4");
        book4.setAuthor("Author4");
        book4.setPubYear(2015);
        book4.setGenre(Genre.DOCUMENTARY);
        books.put(book4.getBookNumber(), book4);
    }

    public Book findBook(String bookNumber) {
        Assert.notNull(bookNumber, "You have to specify the books call number");
        return books.get(bookNumber);
    }
}
