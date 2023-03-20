package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import org.junit.Assert;

public class ListDemoTest {
    private ListDemo listDemo;

    @Before
    public void SetUp() {
        this.listDemo = new ListDemo();
    }

    @Test
    public void SurnameTest() {
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 20);
        Human test1 = new Human("Lyasman1", "Daniil", "Vitalievich", 20);
        Human test2 = new Human("Lyasman2", "Daniil", "Vitalievich", 20);
        Human test3 = new Human("Lyasman", "Mark", "Vitalievich", 20);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(test);
        humans.add(test1);
        humans.add(test2);
        humans.add(test3);
        ArrayList<Human> humans_test = new ArrayList<>();
        humans_test.add(test);
        humans_test.add(test3);
        Assert.assertEquals(humans_test, listDemo.SameSurname(humans, test));
    }

    @Test
    public void EraseHumanTest() {
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 20);
        Human test1 = new Human("Lyasman1", "Daniil", "Vitalievich", 20);
        Human test2 = new Human("Lyasman2", "Daniil", "Vitalievich", 20);
        Human test3 = new Human("Lyasman", "Mark", "Vitalievich", 20);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(test);
        humans.add(test1);
        humans.add(test2);
        humans.add(test3);
        ArrayList<Integer> humans_test = new ArrayList<>();
        humans_test.add(test.hashCode());
        humans_test.add(test1.hashCode());
        humans_test.add(test3.hashCode());
        ArrayList<Human> humans_out = listDemo.EraseHuman(humans, test2);
        ArrayList<Integer> humans_out_test = new ArrayList<>();
        humans_out_test.add(humans_out.get(0).hashCode());
        humans_out_test.add(humans_out.get(1).hashCode());
        humans_out_test.add(humans_out.get(2).hashCode());
        Assert.assertEquals(humans_test, humans_out_test);
    }

    @Test
    public void NotCrossTest() {
        ArrayList<Set<Integer>> collections = new ArrayList<>();
        Set<Integer> test = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> test1 = new HashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> test2 = new HashSet<>(Arrays.asList(2, 7, 9));
        Set<Integer> test3 = new HashSet<>(Arrays.asList(11, 3, 2));
        collections.add(test);
        collections.add(test1);
        collections.add(test2);
        ArrayList<Set<Integer>> collections_test = new ArrayList<>();
        collections_test.add(test1);
        Assert.assertEquals(collections_test, listDemo.NotСross(collections, test3));
    }

    @Test
    public void EldestTest() {
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 20);
        Human test1 = new Human("Lyasman1", "Daniil", "Vitalievich", 21);
        Human test2 = new Human("Lyasman2", "Daniil", "Vitalievich", 20);
        Student test3 = new Student("D", "Lyasman", "Mark", "Vitalievich", 21);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(test);
        humans.add(test1);
        humans.add(test2);
        humans.add(test3);
        ArrayList<Integer> humans_test = new ArrayList<>();
        humans_test.add(test1.hashCode());
        humans_test.add(test3.hashCode());
        ArrayList<Human> humans_out = listDemo.Eldest(humans);
        ArrayList<Integer> humans_out_test = new ArrayList<>();
        humans_out_test.add(humans_out.get(0).hashCode());
        humans_out_test.add(humans_out.get(1).hashCode());
        Assert.assertEquals(humans_test, humans_out_test);
    }

    @Test
    public void SortTest() {
        Human test = new Human("Ayasman", "Daniil", "Vitalievich", 20);
        Human test1 = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        Human test2 = new Human("Byasman", "Daniil", "Vitalievich", 20);
        Human test3 = new Human("Baasman", "Daniil", "Vitalievich", 20);
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(test);
        humans.add(test2);
        humans.add(test1);
        humans.add(test3);
        ArrayList<Integer> humans_test = new ArrayList<>();
        humans_test.add(test.hashCode());
        humans_test.add(test3.hashCode());
        humans_test.add(test2.hashCode());
        humans_test.add(test1.hashCode());
        ArrayList<Human> humans_out = listDemo.Sort(humans);
        ArrayList<Integer> humans_out_test = new ArrayList<>();
        humans_out_test.add(humans_out.get(0).hashCode());
        humans_out_test.add(humans_out.get(1).hashCode());
        humans_out_test.add(humans_out.get(2).hashCode());
        humans_out_test.add(humans_out.get(3).hashCode());
        Assert.assertEquals(humans_test, humans_out_test);
    }

    @Test
    public void CoincidenceTest() {
        Map<Integer, Human> map = new HashMap<>();
        Set<Integer> numbers = new HashSet<>(Arrays.asList(2, 4));
        Human test = new Human("Ayasman", "Daniil", "Vitalievich", 20);
        Human test1 = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        Human test2 = new Human("Byasman", "Daniil", "Vitalievich", 20);
        Human test3 = new Human("Baasman", "Daniil", "Vitalievich", 20);
        map.put(1, test);
        map.put(2, test1);
        map.put(3, test2);
        map.put(4, test3);
        Set<Human> humans = new HashSet<>();
        humans.add(test1);
        humans.add(test3);
        Assert.assertArrayEquals(humans.toArray(), listDemo.Coincidence(map, numbers).toArray());
    }

    @Test
    public void Over18Test() {
        Map<Integer, Human> map = new HashMap<>();
        Set<Integer> numbers = new HashSet<>(Arrays.asList(2, 4));
        Human test = new Human("Ayasman", "Daniil", "Vitalievich", 17);
        Human test1 = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        Human test2 = new Human("Byasman", "Daniil", "Vitalievich", 15);
        Human test3 = new Human("Baasman", "Daniil", "Vitalievich", 20);
        map.put(1, test);
        map.put(2, test1);
        map.put(3, test2);
        map.put(4, test3);
        Assert.assertArrayEquals(numbers.toArray(), listDemo.Over18(map).toArray());
    }

    @Test
    public void newMapAgeTest() {
        Human test = new Human("Ayasman", "Daniil", "Vitalievich", 17);
        Human test1 = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        Human test2 = new Human("Byasman", "Daniil", "Vitalievich", 15);
        Human test3 = new Human("Baasman", "Daniil", "Vitalievich", 20);
        Map<Integer, Human> new_map = new HashMap<>();
        Map<Integer, Integer> test_map = new HashMap<>();
        new_map.put(1, test);
        new_map.put(2, test1);
        new_map.put(3, test2);
        new_map.put(4, test3);
        test_map.put(1, 17);
        test_map.put(2, 21);
        test_map.put(3, 15);
        test_map.put(4, 20);
        Assert.assertEquals(test_map, listDemo.NewMapAge(new_map));
    }

    @Test
    public void NewMapTest() {
        Set<Human> map = new HashSet<>();
        Set<Integer> numbers = new HashSet<>(Arrays.asList(2, 4));
        Human test = new Human("Ayasman", "Daniil", "Vitalievich", 17);
        Human test1 = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        Human test2 = new Human("Byasman", "Daniil", "Vitalievich", 15);
        Human test3 = new Human("Baasman", "Daniil", "Vitalievich", 20);
        map.add(test);
        map.add(test1);
        map.add(test2);
        map.add(test3);
        Map<Integer, ArrayList<Human>> new_map = new HashMap<>();
        new_map.put(17, new ArrayList<>(List.of(test)));
        new_map.put(21, new ArrayList<>(List.of(test1)));
        new_map.put(15, new ArrayList<>(List.of(test2)));
        new_map.put(20, new ArrayList<>(List.of(test3)));
        Assert.assertEquals(new_map, listDemo.NewMap(map));
    }

    @Test
    public void MapInMapTest() {
        Set<Human> map = new HashSet<>();
        Human test = new Human("Ayasman", "Daniil", "Vitalievich", 17);
        Human test1 = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        Human test2 = new Human("Byasman", "Daniil", "Vitalievich", 15);
        Human test3 = new Human("Baasman", "Daniil", "Vitalievich", 20);
        Human test4 = new Human("Saasman", "Daniil", "Vitalievich", 20);
        Human test5 = new Human("Saasman", "Mark", "Vitalievich", 20);
        Human test6 = new Human("Baasman", "Mark", "Vitalievich", 20);
        map.add(test);
        map.add(test1);
        map.add(test2);
        map.add(test3);
        map.add(test4);
        map.add(test5);
        map.add(test6);
        Map<Integer, Map<Character, ArrayList<Human>>> map_test = new HashMap<>();
        map_test.put(17, new HashMap<>());
        map_test.get(17).put('A', new ArrayList<>());
        map_test.get(17).get('A').add(test);
        map_test.put(21, new HashMap<>());
        map_test.get(21).put('L', new ArrayList<>());
        map_test.get(21).get('L').add(test1);
        map_test.put(15, new HashMap<>());
        map_test.get(15).put('B', new ArrayList<>());
        map_test.get(15).get('B').add(test2);
        map_test.put(20, new HashMap<>());
        map_test.get(20).put('B', new ArrayList<>());
        map_test.get(20).get('B').add(test6);
        map_test.get(20).put('S', new ArrayList<>());
        map_test.get(20).get('S').add(test4);
        map_test.get(20).get('S').add(test5);
        map_test.get(20).get('B').add(test3);
        Assert.assertEquals(map_test, listDemo.MapInMap(map));
    }
}