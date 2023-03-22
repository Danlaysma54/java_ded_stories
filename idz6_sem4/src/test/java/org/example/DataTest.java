package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class DataTest {
    private Data data;


    @Test
    public void dataIteratorTest0() {
        var data = new Data("data", new Group(0, 1, 2, 3), new Group(1), new Group(2),
                new Group(3, 4, 5, 6, 7, 8),
                new Group(4, 9, 10, 11, 12, 13, 14),
                new Group(5, 15, 16));
        int i = 0;
        int[] groupArr = new int[16];
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        for (Integer datum : data) {
            groupArr[i] = datum;
            i++;
        }
        Assert.assertArrayEquals(result, groupArr);
    }

    /*  @Test
      public void getAllTest0() {
          var data = new Data("data", new Group(-2), new Group(-1), new Group(0, 0, 1, 2),
                  new Group(1, 3, 4, 5, 6), new Group(2),
                  new Group(3), new Group(4, 7, 8, 9), new Group(5), new Group(6));

          ArrayList<Integer> result = new ArrayList<>();
          Collections.addAll(result, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
          Assert.assertArrayEquals(result.toArray(), getAll(data).toArray());
      } */
    @Test
    public void dataIteratorTest1() {
        var data = new Data("data", new Group(1), new Group(2), new Group(0, 1, 2, 3),
                new Group(3, 4, 5, 6, 7, 8),
                new Group(4, 9, 10, 11, 12, 13, 14),
                new Group(5, 15, 16));
        int i = 0;
        int[] groupArr = new int[16];
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        for (Integer datum : data) {
            groupArr[i] = datum;
            i++;
        }
        Assert.assertArrayEquals(result, groupArr);
    }

    @Test
    public void dataIteratorTest2() {
        var data = new Data("data", new Group(0, 1, 2, 3),
                new Group(3, 4, 5, 6, 7, 8),
                new Group(4, 9, 10, 11, 12, 13, 14),
                new Group(5, 15, 16), new Group(1), new Group(2));
        int i = 0;
        int[] groupArr = new int[16];
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        for (Integer datum : data) {
            groupArr[i] = datum;
            i++;
        }
        Assert.assertArrayEquals(result, groupArr);
    }
}