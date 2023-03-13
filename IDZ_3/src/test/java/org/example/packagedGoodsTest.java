package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class packagedGoodsTest {
    private Packaged_goods obj;

    @Before
    public void SetUp() {
         obj = new Packaged_goods(new Product("s", "d"), new Product_Packaging(2, "name"),3);
    }

    @Test
    public void getProductPackaging() {
        Product_Packaging test = new Product_Packaging(2, "name");
        assertTrue(obj.GetProductPackaging().equals(test));
    }

    @Test
    public void testEquals() {
        Packaged_goods test = new Packaged_goods(new Product("s", "d"), new Product_Packaging(2, "name"),3);
        assertTrue(obj.equals(test));
    }

    @Test
    public void testToString() {
        assertEquals(obj.toString(), "Name: name,weight: 2.00 gr. s d\n");
    }
}