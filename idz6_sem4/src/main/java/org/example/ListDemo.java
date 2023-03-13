package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ListDemo {
    public ArrayList<Human> SameSurname(ArrayList<Human> humans, Human human) {
        ArrayList<Human> same_surname = new ArrayList<>();
        for (int i = 0; i < humans.size(); i++) {
            if (human.getSurname().equals(humans.get(i).getSurname())) {
                same_surname.add(humans.get(i));
            }
        }
        return same_surname;
    }

    public ArrayList<Human> EraseHuman(ArrayList<Human> humans, Human human) {
        ArrayList<Human> better_humans = new ArrayList<>();
        for (Human arrhuman : humans) {
            if (!arrhuman.equals(human)) {
                better_humans.add(arrhuman);
            }
        }
        return better_humans;
    }

    public ArrayList<ArrayList<Integer>> NotСross(ArrayList<ArrayList<Integer>> collections, ArrayList<Integer> collection) {
        for (int i = 0; i < collections.size(); i++) {
            for (int j = 0; j < collections.get(i).size(); j++) {
                if (collections.get(i).get(j) != collection.get(i)) ;
            }
        }
        return collections;
    }
}
