package org.example;

import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class Fraction implements defined_function {
    private double A;
    private double B;
    private double C;
    private double D;
    private double a;
    private double b;

    public Fraction(double A, double B, double C, double D, double a, double b) {
        if (abs(a - b) < 0.0005) {
            throw new IllegalArgumentException("frontiers can't be equal");
        }
        if (C == 0 && D == 0) {
            throw new IllegalArgumentException("C and D can't be 0");
        }
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
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
        if (C * x + D == 0) {
            throw new IllegalArgumentException("denominator can't be zero");
        }

        if (x < this.a || x > this.b)
            throw new IllegalArgumentException("X doesn't belong to frontier");
        return (this.A * x + this.B) / (this.C * x + this.D);
    }
}
