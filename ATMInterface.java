import java.util.Scanner;

class User {
    private double accountBalance = 1000.00;
    private int pin = 1122; 

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("$" + amount + " has been deposited into your account.");
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("$" + amount + " has been withdrawn from your account.");
        } else {
            System.out.println("Insufficient funds or invalid amount. Please try again.");
        }
    }

    public boolean checkPIN(int enteredPIN) {
        return enteredPIN == pin;
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        int choice;
        int enteredPIN;
        boolean authenticated = false;

        System.out.print("Enter your PIN: ");
        enteredPIN = sc.nextInt();
        authenticated = user.checkPIN(enteredPIN);

        if (!authenticated) {
            System.out.println("Invalid PIN. Exiting...");
            sc.close();
            return;
        }

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(user);
                    break;
                case 2:
                    depositMoney(user, sc);
                    break;
                case 3:
                    withdrawMoney(user, sc);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.out.println("Visit again");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        sc.close();
    }

    public static void displayMenu() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Welcome to ATM!");
        System.out.println("1. Balance enquiry");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public static void checkBalance(User user) {
        System.out.println("Your account balance is: $" + user.getAccountBalance());
    }

    public static void depositMoney(User user, Scanner sc) {
        System.out.print("Enter the deposit amount: $");
        double depositAmount = sc.nextDouble();
        user.deposit(depositAmount);
    }

    public static void withdrawMoney(User user, Scanner sc) {
        
        System.out.print("Enter the withdrawal amount: $");
        double withdrawalAmount = sc.nextDouble();
        user.withdraw(withdrawalAmount);
        System.out.println("Please collect your Money!");
    }
}
