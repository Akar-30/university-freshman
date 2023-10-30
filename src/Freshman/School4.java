package Freshman;

import java.util.Scanner;
public class School4{
    public static void main(String [] args){
        //Creating an Array to store the Numbers entered by the user
        int [] gradeArr =new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 Grades");
        int range = gradeArr.length;
        int count = 1;
        //Rising Error while the user enter numbers smaller than 0 and greater than 100
        for (int i = 0; i< range; i++){
            System.out.print("Student no."+count+" Grade: ");
            int tmp =scan.nextInt();
            if(tmp<0 || tmp>100){
                System.out.println("Error: unsupported range\nSupported range: (0-100)");
                range++;
            }else {
                System.out.println("Grade "+count+" registered");
                gradeArr[count-1]=tmp;
                count++;
            }

        }


        //Class Average
        float total=0;
        for (int i : gradeArr){
            total+=i;
        }


        // Lowest and Highest Mark
        int minValue = gradeArr[0];
        int maxValue = gradeArr[0];
        for (int value : gradeArr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        for (int k : gradeArr) {
            if (minValue > k) {
                minValue = k;
            }
        }


        //Counting grades above and below 60
        int countAbove60=0;
        int countBelow60=0;
        for (int i:gradeArr){
            if (i>=60){
                countAbove60++;
            }else{
                countBelow60++;
            }
        }

        // Class attributes
        boolean repeat=true;
        System.out.println("Class Attributes");
        while (repeat){
            System.out.println("Class Average\tLowest Mark\t\tHighest Mark\tClass Distribution\t Quit\n" +
                    "Press 1\t\t\tPress 2\t\t\tPress 3\t\t\tPress 4\t\t\t\tPress 0");
            int option=scan.nextInt();

            switch (option) {
                case 1 -> System.out.println("\nThe Average is: " + total / gradeArr.length+"\n");
                case 2 -> System.out.println("\nLowest mark is: " + minValue+"\n");
                case 3 -> System.out.println("\nHighest mark is: " + maxValue+"\n");
                case 4 -> System.out.println("\n" + countAbove60 + " student are above 60\n" + countBelow60 + " student are below 60\n");
                case 0 -> repeat = false;
                default -> System.out.println("Error: index out of boundaries");
            }
        }


        //Updating the grades by 3 and show the new values
        int gradeAdd= (int) ((maxValue-total/gradeArr.length)/10)+1;
        System.out.println("\nDo you want to add Extra Mark ("+gradeAdd+") to each student\nY -> yes\nN -> No");
        String opt = scan.next();
        if (opt.equals("y") || opt.equals("Y")){
            for (int i=0;i<gradeArr.length;i++){
                if (gradeArr[i]<101-gradeAdd)
                    gradeArr[i]+=gradeAdd;
                else
                    gradeArr[i]=100;
            }
            System.out.println("The grades have been updated by "+gradeAdd);
            for (int i:gradeArr){
                System.out.println(i);
            }
        }
        else
            System.out.println("The Mark is not updated");




        //Grade Distribution
        System.out.println("\nGrade Distribution");
        for (int i=0;i< 11;i++){
            if (i==0){
                System.out.print("00-09: ");
            } else if (i<10) {
                System.out.print(10*i+"-"+(10*i+9)+": ");
            }else{
                System.out.print("  100: ");
            }
            for (int k : gradeArr) {
                if (k < i * 10 + 10 && k >= i * 10) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}