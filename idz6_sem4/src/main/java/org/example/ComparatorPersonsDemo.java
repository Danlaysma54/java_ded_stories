package org.example;

public class ComparatorPersonsDemo<T extends Human> implements Comparator<T>{

    @Override
    public int compare(T a,T b) {
        return (a.getSurname() + a.getName() + a.getPatronymic()).compareTo(b.getSurname() + b.getName() + b.getPatronymic());
    }
}
