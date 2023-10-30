package Freshman;

import java.util.Scanner;

public class School8 {
    public static void input() {
        flow();
        boolean loop = true;
        while (loop) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Continue or Exit....");
            String choice = scan.next().toLowerCase();
            switch (choice) {
                case "continue", "start" -> flow();
                case "quit", "exit" -> loop = false;
                default -> System.out.println("The data you entered was incorrect. Please enter a valid option.");
            }
        }
    }

    public static void flow() {
        try {
            String[][] arr = dataCollection();
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an option:\n1. BMI value\n2. AHA Heart Rate values");
            int option = scan.nextInt();
            switch (option) {
                case 1 -> {
                    printTable(arr, 1);
                    BMI(arr);
                }
                case 2 -> {
                    printTable(arr, 2);
                    System.out.println("\nAccording to AHA Your MAXIMUM Heart Rate and Your TARGETED Heart Rate are calculated below:");
                    System.out.println("MAXIMUM  Heart Rate:\t" + maxHeartRate(arr));
                    System.out.println("TARGETED Heart Rate:\t" + targetRate(maxHeartRate(arr)));
                }
                default -> System.out.println("Invalid option selected.");
            }
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

    public static void printTable(String[][] arr, int option) {
        System.out.println("User Data:");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i] + ": " + arr[1][i]);
        }
        System.out.println();
        if (option == 1) {
            System.out.println("BMI Value:");
        } else if (option == 2) {
            System.out.println("AHA Heart Rate Values:");
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        System.out.println("*** USER INPUTS ***");
        Scanner scan = new Scanner(System.in);
        System.out.println("START or QUIT....");
        String choice = scan.next().toLowerCase();
        switch (choice) {
            case "continue":
            case "start":
                input();
                break;
            case "quit":
            case "exit":
                break;
            default:
                System.out.println("The data you entered was incorrect. Please enter a valid option.");
        }
    }
}
