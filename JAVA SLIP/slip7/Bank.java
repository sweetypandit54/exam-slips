import java.util.Scanner;

public class Bank 
{
    private double balance;

    public Bank(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            printBalance();
        } else {
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            printBalance();
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please withdraw a positive amount.");
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    private void printBalance() 
    {
        System.out.println("Current Balance: $" + balance);
    }

    public void displayMenu() 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);
                    break;
                case 3:
                    printBalance();
                    break;
                case 4:
                    System.out.println("Exiting the menu. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            scanner.close();
        } while (choice != 4);
    }

    public static void main(String[] args) 
    {
        Bank myAccount = new Bank(1000.0);
        myAccount.displayMenu();
    }
}
