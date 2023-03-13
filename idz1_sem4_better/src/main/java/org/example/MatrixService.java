package org.example;

import java.util.Arrays;

public class MatrixService {
    public static void arrangeMatrices(Comparator<Matrix> c, Matrix[] array) {
        Arrays.sort(array, c);
    }
}
