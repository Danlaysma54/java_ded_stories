package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    private Matrix obj;

    private Matrix obj1;

    private Matrix obj2;

    @Before
    public void SetUp() {
        double[] arr = {0, 3, -5, 5, 3, -3, 2, 7, 6, 7, 5, 8, 9, 2, -7, -2};
        this.obj = new Matrix(arr, 4);
        double[] arr1 = {3, 5, 6, 8, 4, 6, 7, 8, 2};
        this.obj1 = new Matrix(arr1, 3);
        double[] arr2 = {0, 5, 0, 8};
        this.obj2 = new Matrix(arr2, 2);
    }

    @Test
    public void changeElem() {
        this.obj.ChangeElem(0, 0, 1);
        assertEquals(1, this.obj.GetElem(0, 0), 0.00006);
    }

    @Test
    public void сalculateDeterminant0() {
        assertEquals(7104, obj.СalculateDeterminant(), 0.000006);
    }

    @Test
    public void calculateDeterminant1() {
        this.obj.ChangeElem(0, 0, 9);
        assertEquals(2685, this.obj.СalculateDeterminant(), 0.000005);
    }

    @Test
    public void calculateDeterminant2() {
        assertEquals(226, this.obj1.СalculateDeterminant(), 0.00006);
    }

    @Test
    public void calculateDeterminant3() {
        assertEquals(0, this.obj2.СalculateDeterminant(), 0.0000006);
    }

    @Test
    public void getElem() {
        assertEquals(0, obj2.GetElem(0, 0), 0.0006);
    }

    @Test
    public void FlagTest() {
        obj.СalculateDeterminant();
        assertEquals(true, obj.getFlag());
    }

    @Test
    public void FlagTest2() {
        System.out.println(obj.СalculateDeterminant());
        obj.ChangeElem(0, 0, 1);
        assertEquals(false, obj.getFlag());
    }

}