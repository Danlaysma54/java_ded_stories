package org.example;

import java.util.ArrayList;

public class FinanceReport {
    private final ArrayList<Payment> payments;
    private String accountant;
    private final Data report_day;


    FinanceReport() {
        Payment smth = new Payment();
        this.payments = new ArrayList<Payment>();
        this.payments.add(smth);
        this.accountant = "Иванов Иван Иванович";
        this.report_day = new Data();
    }

    FinanceReport(ArrayList<Payment> payments, String accountant, Data report_day) {
        this.payments = new ArrayList<Payment>();
        this.payments.addAll(payments);
        this.accountant = accountant;
        this.report_day = report_day;
    }

    FinanceReport(FinanceReport copy) {
        this.payments = new ArrayList<Payment>();
        for (int i = 0; i < copy.payments.size(); i++) {
            Payment test = new Payment(copy.payments.get(i));
            this.payments.add(test);
        }
        this.accountant = new String(copy.accountant);
        this.report_day = new Data(copy.report_day.getDay(), copy.report_day.getMonth(), copy.report_day.getYear());
    }

    public int NumberOfPayments() {
        return this.payments.size();
    }

    public String payment_read(int i) {
        if (i>=this.payments.size() || i<0)
            throw new IllegalArgumentException("There isn't payment with this number");
        return this.payments.get(i).toString();
    }

    public Payment Payment_Return(int i) {
        if (i>=this.payments.size() || i<0)
            throw new IllegalArgumentException("There isn't payment with this number");
        return payments.get(i);
    }

    public String NameOfPayer(int i) {
        return this.payments.get(i).getFIO();
    }

    public void payment_write(int i, Payment payment) {
        this.payments.set(i, payment);
    }

    public void SetAccountant(String input) {
        this.accountant = new String(input);
    }

    public void SetReportDay(Data input) {
        this.report_day.setDay(input.getDay());
        this.report_day.SetMonth(input.getMonth());
        this.report_day.SetYear(input.getYear());
    }

    public Data GetReportDay() {
        return this.report_day;
    }

    public String GetReportDayString() {
        return this.report_day.GetDate();
    }

    public String GetAccountant() {
        return this.accountant;
    }

    public ArrayList<Payment> GetArrayList() {
        return this.payments;
    }

    public int payment_number() {
        return payments.size();
    }

    public String toString() {
        String str = new String();
        str += String.format("Author: %s, Date: %d %d %d, Payments:\n", this.accountant, this.report_day.getDay(), this.report_day.getMonth(), this.report_day.getYear());
        for (Payment payment : payments) {
            str += String.format("Payer: %s,date: %s sum: %d rub. %d pen.\n", payment.getFIO(),
                    payment.getDate_of_payment(), (payment.getSum() / 100), (payment.getSum() % 100));
        }
        return str;
    }
}
