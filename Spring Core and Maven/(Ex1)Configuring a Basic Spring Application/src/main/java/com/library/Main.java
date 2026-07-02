// src/main/java/com/library/Main.java
package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");

        System.out.println("\n--- Existing Books ---");
        bookService.listAllBooks().forEach(System.out::println);

        System.out.println("\n--- Adding a new book ---");
        bookService.addBook("Design Patterns: Elements of Reusable OO Software");

        System.out.println("\n--- Updated Books ---");
        bookService.listAllBooks().forEach(System.out::println);
    }
}