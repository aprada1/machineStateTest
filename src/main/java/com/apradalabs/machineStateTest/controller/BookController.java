package com.apradalabs.machineStateTest.controller;

import com.apradalabs.machineStateTest.entity.Book;
import com.apradalabs.machineStateTest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookService.updateBook(id, updatedBook);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
