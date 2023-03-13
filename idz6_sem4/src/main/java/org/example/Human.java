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

    public ArrayList<Human> ListDemo(ArrayList<Human> humans, Human human) {
        ArrayList<Human> same_surname = new ArrayList<>();
        for (int i = 0; i < humans.size(); i++) {
            if (human.surname.equals(humans.get(i).name)) {
                same_surname.add(humans.get(i));
            }
        }
        return same_surname;
    }
}
