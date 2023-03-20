package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PhoneBookTest {
    private PhoneBook phone_book_test;

    @Before
    public void Setup() {
        this.phone_book_test = new PhoneBook();
        this.phone_book_test.phonebook = new HashMap<>();
    }

    @Test
    public void addPhoneTest() {
        Map<Human, ArrayList<String>> phonebook_test = new HashMap<>();
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test, new ArrayList<>(Arrays.asList("883123123123", "3213123124")));
        this.phone_book_test.AddPhone(test, "3213123123");
        Assert.assertEquals("3213123123", this.phone_book_test.phonebook.get(test).get(2));
    }

    @Test
    public void deletePhone() {

    }

    @Test
    public void getNumbers() {
    }

    @Test
    public void getHuman() {
    }

    @Test
    public void startsWithSurname() {
    }
}