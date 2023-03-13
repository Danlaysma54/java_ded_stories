package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixServiceTest {
    @Test
    public void SortMatrix() {

        Matrix[] arr = new Matrix[3];
        double[] arr1 = {0, 3, -5, 5, 3, -3, 2, 7, 6, 7, 5, 8, 9, 2, -7, -2};
        double[] arr2 = {3, 5, 6, 8, 4, 6, 7, 8, 2};
        double[] arr3 = {0, 5, 0, 8};
        arr[0] = new Matrix(arr1, 4);
        arr[1] = new Matrix(arr2, 3);
        arr[2] = new Matrix(arr3, 2);
        MatrixService.arrangeMatrices(new MatrixComparator(), arr);
        double[] test = {0, 226, 7104};
        double[] test1 = new double[3];
        for (int i = 0; i < arr.length; i++) {
            test1[i] = arr[i].СalculateDeterminant();
        }
        assertArrayEquals(test, test1, 0.00006);
    }

}
