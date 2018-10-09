package com.sleepyheadsophie.model;

import com.sleepyheadsophie.generator.person.PersonGenerator;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Gender gender;
    private int age;
    private LocalDate dateOfBirth;
    private int inn;
    private Address address;


    public Person(PersonGenerator personGenerator, Gender gender, int age, LocalDate dateOfBirth, int inn, Address address) {
        this.firstName = personGenerator.getFirstName();
        this.middleName = personGenerator.getMiddleName();
        this.lastName = personGenerator.getLastName();
        this.gender = gender;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.inn = inn;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getInn() {
        return inn;
    }

    public Address getAddress() {
        return address;
    }
}
