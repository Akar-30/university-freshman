package OOP2.lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest {


    public static void add(ArrayList<Employee> employees){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Part time Employee\n2. Full Time Employee");
        int option = scan.nextInt();
        Employee e =new Employee();
        switch (option){
            case 1 ->{
                e = new PartTimeEmployee();
                e.input();
            }
            case 2 ->{
                e = new FullTimeEmployee();
                e.input();
            }
            default -> System.out.println("wrong choice");
        }
        employees.add(e);
    }

    public static void view(ArrayList<Employee> employees){
        System.out.println("ID\t\tName\t\tAge\t\tSalary\n**\t\t****\t\t***\t\t******");
        for (Employee e : employees) {
            e.display();
            System.out.println("**\t\t****\t\t***\t\t******");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("1. Add\n2. View");
        int option = scan.nextInt();
        while (option!=-1){
            switch (option){
                case 1 -> add(employees);
                case 2 -> view(employees);
                default -> System.out.println("Sorry, Wrong Choice");
            }
            System.out.println("\n\n1. Add\n2. View");
            option = scan.nextInt();
        }


    }
}
