package week3task2;

public class Date {
    int Day;
    int Month;
    int Year;

    Date(int Day,int Month,int Year){
        this.Day=Day;
        this.Month=Month;
        this.Year=Year;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }
    public String toString() {
        return String.format("%02d/%02d/%04d", Day, Month, Year);
    }
}
