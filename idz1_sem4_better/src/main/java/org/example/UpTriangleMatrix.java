package org.example;

public class UpTriangleMatrix extends Matrix {
    UpTriangleMatrix(int n) {
        super(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i)
                    super.ChangeElem(i, j, 0);
            }
        }
    }

    UpTriangleMatrix(double[] arrup, int n) {
        super(n);
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i)
                    super.ChangeElem(i, j, 0);
                else {
                    super.ChangeElem(i, j, arrup[k]);
                    k++;
                }
            }
        }
    }

    @Override
    public void ChangeElem(int i, int j, double elem) {
        if (j >= i)
            super.ChangeElem(i, j, elem);
        else throw new IllegalArgumentException("In UpTriangleMatrix i has to be more than j");
    }
}
