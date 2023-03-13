package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinusFunctionTest {

    private SinusFunction obj;

    @Before
    public void SetUp() {
        obj = new SinusFunction(2, 3, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFail() {
        obj = new SinusFunction(1, 2, 2, 2);
    }


    @Test
    public void testSolution() {
        assertEquals(-0.5588, obj.Solution(2), 0.0006);
    }
}