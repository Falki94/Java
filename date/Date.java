package date;

import java.text.SimpleDateFormat;

/**
 *
 * @author Falki
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {

        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 || day < 32) {
            this.day = day;
        } else {
            System.out.println("Day out of range");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 || month < 13) {
            this.month = month;
        } else {
            System.out.println("Month out of range");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900 && year < 9999) {
            this.year = year;
        } else {
            System.out.println("Year out of range");
        }
    }

    public void setDate(int day, int month, int year) {
        this.setDay(day);

    }

    public String toString() {
        return String.format("%02d", this.getDay()) + "/" + String.format("%02d",this.getMonth()) + "/" + this.getYear();
    }
}
