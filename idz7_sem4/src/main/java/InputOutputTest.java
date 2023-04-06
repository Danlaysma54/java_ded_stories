import org.junit.Test;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InputOutputTest {

    @Test
    public void arrayIntInBytesTest() throws Exception {
        byte[] byte_test = {1, 2, 3};
        int[] int_test = {1, 2, 3};
        ByteArrayOutputStream byteArrayInputStream = InputOutput.ArrayIntInBytes(int_test);
        assertArrayEquals(byte_test, InputOutput.ArrayIntInBytes(int_test).toByteArray());
    }

    @Test
    public void bytesInIntArrayTest() throws Exception {
        byte[] inputArray = {1, 2, 3};
        ArrayList<Integer> test = new ArrayList<>(List.of(1, 2, 3));
        InputStream InputStream = new ByteArrayInputStream(inputArray);
        assertArrayEquals(test.toArray(), InputOutput.BytesInIntArray(InputStream, 3).toArray());
    }

    @Test
    public void ReaderToArrayIntTest() {
        ArrayList<Integer> test1 = new ArrayList<>(List.of(1, 2, 3));
        Reader reader = new StringReader("1 2 3");
        assertArrayEquals(test1.toArray(), InputOutput.ReaderToIntArray(reader).toArray());
    }

    @Test
    public void WriteFromArrayTest() throws IOException {
        int[] int_test = {1, 2, 3};
        byte[] byte_test = {1, 2, 3};
        Writer writer = InputOutput.WriterFromIntArray(int_test);
/*       ByteArrayOutputStream byteArrayOutputStream = new InputStream(new ByteArrayOutputStream(writer));
        assertArrayEquals(int_test,);
*/
    }
    @Test
    public void ReadFromRandomFile() throws IOException {
        ArrayList<Integer> arr =new ArrayList<>(List.of(7,8,9));
        assertArrayEquals(arr.toArray(),InputOutput.ReadFromPose(new RandomAccessFile("name.txt","r"),6).toArray());
    }
}