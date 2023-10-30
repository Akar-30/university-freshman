package Freshman;

import java.util.Scanner;

public class School5 {
    public static void main(String[] args) {
        System.out.println("Welcome to Qatar Airline\n");
        int[] flightSeat = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter passengers' seat number\n");
        int range = flightSeat.length;
        int count = 1;
        for(int i=0;i<range;i++){
            System.out.println("Available seats");
            for (int j=1;j<= flightSeat.length;j++){
                System.out.print("seat "+j+"\t");
            }
            System.out.println();
            for (int k : flightSeat) {
                if (k == 1)
                    System.out.print(" *\t\t");
                else
                    System.out.print("\t\t");
            }
            System.out.println();
            System.out.print(count+". Passenger seat number: ");
            int seat = scan.nextInt();
            if(seat<1 || seat>10){
                System.out.println("Error: unsupported range\nSupported range: (1-10)");
                range++;
            }else if(flightSeat[seat-1]!=0) {
                System.out.println("Error: This seat is already taken");
                range++;
            }
            else{
                System.out.println("seat no. "+count+" registered");
                flightSeat[seat-1]=1;
                count++;
            }

        }



    }
}