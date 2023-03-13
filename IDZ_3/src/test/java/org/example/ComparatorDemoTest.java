package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorDemoTest {

    @Test
    public void sortGoods() {
        Product[] arr = new Product[3];
        arr[0] = new Product("123", "Maksim");
        arr[1] = new Product("321", "Maksim");
        arr[2] = new Product("Test3", "Maksim");
        ComparatorDemo.sortGoods(new ProductComparator(), arr);
        String[] test = new String[3];
        test[0] = "123 Maksim";
        test[1] = "321 Maksim";
        test[2] = "Test3 Maksim";
        String[] test1 = new String[3];
        for (int i = 0; i < arr.length; i++) {
            test1[i] = arr[i].toString();
        }
        assertArrayEquals(test, test1);
    }
    @Test
    public void sortGoods2() {
        Product[] arr = new Product[3];
        arr[0] = new Product("Test2", "Maksim");
        arr[1] = new Product("Test", "Maksim1");
        arr[2] = new Product("Test", "Maksim");
        ComparatorDemo.sortGoods(new ProductComparator(), arr);
        String[] test = new String[3];
        test[0] = "Test Maksim";
        test[1] = "Test Maksim1";
        test[2] = "Test2 Maksim";
        String[] test1 = new String[3];
        for (int i = 0; i < arr.length; i++) {
            test1[i] = arr[i].toString();
        }
        assertArrayEquals(test, test1);
    }
    @Test
    public void sortGoods3() {
        Product[] arr = new Product[3];
        arr[0] = new Weight_Goods(new Product("Test2", "Maksim"));
        arr[1] = new Weight_Goods(new Product("Test", "Maksim1"));
        arr[2] = new Weight_Goods(new Product("Test", "Maksim"));
        ComparatorDemo.sortGoods(new ProductComparator(), arr);
        String[] test = new String[3];
        test[0] = "Test Maksim";
        test[1] = "Test Maksim1";
        test[2] = "Test2 Maksim";
        String[] test1 = new String[3];
        for (int i = 0; i < arr.length; i++) {
            test1[i] = arr[i].toString();
        }
        assertArrayEquals(test, test1);
    }
    @Test
    public void sortGoods4() {
        Product[] arr = new Product[3];
        arr[0] = new Piece_Goods(2,"Test2", "Maksim");
        arr[1] = new Piece_Goods(2,"Test", "Maksim1");
        arr[2] = new Piece_Goods(3,"Test", "Maksim");
        ComparatorDemo.sortGoods(new ProductComparator(), arr);
        String[] test = new String[3];
        test[0] = "Product name Test,Product description Maksim,weight 3,00";
        test[1] = "Product name Test,Product description Maksim1,weight 2,00";
        test[2] = "Product name Test2,Product description Maksim,weight 2,00";
        String[] test1 = new String[3];
        for (int i = 0; i < arr.length; i++) {
            test1[i] = arr[i].toString();
        }
        assertArrayEquals(test, test1);
    }
}