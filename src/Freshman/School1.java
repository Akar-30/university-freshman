package Freshman;

import java.util.Scanner;
public class School1 {

    public static void greeting(){
        System.out.println("\t\t*************Welcome to the Calculator Project***********");
    }
    public static int getNumber( String numberName) {
        Scanner input = new Scanner(System.in);
        System.out.print(numberName + ": ");
        return input.nextInt();
    }

    public static char getOperationChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println(" + , - , * , / , % ");
        System.out.print("Select the operation: ");
        return input.next().charAt(0);
    }

    public static int performOperation(int n1, int n2, char choice) {
        int result;
        switch (choice) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            case '%':
                result = n1 % n2;
                break;
            default:
                throw new AssertionError();
        }
        return result;
    }

    public static void displayResult(int n1, int n2, char choice, int result) {
        System.out.println(n1 + " " + choice + " " + n2 + " = " + result);
    }

    public static void main(String[] args) {
        greeting();
        int n1 = getNumber( "number 1");
        int n2 = getNumber( "number 2");
        char choice = getOperationChoice();
        int result = performOperation(n1, n2, choice);
        displayResult(n1, n2, choice, result);
    }

}
