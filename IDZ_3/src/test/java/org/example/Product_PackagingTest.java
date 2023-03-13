package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Product_PackagingTest {
    private Product_Packaging obj;

    @Before
    public void SetUp() {
        obj = new Product_Packaging(1, "Name");
    }

    @Test
    public void Product_PackagingTest0() {
        assertEquals(1, obj.GetPackageWeight(), 0.0005);
    }

    @Test
    public void Product_PackagingTest1() {
        assertEquals("Name", obj.GetPackageName());
    }

    @Test(expected = NullPointerException.class)
    public void Product_PackagingTestNull() {
        obj = new Product_Packaging(2, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Product_PackagingNullOrLessWeight() {
        obj = new Product_Packaging(0, "k");
    }

    @Test
    public void setPackageWeight() {
        obj.SetPackageWeight(0.25);
        assertEquals(0.25, obj.GetPackageWeight(), 0.005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPackageWeightNegOr0() {
        obj.SetPackageWeight(-1);
    }

    @Test
    public void setPackageName() {
        String str = new String("l");
        obj.SetPackageName("l");
        assertEquals(str, obj.GetPackageName());
    }

    @Test(expected = NullPointerException.class)
    public void setPackageNameNull() {
        obj.SetPackageName(null);
    }

    @Test
    public void testEquals() {
        Product_Packaging test = new Product_Packaging(1, "Name");
        assertTrue(obj.equals(test));
    }

    @Test
    public void testToString() {
        assertEquals("Name: Name,weight: 1.00 gr.", obj.toString());
    }
}