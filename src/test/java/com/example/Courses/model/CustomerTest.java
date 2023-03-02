package com.example.Courses.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void canSplitFullName() {
        Customer customer = new Customer("Danny Yang");

        assertEquals("Danny", customer.getFirstName());
        assertEquals("Yang", customer.getLastName());
    }
    @Test
    void canSplitFullNameWithLeadingSpace() {
        Customer customer = new Customer(" Danny Yang");

        assertEquals("Danny", customer.getFirstName());
        assertEquals("Yang", customer.getLastName());
    }

    @Test
    void canSplitFullNameWithMiddleName() {
        Customer customer = new Customer(" Danny Toua Yang");

        assertEquals("Danny", customer.getFirstName());
        assertEquals("Toua", customer.getMiddleName());
        assertEquals("Yang", customer.getLastName());
    }
}