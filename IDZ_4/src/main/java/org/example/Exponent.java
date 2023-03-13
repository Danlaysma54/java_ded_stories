package org.example;

import static java.lang.Math.*;

public class Exponent implements defined_function {
    private double A;
    private double B;
    private double a;
    private double b;

    public Exponent(double A, double B, double a, double b) {
        if (abs(a - b) < 0.0005) {
            throw new IllegalArgumentException("frontiers can't be equal");
        }
        this.A = A;
        this.B = B;
        this.a = a;
        this.b = b;
    }

    @Override
    public double FrontierInf() {
        return this.a;
    }

    @Override
    public double FrontierSup() {
        return this.b;

    }

    @Override
    public double Solution(double x) {
        if (this.a > this.b) {
            double tmp = 0;
            tmp = this.a;
            this.a = this.b;
            this.b = tmp;
        }
        if (x < this.a || x > this.b)
            throw new IllegalArgumentException("X doesn't belong to frontier");
        return this.A * exp(x) + this.B;
    }

    public double geta() {
        return this.a;
    }

    public double getb() {
        return this.b;
    }
}
