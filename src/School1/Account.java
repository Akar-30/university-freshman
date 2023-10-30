package School1;

public class Account {

    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void debt(double withdraw){
        if (withdraw>balance){
            System.out.println("Your account does not match the required withdraw");

        }
        else {
            setBalance(balance-withdraw);
        }
        System.out.println("The remaining balance is: " +getBalance());
    }
}
