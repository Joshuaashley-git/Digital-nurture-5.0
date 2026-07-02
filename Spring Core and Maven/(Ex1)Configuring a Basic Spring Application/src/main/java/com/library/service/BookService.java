// src/main/java/com/library/service/BookService.java
package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService: instance created with injected repository");
    }

    public List<String> listAllBooks() {
        return bookRepository.findAll();
    }

    public void addBook(String title) {
        bookRepository.save(title);
    }
}