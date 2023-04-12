package org.example;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String lastname;
    private int year;
    private int month;
    private int day;

    public Person(String name, String surname, String lastname, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Person() {
        this.name = "Ruslan";
        this.surname = "Mikula";
        this.lastname = "Vitalievich";
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Person person) {
        if (this == person) return true;
        return person.name.equals(this.name) && person.surname.equals(this.surname) && person.lastname.equals(this.lastname) && person.day == this.day
                && person.month == this.month && person.year == this.year;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.lastname.hashCode() + this.year + this.day + this.month;
    }
}
