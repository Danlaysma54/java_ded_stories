package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Person("Igor", "Ashaev", "Victorovich", 1971, 7, 25));
        ArrayList<Flat> flats = new ArrayList<>();
        flats.add(new Flat(1, 2, people));
        flats.add(new Flat(2, 4, people));
        flats.add(new Flat(3, 5, people));
        House house = new House("3_14", "Math St. 34", new Person("Igor", "Ashaev", "Victorovich", 1971, 7, 25), flats);
        WriteCSV.WriteHouseInCSV(house);
    }
}