package org.example;

import java.io.*;
import java.util.*;

public class HouseSerializer {
    static void Serializer(OutputStream outputStream, House house) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(house);
        }
    }


    static House Deserializer(InputStream inputstream) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(inputstream)) {
            return (House) objectInputStream.readObject();
        }
    }

}
