package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReflectionDemoTest {
    @Test
    public void NumberOfHumanTest() {
        Students student = new Students();
        Human human = new Human();
        Children child = new Children();
        Someone someone = new Someone();
        ArrayList<Object> humans = new ArrayList<>(List.of(student, human, child, someone));
        assertEquals(3, ReflectionDemo.NumbofHumans(humans));
    }

    @Test
    public void PublicMethodsTest() {
        ArrayList<String> strings = new ArrayList<>(List.of("getA", "getB", "setA", "setB", "equals", "toString", "hashCode", "getClass", "notify", "notifyAll", "wait", "wait", "wait"));
        assertArrayEquals(strings.toArray(), ReflectionDemo.PublicMethods(new Human()).toArray());
    }

    @Test
    public void GetAllSuperClassesTest() {
        ArrayList<String> str = new ArrayList<>(List.of("Students", "Human", "Object"));
        assertArrayEquals(str.toArray(), ReflectionDemo.GetAllSuperClasses(Children.class).toArray());
    }

    @Test
    public void GetAllExecutableObject() {
        Students student = new Students();
        Human human = new Human();
        Children child = new Children();
        Someone someone = new Someone();
        ArrayList<Object> humans = new ArrayList<>(List.of(student, human, child, someone));
        assertEquals(1, ReflectionDemo.GetAllExecutableObject(humans));
    }

    @Test
    public void GetAllGettetsAndSetters() {
        ArrayList<String> strings = new ArrayList<>(List.of("getA", "getB", "setA", "setB","getClass"));
        assertArrayEquals(strings.toArray(), ReflectionDemo.GetAllGettetsAndSetters(new Human()).toArray());
    }
}