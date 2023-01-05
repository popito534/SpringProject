package com.example.project.project.controller;

import com.example.project.project.dto.BookDTO;
import com.example.project.project.entity.BookEntity;
import com.example.project.project.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catalog")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookEntity> findAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/(id)")
    public Optional<BookEntity> findById(@PathVariable("id") Long id){
        return bookService.findById(id);
    }

    @RequestMapping("/AddBook")
    public String addBook(@RequestBody BookDTO bookDTO) {
        return bookDTO.id + bookDTO.author + bookDTO.title + bookDTO.price + bookDTO.genre + bookDTO.publishDate + bookDTO.description ;
    }
}
