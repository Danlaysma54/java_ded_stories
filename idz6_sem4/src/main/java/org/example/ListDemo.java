package org.example;

import java.util.*;
import java.util.Comparator;

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
                better_humans.add(new Human(arrhuman));
            }
        }
        return better_humans;
    }

    public ArrayList<Set<Integer>> NotСross(ArrayList<Set<Integer>> collections, Set<Integer> collection) {
        ArrayList<Set<Integer>> not_cross = new ArrayList<>();
        boolean flag = true;
        for (Set<Integer> integers : collections) {
            for (int numb : integers) {
                for (int numbers : collection) {
                    if (numb == numbers) {
                        flag = false;
                        break;
                    }
                }

            }
            if (flag) {
                not_cross.add(integers);
                flag = true;
            }
            flag = true;
        }
        return not_cross;
    }

    public ArrayList<Human> Eldest(ArrayList<? extends Human> humans) {
        ArrayList<Human> eldest = new ArrayList<>();
        eldest.add(new Human());
        for (Human human : humans) {
            if ((human.getAge() >= eldest.get(0).getAge())) {
                if (human.getAge() == eldest.get(0).getAge()) {
                    eldest.add(human);
                } else {
                    eldest.clear();
                    eldest.add(human);
                }
            }
        }
        return eldest;
    }

    public ArrayList<Human> Sort(ArrayList<Human> humans) {
        humans.sort(new ComparatorPersonsDemo());
        return humans;
    }
    public Set<Human>  Coincidence(Map<Integer,Human> map,Set<Integer> collection){
        return
    }
}

