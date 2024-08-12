package com.apradalabs.machineStateTest.repository;


import com.apradalabs.machineStateTest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
