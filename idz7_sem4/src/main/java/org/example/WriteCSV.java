package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCSV {
    static void WriteHouseInCSV(House house) throws IOException {
        try (FileWriter csvWriter = new FileWriter(String.format("house_%s.csv", house.getCadastral_number_of_the_house()))) {
            csvWriter.append("cadastral_number_of_the_house:");
            csvWriter.append("\t");
            csvWriter.append(house.getCadastral_number_of_the_house());
            csvWriter.append("\n");
            csvWriter.append("Address:");
            csvWriter.append("\t");
            csvWriter.append(house.getAddress());
            csvWriter.append("\n");
            csvWriter.append("Header:");
            csvWriter.append(house.getHead_of_the_house().getSurname());
            csvWriter.append(" ");
            csvWriter.append(house.getHead_of_the_house().getName());
            csvWriter.append(" ");
            csvWriter.append(house.getHead_of_the_house().getLastname());
            csvWriter.append("\n");
            csvWriter.append("About flats\n");
            csvWriter.append("Number");
            csvWriter.append("\t");
            csvWriter.append("Square");
            csvWriter.append("\t");
            csvWriter.append("Owners");
            ArrayList<String> flats = new ArrayList<>();
            String test = "";
            for (Flat flat : house.getFlats()) {
                test+="\n";
                test += flat.getNumber();
                test += ";";
                test += flat.getSquare();
                test += ";";
                for (Person person : flat.getPeople()) {
                    test += person.getSurname();
                    test += " ";
                    test += person.getName().charAt(0);
                    test += ".";
                    test += person.getLastname().charAt(0);
                    test += ". ";
                }
                flats.add(test);
                test = "";
            }
            csvWriter.append(String.join(";", flats));
        }
    }
}
