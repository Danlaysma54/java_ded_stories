package org.example;

import org.junit.Test;

import static org.example.Product_service.CountByFilter;

import static org.junit.Assert.*;

public class Product_serviceTest {

    @Test
    public void countByFilterDeep() {
        Packed_weight_goods test1 = new Packed_weight_goods(new Product("s", "d"), new Product_Packaging(2, "name"), 2);
        Packed_piece_goods test2 = new Packed_piece_goods(new Product_Packaging(1, "name"), 2, 3, new Product("s", "d"));
        Packaged_goods test3 = new Packaged_goods(new Product("d", "d"), new Product_Packaging(2, "name"), 2);
        Packaged_goods[] test_array = new Packaged_goods[3];
        test_array[0] = test1;
        test_array[1] = test2;
        test_array[2] = test3;
        batch_of_goods test4 = new batch_of_goods("name", test_array);
        assertEquals(CountByFilter(test4, "s"), 2);
    }


}