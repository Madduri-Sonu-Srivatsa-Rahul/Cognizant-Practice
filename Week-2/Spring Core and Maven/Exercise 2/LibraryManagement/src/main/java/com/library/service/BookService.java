package com.library.service;
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayAllBooks() {
        String[] books = bookRepository.getBooks();

        System.out.println("Books in Library:");

        for(String book : books) {
            System.out.println(book);
        }
    }
}