package org.example;

public class DiagMatrix extends Matrix {
    DiagMatrix(int n) {
        super(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i)
                    super.ChangeElem(i, j, 0);
            }
        }
    }

    DiagMatrix(double[] arrdiag, int n) {
        super(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != i)
                    super.ChangeElem(i, j, 0);
                else
                    super.ChangeElem(i, j, arrdiag[i]);
            }
        }
    }

    @Override
    public void ChangeElem(int i, int j, double elem) {
        if (i == j) {
            super.ChangeElem(i, j, elem);
        } else throw new IllegalArgumentException("For Diagonal Matrix it must be i=j");
    }
}
