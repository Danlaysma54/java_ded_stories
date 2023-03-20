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

    public Set<Human> Coincidence(Map<Integer, Human> map, Set<Integer> collection) {
        Set<Human> humans = new HashSet<>();
        for (int numb : collection) {
            if (map.get(numb) != null)
                humans.add(map.get(numb));
        }
        return humans;
    }

    public ArrayList<Integer> Over18(Map<Integer, Human> map) {
        ArrayList<Integer> over18 = new ArrayList<>();
        for (Map.Entry<Integer, Human> entry : map.entrySet()) {
            if (entry.getValue().getAge() >= 18) {
                over18.add(entry.getKey());
            }
        }
        return over18;
    }

    public Map<Integer, Integer> NewMapAge(Map<Integer, Human> map) {
        Map<Integer, Integer> new_map = new HashMap<>();
        for (int numb : map.keySet()) {
            new_map.put(numb, map.get(numb).getAge());
        }
        return new_map;
    }


    public Map<Integer, ArrayList<Human>> NewMap(Set<Human> humans) {
        Map<Integer, ArrayList<Human>> new_map = new HashMap<>();
        for (Human human : humans) {
            if (new_map.get(human.getAge()) == null) {
                new_map.put(human.getAge(), new ArrayList<>());
                new_map.get(human.getAge()).add(human);
            } else {
                new_map.get(human.getAge()).add(human);
            }
        }
        return new_map;
    }


    public Map<Integer, Map<Character, ArrayList<Human>>> MapInMap(Set<Human> humans) {
        ListDemo listDemo = new ListDemo();
        Map<Integer, ArrayList<Human>> map = new HashMap<>();
        Map<Integer, Map<Character, ArrayList<Human>>> map_in_map = new HashMap<>();
        map = new HashMap<>(listDemo.NewMap(humans));
        for (int numbs : map.keySet()) {
            for (int i = 0; i < map.get(numbs).size(); i++) {
                if (map_in_map.get(numbs) == null) {
                    map_in_map.put(numbs, new HashMap<>());
                    map_in_map.get(numbs).put(map.get(numbs).get(i).getSurname().charAt(0), new ArrayList<>(Arrays.asList(map.get(numbs).get(i))));
                } else {
                    if (map_in_map.get(numbs).get(map.get(numbs).get(i).getSurname().charAt(0)) == null) {
                        map_in_map.get(numbs).put(map.get(numbs).get(i).getSurname().charAt(0), new ArrayList<>(Arrays.asList(map.get(numbs).get(i))));
                    } else {
                        map_in_map.get(numbs).get(map.get(numbs).get(i).getSurname().charAt(0)).add(map.get(numbs).get(i));
                    }

                }
            }
        }
        return map_in_map;
    }


}

