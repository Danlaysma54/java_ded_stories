import java.io.*;
import java.util.ArrayList;

public class StreamTest {
    static void ArrayIntInBytes(int[] arr) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("file.txt"));
        int b;
        for (int numbs : arr) {
            outputStream.write(numbs);
        }
        outputStream.close();
    }

    static ArrayList<Integer> BytesInIntArray(DataInputStream inputStream,int n) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>(int n);
        int numb;
      for(int i=0;i<arrayList.size();i++) {
          arrayList.add(inputStream.readInt());
      }
        return arrayList;
    }
}
