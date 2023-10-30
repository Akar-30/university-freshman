package Freshman;

import java.util.Scanner;

public class School7 {
    public static void input() {
        flow();
        boolean loop = true;
        while (loop){
            Scanner scan = new Scanner(System.in);
            System.out.print("Continue or Exit....");
            String choice = scan.next().toLowerCase();
            switch (choice) {
                case "continue","start":
                    flow();
                    break;
                case "quit","exit":
                    loop=false;
                    break;

            }
        }
    }

    public static void flow() {
        try {
            String[][] arr = dataCollection();
            BMI(arr);
            System.out.println("\nAccording to AHA Your MAXIMUM Heart Rate and Your TARGETED Heart Rate are calculated below:");
            System.out.println("MAXIMUM  Heart Rate:\t" + maxHeartRate(arr));
            System.out.println("TARGETED Heart Rate:\t" + targetRate(maxHeartRate(arr)));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }

    public static String[][] dataCollection() {
        Scanner scan = new Scanner(System.in);

        String[] inputData = {"Full Name", "Gender", "Weight (KG)", "Height (cm)", "Age"};
        String[][] dataARR = new String[2][5];
        for (int i = 0; i < inputData.length; i++) dataARR[0][i] = inputData[i];
        System.out.println("DATA COLLECTION");
        for (int i = 0; i < inputData.length; i++) {
            System.out.println("ENTER your " + inputData[i]);
            try {
                dataARR[1][i] = scan.nextLine();
            } catch (Exception e) {
                System.out.println("An error occurred while reading input: " + e);
            }
        }
        return dataARR;
    }

    public static void BMI(String[][] arr) {
        try {
            float weight = Float.parseFloat(arr[1][2]);
            float height = Float.parseFloat(arr[1][3]);
            float bmi = weight * 10000 / (height * height);
            System.out.println("FULL NAME: " + arr[1][0] + "\nBMI VALUE --> " + bmi);
            System.out.println("\nBMI Values\nUnderweight:\tLess than 18.5\nNormal:\t\t\tBetween 18.5 and 24.9\nOverweight:\t\tBetween 25 and 29.9\nObese:\t\t\t30 or Greater");
            System.out.print("\nYou are in the category of ");
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while calculating BMI: " + e);
        }
    }

    public static int maxHeartRate(String[][] arr) {
        try {
            return 220 - Integer.parseInt(arr[1][4]);
        } catch (Exception e) {
            System.out.println("An error occurred while calculating maximum heart rate: " + e);
            return 0;
        }
    }

    public static String targetRate(int maxRate) {
        try {
            int min = (int) (maxRate * 0.5);
            int max = (int) (maxRate * 0.85);
            return min + " - " + max;
        } catch (Exception e) {
            System.out.println("An error occurred while calculating target heart rate: " + e);
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println("*** USER INPUTS ***");
        Scanner scan = new Scanner(System.in);
        System.out.print("START or QUIT....");
        String choice = scan.next().toLowerCase();
        switch (choice) {
            case "continue", "start":
                input();
                break;
            case "quit", "exit":
                break;
        }



    }
}
