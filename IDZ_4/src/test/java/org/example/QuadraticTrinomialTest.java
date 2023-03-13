package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticTrinomialTest {
    QuadraticTrinomial obj;

    @Before
    public void SetUp() {
        obj = new QuadraticTrinomial(1, 4, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ConstructDescriminantTest() {
        obj = new QuadraticTrinomial(2, 1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ConstructAZero() {
        obj = new QuadraticTrinomial(0, 1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ConstructBZero() {
        obj = new QuadraticTrinomial(2, 0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ConstructCZero() {
        obj = new QuadraticTrinomial(2, 3, 0);
    }

    @Test
    public void Equation_solutionTest() {
        double[] arr = new double[2];
        arr[0] = -2;
        arr[1] = -2;
        assertArrayEquals(arr, obj.Equation_solution(), 0.0005);
    }
}