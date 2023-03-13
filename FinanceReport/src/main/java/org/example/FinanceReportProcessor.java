package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class FinanceReportProcessor {
    static FinanceReport FirstSimilarLetterPeople(FinanceReport input, String sym) {
        FinanceReport output = new FinanceReport();
        for (int i = 0; i < input.payment_number(); i++) {
            if (input.NameOfPayer(i).startsWith(sym)) {
                output.payment_write(i, input.Payment_Return(i));
            }
            output.SetReportDay(input.GetReportDay());
            output.SetAccountant(input.GetAccountant());
        }
        return output;
    }

    static FinanceReport LessThanThatSum(FinanceReport input, int Sum) {
        FinanceReport output = new FinanceReport();
        for (int i = 0; i < input.payment_number(); i++) {
            if (input.Payment_Return(i).getSum() < Sum) {
                output.payment_write(i, input.Payment_Return(i));
            }
            output.SetReportDay(input.GetReportDay());
            output.SetAccountant(input.GetAccountant());
        }
        return output;

    }

    static int FullPrice(String data, FinanceReport input) {
        String[] words = data.split("\\.");
        int day = Integer.parseInt(words[0]);
        int month = Integer.parseInt(words[1]);
        int year = Integer.parseInt(words[2]);
        if (year > 22)
            year = 1900 + Integer.parseInt(words[2]);
        else
            year = 2000 + Integer.parseInt(words[2]);
        Data current_date = new Data(day, month, year);
        int sum = 0;
        for (Payment p : input.GetArrayList()) {
            if (p.getDate().getYear() < current_date.getYear()) {
                sum += p.getSum();
            }
            if (p.getDate().getYear() == current_date.getYear()) {
                if (p.getDate().getMonth() < current_date.getMonth()) {
                    sum += p.getSum();
                }
                if (p.getDate().getMonth() == current_date.getMonth()) {
                    if (p.getDate().getDay() <= current_date.getDay())
                        sum += p.getSum();
                }
            }
        }
        return sum;
    }

    static ArrayList<String> DidntPayMonth(int year, FinanceReport input) {
        ArrayList<String> months = new ArrayList<String>();
        String[] Months = new String[]{"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        for (Payment p : input.GetArrayList()) {
            if (p.getDate().getYear() == year) {
                if (p.getSum() == 0) {
                    months.add(Months[p.getDate().getMonth() - 1]);
                }
            }
        }
        return months;
    }
}