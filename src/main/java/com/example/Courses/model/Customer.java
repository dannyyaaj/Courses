package com.example.Courses.model;

public class Customer {
    private String firstName;
    private String middleName;
    private String lastName;

    public Customer(String fullName) {
       String[] names = fullName.strip().split("\s");
       if(names.length == 3) {
        firstName = names[0];
        middleName = names[1];
        lastName = names[2];
       } else {
           firstName = names[0];
           lastName = names[1];
       }
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
