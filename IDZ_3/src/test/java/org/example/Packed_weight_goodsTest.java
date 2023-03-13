package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Packed_weight_goodsTest {
    Packed_weight_goods obj;
    @Before
    public void SetUp() {
        obj = new Packed_weight_goods(new Product("s", "d"), new Product_Packaging(2, "name"), 2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void Packed_weight_goodsConstructTest(){
        obj = new Packed_weight_goods(new Product("s", "d"), new Product_Packaging(2, "name"), -22);
    }

    @Test
    public void getWeightNetto() {
        assertEquals(obj.GetWeightNetto(), 2, 0.00005);
    }

    @Test
    public void getWeightBrutto() {
        assertEquals(obj.GetWeightBrutto(), 4, 0.00005);
    }

    @Test
    public void getWeightProduct() {
        assertEquals(obj.GetWeightProduct(), 2, 0.000005);
    }

    @Test
    public void testEquals() {
        Packed_weight_goods test = new Packed_weight_goods(new Product("s", "d"), new Product_Packaging(2, "name"), 2);
        assertTrue(obj.equals(test));
    }

    @Test
    public void testToString() {
        assertEquals(obj.toString(),"Package name name,Package weight 2.00 gr,Product name s,Product description d,Product weight 2.00 gr");
    }
}