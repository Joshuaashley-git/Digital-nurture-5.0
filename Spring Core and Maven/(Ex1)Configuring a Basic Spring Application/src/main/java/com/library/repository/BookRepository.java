// src/main/java/com/library/repository/BookRepository.java
package com.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<String> books = new ArrayList<>();

    public BookRepository() {
        System.out.println("BookRepository: instance created");
        books.add("Effective Java");
        books.add("Clean Code");
        books.add("Head First Design Patterns");
    }

    public List<String> findAll() {
        return books;
    }

    public void save(String title) {
        books.add(title);
        System.out.println("BookRepository: saved '" + title + "'");
    }
}