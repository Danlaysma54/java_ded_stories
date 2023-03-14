package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import org.junit.Assert;

public class ListDemoTest {
private ListDemo listDemo;
@Test
    public void SurnameTest(){
    Human test = new Human();
    test.add("Микула");
    test.add("Микула");
    test.add("Микула");
    test.add("Микула");
    test.add("Микула");
    test.add("Немикула");
    test.add("Карабалин");
    test.add("Шайкин");
    listDemo.SameSurname();
}
}