package com.example.project.project.service;

import com.example.project.project.entity.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<BookEntity> findAllBooks();
    Optional<BookEntity> findById(Long id);
}
