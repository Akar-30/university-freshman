package OOP2.Homework2;
import java.util.Scanner;
public class Person {
    Scanner scan = new Scanner(System.in);
    private String fullName;
    private String address;
    private int age;

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getFullName() {
        return fullName;
    }

    public void input() {
        System.out.println("Student Information");
        System.out.print("Full Name:  ");
        fullName = scan.nextLine();
        System.out.print("Address:  ");
        address = scan.nextLine();
        System.out.print("Age:  ");
        inputAge();
    }

    private void inputAge(){
        int inputAge= scan.nextInt();
        if(inputAge>0) {
            age = inputAge;
        }else{
            System.out.println("invalid age");
            System.out.print("Age:  ");
            inputAge();
        }
    }



}
