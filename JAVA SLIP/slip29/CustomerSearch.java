import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer 
{
    private int custno;
    private String custname;
    private String contactnumber;
    private String custaddr;

    public Customer(int custno, String custname, String contactnumber, String custaddr) 
    {
        this.custno = custno;
        this.custname = custname;
        this.contactnumber = contactnumber;
        this.custaddr = custaddr;
    }

    public int getCustno() 
    {
        return custno;
    }

    public String getContactnumber() 
    {
        return contactnumber;
    }

    public void displayDetails() 
    {
        System.out.println("Customer Details:");
        System.out.println("Customer Number: " + custno);
        System.out.println("Customer Name: " + custname);
        System.out.println("Contact Number: " + contactnumber);
        System.out.println("Customer Address: " + custaddr);
    }
}

public class CustomerSearch 
{
    private List<Customer> customers;

    public CustomerSearch() 
    {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) 
    {
        customers.add(customer);
    }

    public Customer searchCustomerByContactNumber(String contactNumber) 
    {
        for (Customer customer : customers) 
        {
            if (customer.getContactnumber().equals(contactNumber)) 
                return customer;
        }
        return null;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        CustomerSearch customerSearch = new CustomerSearch();
        customerSearch.addCustomer(new Customer(1, "John Doe", "1234567890", "123 Main St"));
        customerSearch.addCustomer(new Customer(2, "Jane Smith", "9876543210", "456 Oak St"));
        System.out.print("Enter Contact Number to search for customer: ");
        String searchContactNumber = scanner.next();

        Customer foundCustomer = customerSearch.searchCustomerByContactNumber(searchContactNumber);

        if (foundCustomer != null) 
            foundCustomer.displayDetails();
        else 
            System.out.println("Customer not found with the given contact number.");
        scanner.close();
    }
}
