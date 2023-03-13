package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringServiceTest {
    private StringService obj;

    @Before
    public void setUp() {
        obj = new StringService();
    }

    @Test
    public void numbOfStrEquals_Test() {
        String[] array_test = {"kek", "kekw", "kek", "kekekek", "", null};
        String test = new String("kek");
        assertEquals(2, obj.NumbOfStrEquals(array_test, test));
    }

    @Test
    public void numbOfFirstSymEquals() {
        String[] array_test = {"kek", "kekw", "kek", "kekekek", "mkaw", "mrak"};
        String test = new String("k");
        assertEquals(4, obj.NumbOfFirstSymEquals(array_test, test));
    }

    @Test
    public void thelongestString() {
        String[] array_test = {"kek", "aekd", "kez", "kel", "kaw", "rakz"};
        assertEquals("rakz", obj.ThelongestString(array_test));
    }

    @Test
    public void NoConsistStr(){
        String[] array_test = {"kek", "kekw", "kek", "kekekek", "", null};
        String test = new String("ke");
        assertEquals(2, obj.NumbOfStrEquals(array_test, test));
    }
}