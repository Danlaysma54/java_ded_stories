package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Piece_GoodsTest {
    private Piece_Goods obj;

    @Before
    public void SetUp() {
        obj = new Piece_Goods(2, "s", "d");
    }

    @Test(expected = IllegalArgumentException.class)
    public void Piece_GoodTest() {
        obj = new Piece_Goods(-22, "s", "d");
    }

    @Test
    public void getWeight() {
        assertEquals(2, obj.GetWeight(), 0.000005);
    }

    @Test
    public void testEquals() {
        Piece_Goods test = new Piece_Goods(2, "s", "d");
        assertTrue(obj.equals(test));
    }

    @Test
    public void testToString() {
        assertEquals(obj.toString(), "Product name s,Product description d,weight 2.00");
    }
}