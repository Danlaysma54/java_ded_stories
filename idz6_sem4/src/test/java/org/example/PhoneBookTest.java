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
    @Test (expected = IllegalArgumentException.class)
    public void addPhoneTest1() {
        Map<Human, ArrayList<String>> phonebook_test = new HashMap<>();
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test, new ArrayList<>(Arrays.asList("883123123123", "3213123124")));
        this.phone_book_test.AddPhone(test, "883123123123");
        Assert.assertEquals("3213123123", this.phone_book_test.phonebook.get(test).get(2));
    }

    @Test
    public void deletePhone() {
        Map<Human, ArrayList<String>> phonebook_test = new HashMap<>();
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test, new ArrayList<>(Arrays.asList("883123123123", "3213123124")));
        this.phone_book_test.DeletePhone(test, "3213123124");
        ArrayList<String> test1 = new ArrayList<String>(Arrays.asList("883123123123"));
        Assert.assertEquals(test1, this.phone_book_test.phonebook.get(test));
    }

    @Test
    public void getNumbers() {
        Map<Human, ArrayList<String>> phonebook_test = new HashMap<>();
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test, new ArrayList<>(Arrays.asList("883123123123", "3213123124")));
        ArrayList<String> test1 = new ArrayList<String>(Arrays.asList("883123123123", "3213123124"));
        Assert.assertEquals(test1, this.phone_book_test.GetNumbers(test));
    }

    @Test
    public void getHuman() {
        Map<Human, ArrayList<String>> phonebook_test = new HashMap<>();
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test, new ArrayList<>(Arrays.asList("883123123123", "3213123124")));
        Assert.assertEquals(test, phone_book_test.GetHuman("883123123123"));
    }

    @Test
    public void startsWithSurname() {
        Map<Human, ArrayList<String>> phonebook_test = new HashMap<>();
        Human test = new Human("Lyasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        Human test1 = new Human("Byasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test1, new ArrayList<>(Arrays.asList("8831231231243", "3213123124")));
        Human test2 = new Human("Lassman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test2, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        Map<Human, ArrayList<String>> phonebook_test1 = new HashMap<>();
        phonebook_test1.put(test, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        phonebook_test1.put(test2, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        assertEquals(phonebook_test1,phone_book_test.StartsWithSurname("L"));
    }
    @Test
    public void startsWithSurname1() {
        Map<Human, ArrayList<String>> phonebook_test = new HashMap<>();
        Human test = new Human("Laasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        Human test1 = new Human("Byasman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test1, new ArrayList<>(Arrays.asList("8831231231243", "3213123124")));
        Human test2 = new Human("Lassman", "Daniil", "Vitalievich", 21);
        phone_book_test.phonebook.put(test2, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        Map<Human, ArrayList<String>> phonebook_test1 = new HashMap<>();
        phonebook_test1.put(test, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        phonebook_test1.put(test2, new ArrayList<>(Arrays.asList("883123123143", "3213123124")));
        assertEquals(phonebook_test1,phone_book_test.StartsWithSurname("La"));
    }
}