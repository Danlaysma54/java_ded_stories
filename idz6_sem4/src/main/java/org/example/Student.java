package org.example;

public class Student extends Human {
    String faculty_name;

    Student(String faculty_name, String input_surname, String input_name, String input_patronymic, int input_age) {
        super(input_surname, input_name, input_patronymic, input_age);
        this.faculty_name = faculty_name;
    }

    public String GetFacultyName() {
        return this.faculty_name;
    }

    public void SetFacultyName(String faculty_name) {
        this.faculty_name = faculty_name;
    }

}
