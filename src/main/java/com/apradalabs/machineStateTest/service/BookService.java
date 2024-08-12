package com.apradalabs.machineStateTest.service;


import com.apradalabs.machineStateTest.entity.Book;
import com.apradalabs.machineStateTest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book getBookById(String id) {
        return bookRepository.findById(id).orElse(null);
    }
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    public Book updateBook(String id, Book updatedBook) {
        updatedBook.setId(id);
        return bookRepository.save(updatedBook);
    }
    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}