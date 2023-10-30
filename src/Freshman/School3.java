package Freshman;

import java.util.Scanner;
public class School3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1: Start\n0: Exit");
        int condition = scan.nextInt();
        System.out.println("Your choice: "+condition);
        if (condition==1){
            do {
                System.out.print("To Sketch Rectangle Press 1\n          Triangle  Press 2\n-->");
                condition = scan.nextInt();
                if (condition==1){

                    System.out.println("Enter a length and width of a rectangle");
                    System.out.print("Enter length: ");
                    int length = scan.nextInt();
                    System.out.print("Enter width: ");
                    int width = scan.nextInt();
                    for (int i=1;i<=width;i++){
                        System.out.print("* ");
                        for(int j=0;j<length-2;j++){
                            if (i==1 || i==width){
                                System.out.print("* ");
                            }else{
                                System.out.print("  ");
                            }
                        }
                        System.out.print("*");
                        System.out.println();
                    }
                    System.out.println();

                    System.out.println("1: Continue\n0: Exit");
                    condition =scan.nextInt();
                    System.out.println("Your choice: "+condition);

                }
                else if(condition==2){

                    System.out.println("Enter side a and b of the Triangle");
                    System.out.print("Enter side a: ");
                    int length = scan.nextInt();
                    System.out.print("Enter side b: ");
                    int width = scan.nextInt();
                    for (int i=1;i<=width;i++){
                        for(int j=0;j<i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    System.out.println("1: Continue\n0: Exit");
                    condition =scan.nextInt();
                    System.out.println("Your choice: "+condition);

                }
            }while (condition==1);
        }



    }
}
