package com.example.Courses.repositories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseRepositoryTest {

    @Test
    void canFindAveragePrice() {
        CourseRepository courseRepository = new CourseRepository();
        assertEquals(12.0, courseRepository.getAveragePrice());
    }
}