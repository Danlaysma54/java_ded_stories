import java.util.ArrayList;
import java.util.Locale;

public class Data {
    private int Day;
    private String Month = new String();
    private int Year;

    Data() {
        this.Day = 1;
        this.Month = "January";
        this.Year = 1970;
    }

    Data(int Day, String Month, int Year) {
        if ((Month.toLowerCase().equals("april") || Month.toLowerCase().equals("june") || Month.toLowerCase().equals("september") || Month.toLowerCase().equals("november")) && Day > 30) {
            throw new IllegalArgumentException("In that month can't be more than 30 days");
        }
        if ((Month.toLowerCase().equals("february") && Year % 4 == 0 && Day > 29) || (Month.toLowerCase().equals("february") && Year % 4 != 0 && Day > 28)) {
            throw new IllegalArgumentException("In that month can't be more than 28 or 29 days");
        }
        if (Day > 31) {
            throw new IllegalArgumentException("It can't be more than 31 days");
        }
        if (Year <1970)
        {
            throw new IllegalArgumentException("It can't be less than 1970");
        }
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    Data(int Day, int Month, int Year) {
        if (Day > 31) {
            throw new IllegalArgumentException("It can't be more than 31 days");
        }
        if (Month > 12 || Month < 1) {
            throw new IllegalArgumentException("It can be negative number of month ot more than 12");
        }
        String[] Months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        this.Month = Months[Month - 1];
        if ((this.Month.toLowerCase().equals("april") || this.Month.toLowerCase().equals("june") || this.Month.toLowerCase().equals("september") || this.Month.toLowerCase().equals("november")) && Day > 30) {
            throw new IllegalArgumentException("In that month can't be more than 30 days");
        }
        if ((this.Month.toLowerCase().equals("february") && Year % 4 == 0 && Day > 29) || (this.Month.toLowerCase().equals("february") && Year % 4 == 1 && Day > 28)) {
            throw new IllegalArgumentException("In that month can't be more than 28 or 29 days");
        }
        if (Year <1970)
        {
            throw new IllegalArgumentException("It can't be less than 1970");
        }
        this.Day = Day;
        this.Year = Year;
    }

    public int getDay() {
        return this.Day;
    }

    public String getMonth() {
        return this.Month;
    }

    public int getYear() {
        return this.Year;
    }

    public void setDay(int Day) {
        if ((this.Month.toLowerCase().equals("april") || this.Month.toLowerCase().equals("june") || this.Month.toLowerCase().equals("september") || this.Month.toLowerCase().equals("november")) && Day > 30) {
            throw new IllegalArgumentException("In that month can't be more than 30 days");
        }
        if ((this.Month.toLowerCase().equals("february") && ((Year % 4) != 0) && Day > 28)) {
            throw new IllegalArgumentException("In that month can't be more than 28 days");
        }
        if ((this.Month.toLowerCase().equals("february") && ((Year % 4) == 0) && Day > 29)) {
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

    public void SetMonth(String Month) {
        if ((this.Day > 28 && Month.toLowerCase().equals("february") && (this.Year % 4) != 0) || (this.Day > 29 && Month.toLowerCase().equals("february"))
                || (this.Day > 30 && (Month.toLowerCase().equals("april") || Month.toLowerCase().equals("june") || Month.toLowerCase().equals("september")
                || Month.toLowerCase().equals("november")))) {
            throw new IllegalStateException("In this month can't be that number of days");
        }
        this.Month = Month;
    }

    public void SetYear(int Year) {
        if ((this.Month.toLowerCase().equals("february") && Year % 4 == 1 && Day > 28)) {
            throw new IllegalArgumentException("In this year can't be more than 28 days in February");
        }
        if (Year < 1970) {
            throw new IllegalArgumentException("It can't be less than 1970");
        }
        this.Year = Year;
    }

    public boolean equality(Data data) {
        if (this.Day == data.Day && this.Year == data.Year && this.Month.equals(data.Month)) {
            return true;
        } else {
            return false;
        }
    }
}

class Human {
    private String Name = new String();
    private String Surname = new String();
    private String Middle_Name = new String();
    private Data birth;

    Human() {
        this.Surname = new String("Иванов");
        this.Name = new String("Иван");
        this.Middle_Name = new String("Иванович");
        this.birth = new Data();
    }

    Human(Data date, String Name, String Surname, String Middle_Name) {
        this.birth = new Data(date.getDay(), date.getMonth(), (date.getYear()));
        this.Surname = new String(Surname);
        this.Name = new String(Name);
        this.Middle_Name = new String(Middle_Name);
    }

    public String GetName() {
        return this.Name;
    }

    public String GetSurname() {
        return this.Surname;
    }

    public String GetMiddle_Name() {
        return this.Middle_Name;
    }

    public Data getData() {
        return birth;
    }
}

class HumanService {
    public Human[] NumbOver18(Human[] students, Data current) {
        String[] Months = new String[]{"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int current_Month = 0;
        int students_Month[] = new int[students.length];
        int numb = 0;
        ArrayList<Human> adults_1 = new ArrayList<Human>();
        for (int i = 0; i < students.length; i++) {
            for (int n = 0; n < 11; n++) {
                if (students[i].getData().getMonth().toLowerCase().equals(Months[n]))
                    students_Month[i] = n;
                if (current.getMonth().toLowerCase().equals(Months[n]))
                    current_Month = n;
            }
        }
        for (int i = 0; i < students.length; i++) {
            if ((current.getYear() - students[i].getData().getYear()) > 18) {
                adults_1.add(students[i]);
            }
            if (current.getYear() - students[i].getData().getYear() == 18) {
                if (students_Month[i] < current_Month) {
                    adults_1.add(students[i]);
                }
                if (current.getMonth().toLowerCase().equals(students[i].getData().getMonth().toLowerCase())) {
                    if (current.getDay() <= students[i].getData().getDay()) {
                        adults_1.add(students[i]);
                    }
                }
            }
        }
        Human[] adults = new Human[adults_1.size()];
        for (int i = 0; i < adults.length; i++) {
            adults[i] = adults_1.get(i);
        }
        return adults;
    }

    public int[] age(Human[] students, Data current) {
        String[] Months = new String[]{"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int[] age = new int[students.length];
        int current_Month = 0;
        int[] students_Month = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            for (int n = 0; n < 11; n++) {
                if (students[i].getData().getMonth().toLowerCase().equals(Months[n]))
                    students_Month[i] = n;
                if (current.getMonth().toLowerCase().equals(Months[n]))
                    current_Month = n;
            }
            if (students_Month[i] < current_Month)
                age[i] = current.getYear() - students[i].getData().getYear();
            if (students_Month[i] > current_Month)
                age[i] = current.getYear() - students[i].getData().getYear() - 1;
            if (current.getMonth().equals(students[i].getData().getMonth())) {
                if (students[i].getData().getDay() <= current.getDay())
                    age[i] = current.getYear() - students[i].getData().getYear();
                else
                    age[i] = current.getYear() - students[i].getData().getYear() - 1;
            }
        }
        return age;
    }
}
