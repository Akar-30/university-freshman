package OOP2.Employee;

public class EmployeeTEst {

    public static void displayYearlySalary (Employee e1,Employee e2){
        System.out.println("Name\t\t\t\t\tSalary\n----\t\t\t\t\t----------------");
        System.out.println(e1.getfName()+" "+e1.getlName()+"\t\t\t"+"$"+e1.getSalary()*12);
        System.out.println(e2.getfName()+" "+e2.getlName()+"\t\t\t"+"$"+e2.getSalary()*12);
    }

    public static void raisedDisplayYearlySalary (Employee e1,Employee e2){
        System.out.println("10 percent salary is Raised!! Yoohoooo!!");
        System.out.println("Name\t\t\t\t\tSalary\n----\t\t\t\t\t----------------");
        System.out.println(e1.getfName()+" "+e1.getlName()+"\t\t\t"+"$"+e1.getSalary()*12*11.0/10);
        System.out.println(e2.getfName()+" "+e2.getlName()+"\t\t\t"+"$"+e2.getSalary()*12*11.0/10);
    }

    public static void main(String[] args) {
        Employee yusra =new Employee("Yusra","Muhammed",20000.0/12);
        Employee peshang =new Employee("Peshang","Muhammed",50000.0/12);
        displayYearlySalary(yusra,peshang);
        raisedDisplayYearlySalary(yusra,peshang);

    }
}


