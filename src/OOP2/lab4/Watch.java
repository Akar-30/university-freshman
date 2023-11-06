package OOP2.lab4;

import java.util.Scanner;

public class Watch {

    private int second;
    private int minute;
    private int hour;




    public Watch(){
    }
    public Watch(int hour) {
        this ();
        this.hour=hour;
    }public Watch(  int hour,int minute) {
        this ();
        this.minute = minute;
        this.hour=hour;
    }public Watch( int hour,int minute, int second) {
        this.second =second;
        this.minute = minute;
        this.hour=hour;
    }

    public String getTime(){
        return this.hour+":"+ this.minute+":"+ this.second;
    }

    public void setTime(int hour,int minute, int second){
        this.second =second;
        this.minute = minute;
        this.hour=hour;
    }



}
