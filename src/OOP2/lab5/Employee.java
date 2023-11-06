package OOP2.lab5;

import java.util.Scanner;

public class Employee {
    private static int nextId=1;
    final int id;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Employee(){
        this.id=nextId++;
    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        String name = scan.next();
        setName(name);
        System.out.println("Age:");
        int age = scan.nextInt();
        setAge(age);
    }

    public void display(){
    }
}
