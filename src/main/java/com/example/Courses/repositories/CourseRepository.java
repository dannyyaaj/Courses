package com.example.Courses.repositories;

import com.example.Courses.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    public List<Course> courses = new ArrayList<>();
    public CourseRepository() {
        courses.add(new Course("Learn Java", 10.50));
        courses.add(new Course("Learn Angular", 20.00));
        courses.add(new Course("The Modern Angular Bootcamp", 5.50));
        courses.add(new Course("Professional Java Developer Career Starter: Java Foundations", 12.00));
    }
    public Double getAveragePrice() {
        Double totalPrice = 0.0;
        for (Course course : courses) {
            totalPrice += course.getPrice();
        }
        Double averagePrice =  (totalPrice/ courses.size());
        return averagePrice;
    }
}
