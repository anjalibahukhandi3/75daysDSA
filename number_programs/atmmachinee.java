import java.util.Scanner;

public class atmmachinee {
    private float balance;
    private int PIN = 5674;
    
    public void checkpin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (PIN == enteredpin) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
        sc.close();
    }
    
    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            System.out.println("Thank you for using ATM Machine.");
            return;
        } else {
            System.out.println("Enter a valid choice");
            menu();
        }
        sc.close();
    }
    
    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }
    
    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Money Withdrawal Successful");
        }
        sc.close();
        menu();
    }
    
    public void depositMoney() {
        System.out.println("Enter the Amount to Deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposit Successful");
        sc.close();
        menu();
    }

    public static void main(String[] args) {
        atmmachinee obj = new atmmachinee();
        obj.checkpin();
    }
}
