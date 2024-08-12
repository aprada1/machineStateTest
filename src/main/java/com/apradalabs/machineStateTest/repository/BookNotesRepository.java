package com.apradalabs.machineStateTest.repository;

import com.apradalabs.machineStateTest.entity.BookNotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookNotesRepository extends JpaRepository< BookNotes,Long> {

    @Query("SELECT bn FROM BookNotes bn WHERE bn.book.id = :bookId AND bn.version = :version")
    List<BookNotes> findByBookIdAndVersion(@Param("bookId") Long bookId, @Param("version") Long version);


    @Query("SELECT bn FROM BookNotes bn WHERE bn.book.id = :bookId")
    List<BookNotes> findByBookId(@Param("bookId")long bookId);

}
