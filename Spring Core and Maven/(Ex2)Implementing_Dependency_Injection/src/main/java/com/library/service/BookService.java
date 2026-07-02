package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService: instance created (no-arg constructor)");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService: BookRepository injected via setter");
    }

    public List<String> listAllBooks() {
        return bookRepository.findAll();
    }

    public void addBook(String title) {
        bookRepository.save(title);
    }
}