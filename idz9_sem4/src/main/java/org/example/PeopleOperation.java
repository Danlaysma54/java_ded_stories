package org.example;

public interface PeopleOperation<T extends Human> {
    Boolean apply(T a,T b,T с,int d);
}
