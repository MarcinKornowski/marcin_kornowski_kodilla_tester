package com.kodilla.collections.adv.immutable.special.homework;

public class BookApp {

    public static void main(String[] args) {

        BookManager book = new BookManager();
        Book book1 = book.createBook("Title1", "Author1");
        Book book2 = book.createBook("Title2", "Author2");
        Book book3 = book.createBook("Title3", "Author3");
        Book book4 = book.createBook("Title3", "Author3");
        Book book5 = book.createBook("Title1", "Author1");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());
        System.out.println(book5.hashCode());

        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        System.out.println(book1 == book3);
        System.out.println(book4 == book3);
        System.out.println(book1 == book5);

    }

}
