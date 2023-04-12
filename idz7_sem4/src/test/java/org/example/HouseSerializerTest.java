package org.example;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class HouseSerializerTest {
    @Test
    public void SerializatorTest() throws IOException, ClassNotFoundException {
        House test = new House();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        HouseSerializer.Serializer(outputStream, test);
        InputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        assertTrue(test.equals(HouseSerializer.Deserializer(inputStream)));

    }

}