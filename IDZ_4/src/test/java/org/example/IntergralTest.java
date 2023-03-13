package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntergralTest {
    @Test
    public void testFunctionalValue1() {
        Intergral<ReguralFunction> test = new Intergral<>();
        ReguralFunction test1 = new ReguralFunction(1, 2, 3, 100);
        assertEquals(5189.5, test.FunctionalValue(test1), 0.2);
    }

    @Test
    public void testFucntionValue2() {
        Intergral<SinusFunction> test = new Intergral<>();
        SinusFunction test1 = new SinusFunction(1, 1, -200, 200);
        assertEquals(2.0, test.FunctionalValue(test1), 0.001);
    }

    @Test
    public void testFunctionValue3() {
        Intergral<Fraction> test = new Intergral<>();;
        Fraction test1 = new Fraction(1, 2, 3, 4, 3, 100);
        assertEquals(33.03379518754326, test.FunctionalValue(test1), 0.2);
    }

    @Test
    public void testFunctionValue4() {
        Intergral<Exponent> test = new Intergral<>();
        Exponent test1 = new Exponent(1, 2, 3, 6);
        assertEquals(389.3432565695475, test.FunctionalValue(test1), 0.2);
    }
}