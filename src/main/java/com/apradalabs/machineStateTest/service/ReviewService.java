package com.apradalabs.machineStateTest.service;


import com.apradalabs.machineStateTest.entity.Book;
import com.apradalabs.machineStateTest.entity.BookNotes;
import com.apradalabs.machineStateTest.entity.Review;
import com.apradalabs.machineStateTest.repository.BookNotesRepository;
import com.apradalabs.machineStateTest.repository.BookRepository;
import com.apradalabs.machineStateTest.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private BookNotesRepository bookNotesRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }


    public BookNotes saveBookNote(BookNotes bookNotes) {return bookNotesRepository.save(bookNotes);}

    public List<BookNotes> getBookNotesByVersion(Long bookId,long version){
        return bookNotesRepository.findByBookIdAndVersion(bookId,version);
    }

    public List<BookNotes> getAllBookNotes(Long bookId) {
        return  bookNotesRepository.findByBookId(bookId);
    }
}
