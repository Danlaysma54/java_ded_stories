package org.example;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(100);
        double[] arr = {0,3,-5,5,3,-3,2,7,6,7,5,8,9,2,-7,-2};
        Matrix matrix1 = new Matrix(arr,4);
    //    matrix1.toDisplayMatrix();
      //  System.out.println(matrix1.СalculateDeterminant());
        matrix.toDisplayMatrix();
    }
}