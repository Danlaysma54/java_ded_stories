package org.example;

import java.util.ArrayList;

public class DataDemo {
    public static ArrayList<Integer> getAll(Data data) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int numbs : data) {
            arrayList.add(numbs);
        }
        return arrayList;
    }
}
