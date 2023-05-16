package org.example;

public class Human {
   private String surname;
   private String name;
   private int age;

    enum Sex {Male, Female}

   private Sex sex;

    public Human() {
        this.surname = "Surname";
        this.name = "name";
        this.age = 0;
        this.sex = Sex.Male;
    }

    public Human(String input_surname, String input_name, int input_age, Sex input_sex) {
        this.surname = input_surname;
        this.name = input_name;
        this.age = input_age;
        this.sex = input_sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean equals(Human human) {
        return human.name.equals(this.name) && human.surname.equals(this.surname) && human.age == this.age && human.sex == this.sex;
    }

    @Override
    public int hashCode() {
        return this.age + this.name.hashCode() + this.surname.hashCode() + this.sex.hashCode();
    }
}
