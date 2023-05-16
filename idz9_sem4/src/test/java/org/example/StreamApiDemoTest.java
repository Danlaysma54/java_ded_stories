package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamApiDemoTest {
    @Test
    public void Test_1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        assertArrayEquals(list1.toArray(), StreamApiDemo.not_null.apply(list.stream()));
    }

}