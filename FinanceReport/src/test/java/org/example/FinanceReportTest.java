package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FinanceReportTest {
    private FinanceReport obj;

    @Before
    public void SetUp() {
        obj = new FinanceReport();
    }

    /*  @Test
      public void FinanceStandardConstructFIO() {
          assertEquals("Иванов Иван Иванович", obj.GetAccountant());
      }

      @Test
      public void FinanceStandardConstructReportDay() {
          assertEquals("1.1.1970", obj.GetReportDayString());
      }
     */


    @Test
    public void PaymentReadTest() {
        assertEquals("Иван Иванов Иванович 1.1.1970 0", obj.payment_read(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void PaymentReadTestNeg() {
        obj.payment_read(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void PaymentReadTestTooMany() {
        obj.payment_read(1);
    }

    @Test
    public void NameOfPayerTest() {
        assertEquals("Иван Иванов Иванович", obj.NameOfPayer(0));
    }

    @Test
    public void WritePayerTest() {
        Payment test = new Payment("k", 12, 12, 2002, 0);
        obj.payment_write(0, test);
        assertEquals(test.toString(), obj.GetArrayList().get(0).toString());
    }

    @Test
    public void SetAccountantTest() {
        obj.SetAccountant("s");
        assertEquals("s", obj.GetAccountant());
    }

    @Test
    public void NumberOfPaymentsTest() {
        assertEquals(1, obj.payment_number());
    }

    @Test
    public void toStringTestFinanceReport() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 3333));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test1 = new Data();
        obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);
        String str = new String("Author: LeonidIvanovYanovich, Date: 1 1 1970, Payments:\n" +
                "Payer: q,date: 12.12.2001 sum: 33 rub. 33 pen.\n" +
                "Payer: r,date: 11.11.2002 sum: 44 rub. 44 pen.\n" +
                "Payer: t,date: 10.10.2000 sum: 22 rub. 22 pen.\n");
        assertEquals(str, obj.toString());
    }
}