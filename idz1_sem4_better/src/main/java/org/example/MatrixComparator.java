package org.example;

public class MatrixComparator implements Comparator<Matrix> {
    public int compare(Matrix a, Matrix b) {
        return (int) (a.СalculateDeterminant() - b.СalculateDeterminant());
    }

}
