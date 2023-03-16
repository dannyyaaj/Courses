package com.example.Courses.repositories;

import com.example.Courses.model.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReviewRepositoryTest {

    @Test
    void canFindReview() {
        ReviewRepository reviewRepository = new ReviewRepository();
        Review review = reviewRepository.findReview("like");
        assertEquals("I like this course", review.getComment());
    }
}