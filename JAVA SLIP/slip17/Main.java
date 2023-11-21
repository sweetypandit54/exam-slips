import java.util.Scanner;

// Superclass Customer
class Customer {
    String name;
    String phoneNumber;

    public void readCustomerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber = scanner.nextLine();
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

// Derived class Depositor
class Depositor extends Customer {
    int accountNumber;
    double balance;

    public void readDepositorDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void displayDepositorDetails() {
        displayCustomerDetails(); // Inherited from Customer class
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Derived class Borrower
class Borrower extends Depositor {
    int loanNumber;
    double loanAmount;

    public void readBorrowerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter loan number: ");
        loanNumber = scanner.nextInt();
        System.out.print("Enter loan amount: ");
        loanAmount = scanner.nextDouble();
    }

    public void displayBorrowerDetails() {
        displayDepositorDetails(); // Inherited from Depositor class
        System.out.println("Loan Number: " + loanNumber);
        System.out.println("Loan Amount: $" + loanAmount);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();

        Borrower[] customers = new Borrower[n];

        for (int i = 0; i < n; i++) {
            customers[i] = new Borrower();
            System.out.println("\nEnter details for Customer " + (i + 1) + ":");
            customers[i].readCustomerDetails();
            customers[i].readDepositorDetails();
            customers[i].readBorrowerDetails();
        }

        System.out.println("\nDetails of Customers:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails for Customer " + (i + 1) + ":");
            customers[i].displayBorrowerDetails();
        }
        scanner.close();
    }
}
