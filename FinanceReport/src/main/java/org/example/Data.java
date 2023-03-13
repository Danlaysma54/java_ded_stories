package org.example;

public class Data {
    private int Day;
    private int Month;
    private int Year;

    Data() {
        this.Day = 1;
        this.Month = 1;
        this.Year = 1970;
    }

    Data(int Day, int Month, int Year) {
        if ((Month == 4 || Month == 6 || Month == 9 || Month == 11) && Day > 30) {
            throw new IllegalArgumentException("In that month can't be more than 30 days");
        }
        if ((Month == 2 && Year % 4 == 0 && Day > 29) || (Month == 2 && Year % 4 != 0 && Day > 28)) {
            throw new IllegalArgumentException("In that month can't be more than 28 or 29 days");
        }
        if (Day > 31) {
            throw new IllegalArgumentException("It can't be more than 31 days");
        }
        if (Year < 1970) {
            throw new IllegalArgumentException("It can't be less than 1970");
        }
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public int getDay() {
        return this.Day;
    }

    public int getMonth() {
        return this.Month;
    }

    public int getYear() {
        return this.Year;
    }

    public void setDay(int Day) {
        if ((this.Month == 4 || this.Month == 6 || this.Month == 9 || this.Month == 11 && Day > 30)) {
            throw new IllegalArgumentException("In that month can't be more than 30 days");
        }
        if ((this.Month == 2 && ((Year % 4) != 0) && Day > 28)) {
            throw new IllegalArgumentException("In that month can't be more than 28 days");
        }
        if ((this.Month == 2 && ((Year % 4) == 0) && Day > 29)) {
            throw new IllegalArgumentException("In that month can't be more than 29 days");
        }
        if (Day > 31) {
            throw new IllegalArgumentException("It can't be more than 31 days in month");
        }
        if (Day < 1) {
            throw new IllegalArgumentException("Day can't be less than 1");
        }
        this.Day = Day;
    }

    public void SetMonth(int Month) {
        if ((this.Day > 28 && Month == 2 && (this.Year % 4) != 0) || (this.Day > 29 && Month == 2)
                || (this.Day > 30 && (Month == 4 || Month == 6 || Month == 9
                || Month == 11))) {
            throw new IllegalStateException("In this month can't be that number of days");
        }
        this.Month = Month;
    }

    public void SetYear(int Year) {
        if ((this.Month == 2 && Year % 4 == 1 && Day > 28)) {
            throw new IllegalArgumentException("In this year can't be more than 28 days in February");
        }
        if (Year < 1970) {
            throw new IllegalArgumentException("It can't be less than 1970");
        }
        this.Year = Year;
    }

    public String GetDate() {
        String Date = new String();
        Date += this.Day;
        Date += ".";
        Date += this.Month;
        Date += ".";
        Date += this.Year;
        return Date;
    }

    public boolean equality(Data data) {
        return (this.Day == data.Day && this.Year == data.Year && this.Month == data.Month);
    }
}
