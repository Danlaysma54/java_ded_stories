package org.example;

public class Matrix implements IMatrix {
    private double arr[];
    private int n;
    private double det;
    private boolean flag;

    Matrix(int n) {
        this.n = n;
        arr = new double[n * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 19 + 20);
            this.flag = false;
        }
    }

    Matrix(double[] arr1, int n) {
        this.n = n;
        this.arr = arr1;
        this.flag = false;
    }

    @Override
    public void ChangeElem(int i, int j, double elem) {
        this.flag = false;
        arr[i * this.n + j] = elem;
    }

    @Override
    public double СalculateDeterminant() {
        double divide;

        int l = 0;
        if (this.flag)
            return this.det;
        else {
            this.det = 1;
            for (int i = 0; i < this.n; i++) {
                for (int k = i + 1; k < this.n; k++) {
                    if (arr[i * n + i] == 0) {
                        l = i;
                        do {
                            l++;
                            if (l == n)
                                return 0;
                        } while (arr[l * n + i] == 0);
                        double tmp;
                        for (int p = 0; p < this.n; p++) {
                            tmp = arr[i * n + p];
                            arr[i * n + p] = arr[l * n + p];
                            arr[l * n + p] = tmp;

                        }
                        det *= -1;
                    }
                    divide = arr[k * n + i] / arr[i * n + i];
                    for (int f = 0; f < this.n; f++) {
                        arr[k * n + f] -= divide * arr[i * n + f];
                    }
                }
            }
            for (int i = 0; i < this.n; i++) {
                this.det *= arr[i * n + i];
            }
            this.flag = true;
            return this.det;
        }
    }

    @Override
    public double GetElem(int i, int j) {
        return arr[i * this.n + j];
    }

    public void toDisplayMatrix() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.printf("%f ", arr[i * n + j]);
            }
            System.out.print("\n");
        }
    }

    public boolean getFlag() {
        return this.flag;
    }
}