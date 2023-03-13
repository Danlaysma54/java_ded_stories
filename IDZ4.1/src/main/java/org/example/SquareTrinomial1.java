package org.example;

public class SquareTrinomial1 {
    QuadraticTrinomial trinomial;

    public SquareTrinomial1(QuadraticTrinomial trinomial) {
        this.trinomial = new QuadraticTrinomial(trinomial.getA(), trinomial.getB(), trinomial.getC());
    }

    public double MaxRoot() {
        double[] arr = new double[2];
        arr = trinomial.Equation_solution();
        return Math.max(arr[0], arr[1]);
    }
}
