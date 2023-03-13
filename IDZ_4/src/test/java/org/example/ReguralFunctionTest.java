package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ReguralFunctionTest {
    private ReguralFunction obj;
    @Before
    public void SetUp(){
        obj= new ReguralFunction(2,3,1,3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConstructFail(){
        obj = new ReguralFunction(1,2,2,2);
    }
@Test
    public void testSolution() {
        assertEquals(7,obj.Solution(2),0.0006);
    }
}