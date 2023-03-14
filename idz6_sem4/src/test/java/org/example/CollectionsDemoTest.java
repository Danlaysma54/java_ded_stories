package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionsDemoTest {
    private CollectionsDemo collectionsDemo;

    @Before
    public void Setup() {
        collectionsDemo = new CollectionsDemo();
    }

    @Test
    public void Test1() {
        ArrayList<String> test = new ArrayList<>();
        String ch = "Ге";
        test.add("Герхард");
        test.add("Г2рхард");
        test.add("Керхард1");
        test.add("Мерхард2");
        test.add("Верхард3");
        test.add("Церхард");
        test.add("Дерхард");
        test.add("Рерхард");
        Assert.assertEquals( 1,collectionsDemo.NumbOfStrings(test, ch));

    }
    @Test
    public void Test2() {
        ArrayList<String> test = new ArrayList<>();
        String ch = "Ге";
        test.add("Герхард");
        test.add("Г2рхард");
        test.add("Герхард");
        test.add("Мерхард2");
        test.add("Верхард3");
        test.add("Герхард");
        test.add("Дерхард");
        test.add("Рерхард");
        Assert.assertEquals( 3,collectionsDemo.NumbOfStrings(test, ch));

    }
    @Test
    public void Test3() {
        ArrayList<String> test = new ArrayList<>();
        String ch = "1";
        test.add("Герхард");
        test.add("Г2рхард");
        test.add("Герхард");
        test.add("Мерхард2");
        test.add("Верхард3");
        test.add("Герхард");
        test.add("Дерхард");
        test.add("Рерхард");
        Assert.assertEquals( 0,collectionsDemo.NumbOfStrings(test, ch));

    }
}
