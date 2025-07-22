package com.example.ss5.repository;

import com.example.ss5.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // JpaRepository already provides CRUD operations:
    // save(), findAll(), findById(), deleteById(), etc.

    // You can add custom queries if needed
    // List<Book> findByAuthor(String author);
    // List<Book> findByTitleContaining(String title);
}