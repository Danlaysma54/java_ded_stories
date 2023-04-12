package org.example;

import java.io.Externalizable;
import java.io.Serializable;
import java.util.ArrayList;

public class Flat implements Serializable {
    private int number;
    private int square;
    private ArrayList<Person> people = new ArrayList<>();

    public Flat(int number, int square, ArrayList<Person> people) {
        this.number = number;
        this.square = square;
        this.people.addAll(people);
    }

    public Flat() {
        this.number = 1;
        this.square = 60;
        this.people.add(new Person());
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public int getNumber() {
        return number;
    }

    public int getSquare() {
        return square;
    }

    public boolean equals(Flat flat) {
        if (this.number != flat.getNumber() || this.square != flat.getSquare() || this.people.size() != flat.getPeople().size())
            return false;
        for (int i = 0; i < flat.getPeople().size(); i++) {
            if (!this.getPeople().get(i).equals(flat.getPeople().get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash;
        hash = this.number + this.square;
        for (Person person : this.people) {
            hash += person.hashCode();
        }
        return hash;
    }
}
