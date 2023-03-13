package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    private Fraction obj;

    @Before
    public void SetUp() {
        obj = new Fraction(2, 3, 1, 3, 2, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFail() {
        obj = new Fraction(1, 2, 2, 2, 3, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFail1() {
        obj = new Fraction(1, 2, 0, 0, 3, 3);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSolutionFail1() {
        obj.Solution(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolutionfail() {
        obj = new Fraction(2, 3, 1, 0, 2, 4);
        obj.Solution(0);
    }
@Test
    public void testSolution() {
        assertEquals(1.5, obj.Solution(3), 0.0005);
    }
}