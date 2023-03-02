package com.example.Courses.model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class UserTest {

    @Test
    void getFirstName() {
        User user = new User("patrick", "neil", "harris");
        assertEquals("Patrick", user.getFirstName());
    }

    @Test
    void canCapitalize() {
        User user = new User("danny", "toua", "yang");
        assertEquals("Danny", user.getFirstName());
        assertEquals("Yang", user.getLastName());
    }
}