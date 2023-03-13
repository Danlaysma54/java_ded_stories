package org.example;

import org.example.Methods;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class MethodsTest {
    private Methods obj;

    @Before
    public void setUp() {
        obj = new Methods();
    }

    @Test
    public void TestMultiplyString() {
        String test = new String("ha");
        int n = 3;
        assertEquals("hahaha", obj.repeat_Str(test, n));
    }

    @Test
    public void TestNumbToString() {
        String test = new String("12");
        assertEquals("одиндва", obj.numb_to_string(test));
    }

    @Test
    public void TestConsistNumb() {
        String test = new String("haha");
        String test_2 = new String("ha");
        assertEquals(2, obj.consist_numb(test, test_2));
    }

    @Test
    public void TestDeleteSmth() {
        String test = new String("24");
        StringBuilder test_2 = new StringBuilder("1234");
        assertEquals(test, obj.delete_smth(test_2));
    }

    @Test(expected = IllegalArgumentException.class) // исключение при отрицательном входном значении
    public void TestPositiveString() {
        String test = new String("12");
        obj.repeat_Str(test, -1);
    }

    @Test(expected = IllegalStateException.class) // исключение при нулевой строке
    public void TestNotZeroString() {
        String test = new String();
        String test_1 = new String("1");
        StringBuilder test_2 = new StringBuilder();
        obj.consist_numb(test_1, test);
        obj.numb_to_string(test);
        obj.delete_smth(test_2);
    }

    @Test
    public void TestInvert1() {
        String str_5 = new String(" Привет    Пока  ДД");
        String str_6 = new String(" ДД    Пока  Привет");
        assertEquals(str_6, obj.Invert2(str_5));
    }

    @Test
    public void TestInvert2() {
        String str_5 = new String(" ПриветПокаДД");
        String str_6 = new String(" ПриветПокаДД");
        assertEquals(str_6, obj.Invert2(str_5));
    }

    @Test
    public void TestInvert3() {
        String str_5 = new String(" ПриветПока  ДД  ");
        String str_6 = new String(" ДД  ПриветПока  ");
        assertEquals(str_6, obj.Invert2(str_5));
    }

    @Test
    public void TestInvert4() {
        String str_5 = new String("ПриветПока  ДД  ");
        String str_6 = new String("ДД  ПриветПока  ");
        assertEquals(str_6, obj.Invert2(str_5));
    }

    @Test
    public void TestInvert5() {
        String str_5 = new String(" ПриветПока  ДД  ");
        String str_6 = new String(" ДД  ПриветПока  ");
        assertEquals(str_6, obj.Invert2(str_5));
    }
    @Test
    public void TestConvertor() {
        String str = new String("Васе 0x00000010 лет");
        String str_1 = new String("Васе 16 лет");
        assertEquals(str_1, obj.Convertor(str));
    }
    @Test
    public void TestConvertor2() {
        String str = new String("Васе 0x00000010 0x00000010 лет");
        String str_1 = new String("Васе 16 16 лет");
        assertEquals(str_1, obj.Convertor(str));
    }
}