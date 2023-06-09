package org.example;

import java.util.ArrayList;

class Human {
    private String surname;
    private String name;

    private String patronymic;
    private int age;

    Human(String input_surname, String input_name, String input_patronymic, int input_age) {
        this.surname = input_surname;
        this.name = input_name;
        this.patronymic = input_patronymic;
        this.age = input_age;
    }

    Human() {
        this.surname = "";
        this.name = "";
        this.patronymic = "";
        this.age = 0;
    }

    Human(Human input) {
        this.name = input.name;
        this.surname = input.surname;
        this.patronymic = input.patronymic;
        this.age = input.age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Human human) {
        return this.name.equals(human.name) && this.surname.equals(human.surname)
                && this.patronymic.equals(human.patronymic) && this.age == human.age;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode() + this.patronymic.hashCode() + this.age;
    }
}
