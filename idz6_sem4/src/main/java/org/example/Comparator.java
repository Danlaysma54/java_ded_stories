package org.example;

public interface Comparator<T extends Human>  extends java.util.Comparator<T> {
    int compare(T a, T b);
}
