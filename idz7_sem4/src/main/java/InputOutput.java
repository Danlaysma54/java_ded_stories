import org.example.ExtensionFilter;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputOutput {
    static void ArrayIntInBytes(OutputStream outputStreams, int[] arr) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(outputStreams)) {
            for (int numbs : arr) {
                dataOutputStream.writeInt(numbs);
            }
        }
    }

    static int[] BytesInIntArray(InputStream inputStream, int n) throws IOException {
        int[] arr = new int[n];
        try (DataInputStream dataInputStream = new DataInputStream(inputStream)) {
            int numb;
            for (int i = 0; i < n; i++) {
                arr[i] = (dataInputStream.readInt());
            }
        }
        return arr;
    }

    static int[] ReaderToIntArray(Reader reader, int n) {
        int[] arr = new int[n];
        try (Scanner scanner = new Scanner(reader)) {
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }
        return arr;
    }

    static void WriterFromIntArray(Writer writer, int[] arr) {
        PrintWriter writer1 = new PrintWriter(writer);
        for (int numbs : arr) {
            writer1.print(numbs);
            writer1.print(" ");
        }
    }

    static ArrayList<Integer> ReadFromAnyPose(RandomAccessFile randomAccessFile, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        try {
            randomAccessFile.seek(n * 4);
            while (randomAccessFile.getFilePointer() != randomAccessFile.length()) {
                arr.add(randomAccessFile.readInt());
            }
        } catch (IOException EX) {

        }
        return arr;
    }

    static String[] AllNecessaryFiles(String extension, File current_dir) {
        return current_dir.list(new ExtensionFilter(extension));
    }

    static ArrayList<String> AllFilesAndDirs(String regular, File current_dir) {
        Pattern pattern = Pattern.compile(regular);
        ArrayList<String> list_files = new ArrayList<>();
        InputOutput.TakeAllFiles(current_dir, list_files,pattern);
        return list_files;
    }

    static void TakeAllFiles(File smth, ArrayList<String> list_files,Pattern pattern) {
        File[] files = smth.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                TakeAllFiles(file, list_files,pattern);
            }
            Matcher matcher = pattern.matcher(file.getName());
            if (matcher.matches())
            list_files.add(file.getAbsolutePath());
        }
    }

}

