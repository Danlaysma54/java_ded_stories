package org.example;

public class Student extends Human {
    String university;
    String faculty;
    String speciality;

    Student(Human human, String input_university, String input_faculty, String input_speciality) {
        super(human.getSurname(), human.getName(), human.getAge(), human.getSex());
        this.university = input_university;
        this.faculty = input_faculty;
        this.speciality = input_speciality;
    }
    Student(){
        super();
        this.university="Omsu";
        this.faculty="IMIT";
        this.speciality="Programmer";
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
