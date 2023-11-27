package OOP2.Homework1;

import java.util.Random;

public class Student extends Person{
    Random random = new Random();
    private final int studentId= random.nextInt(0,10000);
    private int grade;
    private final int [] mark= new int[5]; //{17,45,46,9,3}



    public int maxMark(){
        int max = this.mark[0];
        for (int i=0; i<5 ; i++){
            if (this.mark[i]>max){
                max =this.mark[i];
            }
        }
        return max;
    }

    public int minMark(){
        int min = this.mark[0];
        for (int i=0; i<5 ; i++){
            if (this.mark[i]<min){
                min =this.mark[i];
            }
        }
        return min;
    }

    public double average(){
        int sum=0;
        for (int i=0; i<5 ; i++){
            sum+=this.mark[i];
        }
        return sum/5.0;
    }

    public void input(){
        super.input();

        System.out.print("Grade:  ");
        grade = scan.nextInt();
        for(int i=0;i<5; i++){
            inputMark(i);
        }
    }

    private void inputMark(int i){
        System.out.printf("Enter mark %d:  ",i+1);
        int inputMark= scan.nextInt();
        if(inputMark >= 0 && inputMark <= 100){
            mark[i]=inputMark;
        }else{
            System.out.println("Invalid Mark");
            inputMark(i);
        }
    }

    public void display(){
        System.out.println("  ID\t\t Full Name \t  Age\t\t Address\t\t  Grade\t\tAverage Mark\t   Max\t\t   Min");
        for (int i=0;i<8;i++){
            System.out.print("*************");
        }
        System.out.println();
        System.out.print("  "+studentId+"\t\t\t"+super.getFullName()+"\t\t"+getAge()+"\t\t"+getAddress()+"\t\t"+grade+"\t\t"+average()+"\t\t"+maxMark()+"\t\t"+minMark());
    }


}
