package OOP2.Employee;

public class Employee {
    private String fName;
    private String lName;
    private double salary;

    public Employee(
        String fName,
        String lName,

        double salary){

        this.fName = fName;
        this.lName = lName;
        if (salary<=0){
            return;
        }
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            return;
        }
        this.salary = salary;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

}
