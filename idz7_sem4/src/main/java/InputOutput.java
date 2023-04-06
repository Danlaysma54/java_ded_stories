import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutput {
    static ByteArrayOutputStream ArrayIntInBytes(int[] arr) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int numbs : arr) {
            outputStream.write(numbs);
        }
        outputStream.close();
        return outputStream;
    }

    static ArrayList<Integer> BytesInIntArray(InputStream inputStream, int n) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        for (int i = 0; i < n; i++) {
            arrayList.add(dataInputStream.read());
        }
        return arrayList;
    }

    static ArrayList<Integer> ReaderToIntArray(Reader reader) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(reader)) {
            while (scanner.hasNextInt()) {
                arrayList.add(scanner.nextInt());
            }
            return arrayList;
        }
    }

    static Writer WriterFromIntArray(int[] arr) throws IOException {
        Writer writer = new PrintWriter(new StringWriter());
        for (int numbs : arr) {
            writer.write(numbs);
            writer.write(" ");
        }
        writer.close();
        return writer;
    }

    static ArrayList<Integer> ReadFromPose(RandomAccessFile randomAccessFile, int pose) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
    //    randomAccessFile.seek(pose * 4);
        int z;
        z = randomAccessFile.read();
        randomAccessFile.close();

        return arr;
    }
}

