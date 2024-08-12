package com.apradalabs.machineStateTest.controller;

import com.apradalabs.machineStateTest.entity.BookNotes;
import com.apradalabs.machineStateTest.entity.Review;
import com.apradalabs.machineStateTest.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }

    @PostMapping("/bookNotes")
    public BookNotes addBookNote(@RequestBody BookNotes bookNotes) {
        return reviewService.saveBookNote(bookNotes);
    }

    @GetMapping("/bookNotesByVersion")
    public List<BookNotes> getBookNotesByVersion(@RequestParam Long bookId, @RequestParam Long version) {
       return reviewService.getBookNotesByVersion(bookId,version);
    }


    @GetMapping("/allBookNotes")
    public List<BookNotes> getBookNotesLastVersion(@RequestParam Long bookId) {
       return reviewService.getAllBookNotes(bookId);
    }

}