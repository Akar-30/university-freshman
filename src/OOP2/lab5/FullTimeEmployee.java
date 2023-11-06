package OOP2.lab5;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{

    private double yearlySalary;

    public void setYearlySalary(double monthlySalary) {
        yearlySalary = monthlySalary*12;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.println("Monthly Salary:");
        double salary = scan.nextDouble();
        setYearlySalary(salary);

    }

    public void display(){
        super.display();
        System.out.println(id/2+"\t\t"+getName() + "\t\t" + getAge() + "\t\t" + getYearlySalary());
    }
}
