package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Packed_piece_goodsTest {
    Packed_piece_goods obj;

    @Before
    public void SetUp() {
        obj = new Packed_piece_goods(new Product_Packaging(1, "name"), 2, 3, new Product("s", "d"));
    }

    @Test
    public void getNumbOfGoods() {
        assertEquals(obj.GetNumbOfGoods(), 2);
    }

    @Test
    public void getWeight() {
        assertEquals(obj.GetWeight(), 3, 0.005);
    }

    @Test
    public void getWeightNetto() {
        assertEquals(obj.GetWeightNetto(),6,0.005);
    }

    @Test
    public void getWeightBrutto() {
        assertEquals(obj.GetWeightBrutto(),7,0.0005);
    }

    @Test
    public void testEquals() {
        Packed_piece_goods test =new Packed_piece_goods(new Product_Packaging(2, "name"), 2, 3, new Product("s", "d"));
        assertFalse(obj.equals(test));
    }

    @Test
    public void testToString() {
        assertEquals(obj.toString(),"Package name name,Package weight 1.00,Product name s,Product description d,Product weight 3.00 kg,Number: 2");
    }
}