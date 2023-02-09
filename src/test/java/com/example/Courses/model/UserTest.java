package com.example.Courses.model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class UserTest {

    @Test
    void getFirstName() {
        User user = new User("patrick", "neil", "harris");
        assertEquals(user.getFirstName(), "Patrick");
    }
}