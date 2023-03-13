package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentTest {
    private Payment obj;

    @Before
    public void SetUp() {
        obj = new Payment();
    }

    @Test
    public void TestToString() {
        String str = new String("Иван Иванов Иванович 1.1.1970 0");
        assertEquals(str, obj.toString());
    }

    @Test
    public void ConstructStandTest() {
        obj = new Payment("Lyasman Daniil Vitalievich", 18, 3, 2002, 2);
        assertEquals("Lyasman Daniil Vitalievich 18.3.2002 2", obj.toString());
    }

    @Test
    public void ConstructCopyTest() {
        obj = new Payment("Lyasman Daniil Vitalievich", 18, 3, 2002, 2);
        Payment test = new Payment(obj);
        assertEquals(obj.toString(), test.toString());
    }

    @Test(expected = IllegalArgumentException.class) //нужно ли проверять стринг на null?
    public void ConstructSumTest() {
        String str = new String();
        int sum = -2;
        obj = new Payment(str, 12, 1, 2002, -2);
    }

    @Test
    public void GetFIOTest() {
        assertEquals("Иван Иванов Иванович", obj.getFIO());
    }

    @Test
    public void SetFIOTest() {
        obj.setFIO("Lyasman Daniil Vitalievich");
        assertEquals("Lyasman Daniil Vitalievich", obj.getFIO());
    }

    @Test
    public void GetDate_of_paymentTest() {
        assertEquals("1.1.1970", obj.getDate_of_payment());
    }

    @Test
    public void SetDateOfPaymentTest() {
        Data test = new Data(12, 2, 2002);
        obj.setDate_of_payment(test);
        assertEquals("12.2.2002", obj.getDate_of_payment());
    }

    @Test
    public void GetSumTest() {
        assertEquals(0, obj.getSum());
    }

    @Test
    public void SetSumTest() {
        obj.setSum(2);
        assertEquals(2, obj.getSum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void SetNegativeSumTest() {
        int sum = -2;
        obj.setSum(sum);
    }

    @Test
    public void EqualsTest() {
        Payment test = new Payment();
        assertTrue(obj.equals(test));

    }

    @Test
    public void ToStringTest() {
        assertEquals("Иван Иванов Иванович 1.1.1970 0", obj.toString());
    }

}