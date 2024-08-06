package com.apradalabs.machineStateTest.repository;


import com.apradalabs.machineStateTest.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
