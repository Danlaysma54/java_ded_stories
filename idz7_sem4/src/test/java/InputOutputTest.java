import org.example.ExtensionFilter;
import org.example.House;
import org.example.HouseSerializer;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InputOutputTest {
    @Test
    public void TestArrayInIntBytes() throws IOException {
        /* OutputStream outputStream = new FileOutputStream("file.txt");
        int[] arr = {1, 2, 3};
        InputOutput.ArrayIntInBytes(outputStream, arr);
        InputStream inputStream = new FileInputStream("file.txt");
        assertArrayEquals(arr, InputOutput.BytesInIntArray(inputStream, 3));
         */
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            int[] arr = {1, 2, 3};
            InputOutput.ArrayIntInBytes(byteArrayOutputStream, arr);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            assertArrayEquals(arr, InputOutput.BytesInIntArray(byteArrayInputStream, 3));
            byteArrayInputStream.close();
        }
    }

    @Test
    public void TestBytesInIntArray() throws IOException {
        OutputStream outputStream = new FileOutputStream("file1.txt");
        int[] arr = {1, 2, 3, 4};
        InputOutput.ArrayIntInBytes(outputStream, arr);
        InputStream inputStream = new FileInputStream("file1.txt");
        assertArrayEquals(arr, InputOutput.BytesInIntArray(inputStream, 4));
    }

    @Test
    public void ReaderToIntArrayTest() throws FileNotFoundException {
        Reader reader1 = new StringReader("1 2 3");
        int[] arr = {1, 2, 3};
        assertArrayEquals(arr, InputOutput.ReaderToIntArray(reader1, 3));
    }

    @Test
    public void WriterFromIntArray() throws IOException {
        Writer writer = new StringWriter();
        int[] arr = {1, 2, 3};
        String str = "1 2 3 ";
        InputOutput.WriterFromIntArray(writer, arr);
        assertEquals(str, writer.toString());
    }

    @Test
    public void ReadFromAnyPose() throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("file2.txt", "r")) {
            OutputStream outputStream = new FileOutputStream("file2.txt");
            int[] arr = {1, 2, 3, 4};
            InputOutput.ArrayIntInBytes(outputStream, arr);
            ArrayList<Integer> arrayList = new ArrayList<>(List.of(3, 4));
            assertArrayEquals(arrayList.toArray(), InputOutput.ReadFromAnyPose(randomAccessFile, 2).toArray());
        }
    }

    @Test
    public void AllNecessaryFilesTest() {
        File dir = new File("../idz7_sem4");
        String[] names = {"file.txt", "file1.txt", "file2.txt"};
        assertArrayEquals(names, InputOutput.AllNecessaryFiles(".txt", dir));
    }

    @Test
    public void AllFilesAndDirsTest() {
        File dir = new File("../idz7_sem4");
        String regular = "testb?l?";
        ArrayList<String> files = new ArrayList<>(List.of("/home/danlaysma/java_ded_stories/idz7_sem4/../idz7_sem4/src/test", "/home/danlaysma/java_ded_stories/idz7_sem4/../idz7_sem4/testbl"));
        assertArrayEquals(files.toArray(), InputOutput.AllFilesAndDirs(regular, dir).toArray());
    }
}