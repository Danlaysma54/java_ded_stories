package org.example;

public class ComparatorPersonsDemo implements Comparator<Human>{

    @Override
    public int compare(Human a, Human b) {
        return (a.getSurname() + a.getName() + a.getPatronymic()).compareTo(b.getSurname() + b.getName() + b.getPatronymic());
    }
}
