package org.example;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExponentTest {
    private Exponent obj;

    @Before
    public void SetUp() {
        obj = new Exponent(2, 3, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFail() {
        obj = new Exponent(1, 2, 2, 2);
    }

    @Test
    public void testSolution() {
        assertEquals(17.77811, obj.Solution(2), 0.0006);
    }

}