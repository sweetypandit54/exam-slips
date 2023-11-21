class Account 
{
    String custname;
    int accno;

    public Account() 
    {
        custname = "";
        accno = 0;
    }

    public Account(String custname, int accno) 
    {
        this.custname = custname;
        this.accno = accno;
    }
}

class SavingAccount extends Account 
{
    double savingbal;
    double minbal;

    public SavingAccount() 
    {
        savingbal = 0.0;
        minbal = 0.0;
    }

    public SavingAccount(String custname, int accno, double savingbal, double minbal) 
    {
        super(custname, accno);
        this.savingbal = savingbal;
        this.minbal = minbal;
    }
}

class AccountDetail extends SavingAccount 
{
    double depositamt;
    double withdrawalamt;

    public AccountDetail(String custname, int accno, double savingbal, double minbal, double depositamt, double withdrawalamt) 
    {
        super(custname, accno, savingbal, minbal);
        this.depositamt = depositamt;
        this.withdrawalamt = withdrawalamt;
    }

    public void displayDetails() 
    {
        System.out.println("Customer Name: " + custname);
        System.out.println("Account Number: " + accno);
        System.out.println("Saving Balance: $" + savingbal);
        System.out.println("Minimum Balance: $" + minbal);
        System.out.println("Deposit Amount: $" + depositamt);
        System.out.println("Withdrawal Amount: $" + withdrawalamt);
    }
}

class Main 
{
    public static void main(String[] args) 
    {
        AccountDetail accountDetails = new AccountDetail("John Doe", 123456, 5000.0, 1000.0, 2000.0, 1500.0);
        accountDetails.displayDetails();
    }
}
