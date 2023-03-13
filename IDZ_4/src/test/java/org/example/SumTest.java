package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {
    @Test
    public void testFunctionalValue1() {
        Sum<ReguralFunction> test = new Sum<>();
        ReguralFunction test1 = new ReguralFunction(1, 2, 3, 4);
        assertEquals(16.5, test.FunctionalValue(test1), 0.00005);
    }

    @Test
    public void testFucntionValue2() {
        Sum<SinusFunction> test = new Sum<>();
        SinusFunction test1 = new SinusFunction(1, 2, 3, 4);
        assertEquals(1.3669293471, test.FunctionalValue(test1), 0.00005);
    }

    @Test
    public void testFunctionValue3() {
        Sum<Fraction> test = new Sum<>();
        Fraction test1 = new Fraction(1, 2, 3, 4, 3, 4);
        assertEquals(1.1389257294, test.FunctionalValue(test1), 0.00006);
    }

    @Test
    public void testFunctionValue4() {
        Sum<Exponent> test = new Sum<>();
        Exponent test1 = new Exponent(1, 2, 3, 4);
        assertEquals(113.7991,test.FunctionalValue(test1),0.00005);
    }
}