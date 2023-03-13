package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.example.FinanceReportProcessor.FirstSimilarLetterPeople;
import static org.example.FinanceReportProcessor.LessThanThatSum;
import static org.example.FinanceReportProcessor.FullPrice;
import static org.example.FinanceReportProcessor.DidntPayMonth;


public class FinanceReportProcessorTest {


    @Test
    public void firstSimilarLetterPeople() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 3333));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test1 = new Data();
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);

        String str = new String("Author: LeonidIvanovYanovich, Date: 1 1 1970, Payments:\n" +
                "Payer: q,date: 12.12.2001 sum: 33 rub. 33 pen.\n");
        assertEquals(str, FirstSimilarLetterPeople(obj, "q").toString());
    }

    @Test
    public void lessThanThatSum() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 1111));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test1 = new Data();
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);
        String str = new String("Author: LeonidIvanovYanovich, Date: 1 1 1970, Payments:\n" +
                "Payer: q,date: 12.12.2001 sum: 11 rub. 11 pen.\n");
        assertEquals(str, LessThanThatSum(obj, 1200).toString());
    }

    @Test
    public void FullPriceTest() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 1111));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test1 = new Data(22, 12, 2005);
        String test2 = new String("22.12.05");
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);
        assertEquals(7777, FullPrice(test2, obj));
    }

    @Test
    public void FullPricetest1() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 1111));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test2 = new Data(22, 10, 2002);
        String test1 = new String("22.10.02");
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test2);
        assertEquals(3333, FullPrice(test1, obj));
    }

    @Test
    public void FullPricetest2() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 1111));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test2 = new Data(22, 10, 2002);
        String test1 = new String("22.10.02");
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test2);
        assertEquals(3333, FullPrice(test1, obj));
    }

    @Test
    public void FullPricetest3() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 1111));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test2 = new Data(22, 10, 2002);
        String test1 = new String("22.10.04");
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test2);
        assertEquals(7777, FullPrice(test1, obj));
    }

    @Test
    public void FullPricetest4() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 1111));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test1 = new Data(12, 9, 2000);
        String test2 = new String("12.9.00");
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);
        assertEquals(0, FullPrice(test2, obj));
    }

    @Test
    public void FullPracetest5() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 2001, 1111));
        test.add(new Payment("r", 11, 11, 2002, 4444));
        test.add(new Payment("t", 10, 10, 2000, 2222));
        Data test1 = new Data(11, 11, 2002);
        String test2 = new String("11.11.02");
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);
        assertEquals(7777, FullPrice(test2, obj));
    }
    @Test
    public void FullPracetest6() {
        ArrayList<Payment> test = new ArrayList<Payment>();
        test.add(new Payment("q", 12, 12, 1993, 1111));
        test.add(new Payment("r", 11, 11, 1992, 4444));
        test.add(new Payment("t", 10, 10, 1975, 2222));
        Data test1 = new Data(11, 11, 2002);
        String test2 = new String("11.11.91");
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);
        assertEquals(2222, FullPrice(test2, obj));
    }

    @Test
    public void DidntPayMonthtest() {
        int year = 2002;
        ArrayList<Payment> test = new ArrayList<Payment>();
        String[] Months = new String[]{"February", "June", "August"};
        test.add(new Payment("q", 12, 12, 2002, 1111));
        test.add(new Payment("r", 11, 3, 2002, 4444));
        test.add(new Payment("t", 10, 2, 2002, 0));
        test.add(new Payment("t", 10, 5, 2000, 2222));
        test.add(new Payment("q", 12, 12, 2002, 1111));
        test.add(new Payment("r", 11, 6, 2002, 0));
        test.add(new Payment("t", 10, 8, 2002, 0));
        test.add(new Payment("t", 10, 9, 2000, 2222));
        Data test1 = new Data(11, 11, 2002);
        FinanceReport obj = new FinanceReport(test, "LeonidIvanovYanovich", test1);
        assertArrayEquals(Months, DidntPayMonth(year, obj).toArray());
    }
}