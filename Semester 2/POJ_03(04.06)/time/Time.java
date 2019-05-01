/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Falki
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 || hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Incorrect time format");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 || minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Incorrect time format");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 || second < 60) {
            this.second = second;
        } else {
            System.out.println("Incorrect time format");
        }
    }

    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public Time nextSecond() {
        if (second==59){
            this.second=0;
            if (minute==59){
                this.minute=0;
                if (hour==23){
                    this.hour=0;
                }
            }
        }
        else{
            this.second++;
        }
        return this;
    }

    public Time previousSecond() {
        if (second == 0){
            this.second=59;
            if (minute==0){
                this.minute=59;
                if (hour==0){
                    this.hour=23;
                }
            }
        }
        else{
            this.second--;
        }
        return this;
    }
    
    
    public String toString(){
        return String.format("%02d",this.getHour()) + ":" + String.format("%02d", this.getMinute()) + ":" + String.format("%02d", this.getSecond()); 
    }
}
