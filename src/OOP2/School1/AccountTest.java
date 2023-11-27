package OOP2.School1;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account a1 = new Account();
        System.out.print("chand para axaita sar 7sabakat:");
        double balance = scan.nextDouble();
        a1.setBalance(balance);
        a1.debt(0);
        System.out.print("chand para dar akayt: ");
        a1.debt(scan.nextDouble());

    }
}
