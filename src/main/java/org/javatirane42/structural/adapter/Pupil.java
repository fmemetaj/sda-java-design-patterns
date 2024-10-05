package org.javatirane42.structural.adapter;

import java.util.List;

public class Pupil {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<Integer> grades;

    public Pupil(String firstName, String lastName, Integer age, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
