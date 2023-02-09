package com.example.Courses.model;

import static com.example.Courses.model.StringUtil.format;

public class User {
    private String userName;
    private String emailAddress;
    private String firstName;
    private String middleName;
    private String lastName;

    public User(String firstName, String middleName, String lastName) {
        this.firstName = format(firstName);
        this.middleName = middleName;
        this.lastName = format(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getMiddleInitial() {
        return middleName.toUpperCase().charAt(0);
    }

    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}