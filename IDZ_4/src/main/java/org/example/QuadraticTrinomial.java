package org.example;

import static java.lang.Math.sqrt;

public class QuadraticTrinomial {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticTrinomial(double a, double b, double c) {
        if (b * b - 4 * a * c < 0)
            throw new IllegalArgumentException("Discriminant сan't be less than zero");
        if (b == 0)
            throw new IllegalArgumentException(" b can't be zero");
        if (a == 0)
            throw new IllegalArgumentException("a can't be zero");
        if (c == 0)
            throw new IllegalArgumentException("c can't be zero");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] Equation_solution() {
        double[] arr = new double[2];
        double D = 0;
        D = sqrt(b * b - 4 * a * c);
        arr[0] = (-b + D) / (2 * a);
        arr[1] = (-b - D) / (2 * a);
        return arr;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
