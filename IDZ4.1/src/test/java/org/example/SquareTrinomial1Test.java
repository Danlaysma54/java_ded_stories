package org.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SquareTrinomial1Test{
    private SquareTrinomial1 obj;

    @Before
    public void SetUp() {
        QuadraticTrinomial test = new QuadraticTrinomial(1, 4, 4);
        obj = new SquareTrinomial1(test);
    }

    @Test
    public void testMaxRoot() {
        assertEquals(-2, obj.MaxRoot(), 0.005);
    }
}