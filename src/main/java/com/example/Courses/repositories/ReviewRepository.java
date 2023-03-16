package com.example.Courses.repositories;

import com.example.Courses.model.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewRepository {
    public List<Review> reviews = new ArrayList<>();
    public ReviewRepository() {
        reviews.add(new Review(1, "I like this course"));
        reviews.add(new Review(2, "Great"));
        reviews.add(new Review(3, "Nice"));
    }
    public Review findReview(String keyword) {
        for (Review review : reviews) {
            if (review.getComment().contains(keyword)) {
                return review;
            }
        }
        return null;
    }

    // As a user, I want to see an abbreviated summary of all the reviews of a course
}
