package org.example;

public class Payment {
    private String FIO;
    private Data date_of_payment;
    private int sum;

    Payment(String FIO, int payday, int pay_month, int pay_year, int sum) {
        if (sum < 0) {
            throw new IllegalArgumentException("It can't be negative sum");
        }
        this.FIO = new String(FIO);
        this.date_of_payment = new Data(payday, pay_month, pay_year);
        this.sum = sum;
    }

    Payment() {
        this.FIO = new String("Иван Иванов Иванович");
        this.date_of_payment = new Data();
        this.sum = 0;
    }

    Payment(Payment copy) {
        this.FIO = new String(copy.FIO);
        this.date_of_payment = new Data(copy.date_of_payment.getDay(), copy.date_of_payment.getMonth(), copy.date_of_payment.getYear());
        this.sum = copy.getSum();
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getDate_of_payment() {
        return String.format("%d.%d.%d", date_of_payment.getDay(), date_of_payment.getMonth(), date_of_payment.getYear());
    }

    public Data getDate() {
        return this.date_of_payment;
    }

    public void setDate_of_payment(Data date_of_payment) {
        this.date_of_payment = date_of_payment;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if (sum < 0) {
            throw new IllegalArgumentException("It can't be negative sum");
        }
        this.sum = sum;
    }

    public boolean equals(Payment payment) {
        return payment.FIO.equals(this.FIO) && payment.date_of_payment.equality(this.date_of_payment) && payment.sum == this.sum;
    }

    public int hashCode() {
        int result = this.FIO.hashCode();
        result += this.date_of_payment.hashCode();
        result += this.sum;
        return result;
    }

    public String toString() {
        String str = new String();
        str += this.FIO;
        str += " ";
        str += this.date_of_payment.getDay();
        str += ".";
        str += this.date_of_payment.getMonth();
        str += ".";
        str += this.date_of_payment.getYear();
        str += " ";
        str += this.sum;
        return str;
    }
}