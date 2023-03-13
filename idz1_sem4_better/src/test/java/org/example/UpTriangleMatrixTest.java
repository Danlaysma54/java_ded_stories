package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpTriangleMatrixTest {
    private UpTriangleMatrix obj;

    private UpTriangleMatrix obj1;

    private UpTriangleMatrix obj2;

    @Before
    public void SetUp() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        this.obj = new UpTriangleMatrix(arr, 4);
        double[] arr1 = {1, 2, 3, 4, 5, 6};
        this.obj1 = new UpTriangleMatrix(arr1, 3);
        double[] arr2 = {1, 3, 5};
        this.obj2 = new UpTriangleMatrix(arr2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ChangeElemTest() {
        obj.ChangeElem(3, 2, 3);
    }

    @Test
    public void ChangeElemTest1() {
        obj.ChangeElem(1, 1, 3);
        obj.GetElem(1, 1);
        assertEquals(3, obj.GetElem(1, 1),0.00005);
    }

    @Test
    public void сalculateDeterminant0() {
        assertEquals(400, obj.СalculateDeterminant(), 0.000006);
    }

    @Test
    public void calculateDeterminant1() {
        this.obj.ChangeElem(0, 0, 0);
        assertEquals(0, this.obj.СalculateDeterminant(), 0.000005);
    }

    @Test
    public void calculateDeterminant2() {
        assertEquals(24, this.obj1.СalculateDeterminant(), 0.00006);
    }

    @Test
    public void calculateDeterminant3() {
        assertEquals(5, this.obj2.СalculateDeterminant(), 0.0000006);
    }

}