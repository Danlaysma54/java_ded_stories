package org.example;

public class Intergral<T extends defined_function> implements Functional<T> {
    @Override
    public double FunctionalValue(T x) {
        double h = (x.FrontierSup() - x.FrontierInf()) / 1000000;
        double res = 0;
        double i = x.FrontierInf();
        do {
            res += h * x.Solution(i);
            i += h;
        } while (i < x.FrontierSup());
        return res;
    }
}
