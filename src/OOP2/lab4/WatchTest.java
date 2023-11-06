package OOP2.lab4;

import java.util.Scanner;

public class WatchTest {

    public static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Set the following:");

        System.out.print("hour:...");
        int hour = scan.nextInt();
        System.out.print("minute:...");
        int minute = scan.nextInt();
        System.out.print("second:...");
        int second = scan.nextInt();

        if(hour>=24 || hour<0){
            hour=0;
        }
        if(minute>=60 || minute<0){
            minute=0;
        }
        if(second>=60 || second<0){
            second=0;
        }

        Watch watch = new Watch();

        watch.setTime(hour,minute,second);

        System.out.println(watch.getTime());
    }

    public static void main(String[] args) {
        Watch watch1 = new Watch();
        Watch watch2 = new Watch(12);
        Watch watch3 = new Watch(12,3);
        Watch watch4 = new Watch(12,10,2);

        System.out.println(watch1.getTime());
        System.out.println(watch2.getTime());
        System.out.println(watch3.getTime());
        System.out.println(watch4.getTime());

        input();
    }
}
