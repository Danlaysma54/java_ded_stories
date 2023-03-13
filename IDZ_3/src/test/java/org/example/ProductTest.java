package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    private Product obj;

    @Before
    public void SetUp() {
        obj = new Product("Test", "Maksim");
    }

    @Test(expected = NullPointerException.class)
    public void Product_PackagingTestNull() {
        obj = new Product("d", null);
    }

    @Test(expected = NullPointerException.class)
    public void Product_PackagingTestNull2() {
        obj = new Product(null, "2");
    }

    @Test
    public void getProductName() {
        assertEquals("Test", obj.GetProductName());
    }

    @Test
    public void getProductDescription() {
        assertEquals("Maksim", obj.GetProductDescription());
    }

    @Test
    public void setProductName() {
        obj.SetProductName("t");
        assertEquals("t", obj.GetProductName());
    }

    @Test
    public void setProductDescription() {
        obj.SetProductDescription("t");
        assertEquals("t", obj.GetProductDescription());
    }

    @Test
    public void testEquals() {
        Product test = new Product("2", "4");
        assertFalse(obj.equals(test));
    }
}