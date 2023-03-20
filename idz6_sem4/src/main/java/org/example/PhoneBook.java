package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<Human, ArrayList<String>> phonebook;

    public void AddPhone(Human human, String number) {
        this.phonebook.get(human).add(number);
    }

    public void DeletePhone(Human human, String number) {
        this.phonebook.get(human).remove(number);
    }

    public ArrayList<String> GetNumbers(Human human) {
        return this.phonebook.get(human);
    }

    public Human GetHuman(String number) {
        for (Map.Entry<Human, ArrayList<String>> entry : this.phonebook.entrySet()) {
            for (String numbers : this.phonebook.get(entry.getKey())) {
                if (numbers.equals(number)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public Map<Human, ArrayList<String>> StartsWithSurname(String same) {
        Map<Human, ArrayList<String>> map = new HashMap<>();
        for (Map.Entry<Human, ArrayList<String>> entry : this.phonebook.entrySet()) {
            if (entry.getKey().getSurname().startsWith(same)) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }
}