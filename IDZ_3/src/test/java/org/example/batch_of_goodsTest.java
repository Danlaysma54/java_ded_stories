package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class batch_of_goodsTest {
    private batch_of_goods obj;

    @Before
    public void SetUp() {
        Packed_weight_goods test1 = new Packed_weight_goods(new Product("s", "d"), new Product_Packaging(2, "name"), 2);
        Packed_piece_goods test2 = new Packed_piece_goods(new Product_Packaging(1, "name"), 2, 3, new Product("s", "d"));
        Packaged_goods test3 = new Packaged_goods(new Product("s", "d"), new Product_Packaging(2, "name"),2);
        Packaged_goods[] test_array = new Packaged_goods[3];
        test_array[0] = test1;
        test_array[1] = test2;
        test_array[2] = test3;
        obj = new batch_of_goods("name", test_array);
    }

    @Test
    public void testEquals() {
        Packed_weight_goods test1 = new Packed_weight_goods(new Product("s", "d"), new Product_Packaging(2, "name"), 2);
        Packed_piece_goods test2 = new Packed_piece_goods(new Product_Packaging(1, "name"), 2, 3, new Product("s", "d"));
        Packaged_goods test3 = new Packaged_goods(new Product("d", "d"), new Product_Packaging(2, "name"),2);
        Packaged_goods[] test_array = new Packaged_goods[3];
        test_array[0] = test1;
        test_array[1] = test2;
        test_array[2] = test3;
        batch_of_goods test4 = new batch_of_goods("name", test_array);
        assertFalse(obj.equals(test4));
    }

    @Test
    public void getBatch_description() {
        assertEquals(obj.getBatch_description(), "name");
    }

    @Test
    public void getWeightBrutto() {
        assertEquals(obj.GetWeightBrutto(), 7, 0.00005);
    }

    @Test
    public void testToString() {
        assertEquals(obj.toString(), "name Package name name,Package weight 2.00 gr,Product name s,Product description d,Product weight 2.00 grPackage name name,Package weight 1.00,Product name s,Product description d,Product weight 3.00 kg,Number: 2Name: name,weight: 2.00 gr. s d\n");
    }
}