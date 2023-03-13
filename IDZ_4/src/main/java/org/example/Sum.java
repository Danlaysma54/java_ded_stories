package org.example;

public class Sum<T extends defined_function> implements Functional<T> {
    @Override
    public double FunctionalValue(T x) {
        return x.Solution(x.FrontierSup()) + x.Solution(x.FrontierInf()) + x.Solution((x.FrontierSup() + x.FrontierInf()) / 2);
    }
}
