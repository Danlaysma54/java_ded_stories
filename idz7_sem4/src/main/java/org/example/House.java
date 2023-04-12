package org.example;

import java.io.Serializable;
import java.util.ArrayList;

public class House implements Serializable {
    private String cadastral_number_of_the_house;
    private String address;
    private Person head_of_the_house;
    private ArrayList<Flat> flats = new ArrayList<>();

    public House(String cadastral_number_of_the_house, String address, Person head_of_the_house, ArrayList<Flat> flats) {
        this.cadastral_number_of_the_house = cadastral_number_of_the_house;
        this.address = address;
        this.head_of_the_house = new Person(head_of_the_house.getName(), head_of_the_house.getSurname(), head_of_the_house.getLastname(), head_of_the_house.getYear(), head_of_the_house.getMonth(), head_of_the_house.getDay());
        this.flats.addAll(flats);
    }

    public House() {
        this.head_of_the_house = new Person();
        this.cadastral_number_of_the_house = "";
        this.address = "Nothing St. 32";
        flats.add(new Flat());
    }

    public Person getHead_of_the_house() {
        return head_of_the_house;
    }

    public ArrayList<Flat> getFlats() {
        return flats;
    }

    public String getAddress() {
        return address;
    }

    public String getCadastral_number_of_the_house() {
        return cadastral_number_of_the_house;
    }

    public boolean equals(House house) {
        if (!this.cadastral_number_of_the_house.equals(getCadastral_number_of_the_house()) || !this.address.equals(house.getAddress()) || !this.head_of_the_house.equals(house.head_of_the_house) ||
                house.flats.size() != this.flats.size())
            return false;
        for (int i = 0; i < house.flats.size(); i++) {
            if (!this.flats.get(i).equals(house.getFlats().get(i))) {
                return false;
            }
        }
        return true;
    }
}
