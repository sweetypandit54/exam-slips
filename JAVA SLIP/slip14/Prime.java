//slip 13

import java.util.Scanner;

class NumberIsZeroException extends Exception 
{
    public NumberIsZeroException() 
    {
        super("Number is 0");
    }
}

public class Prime 
{
    public static boolean isPrime(int number) 
    {
        if (number <= 1) 
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        try 
        {
            if (number == 0) 
                throw new NumberIsZeroException();
            else 
            {
                boolean isPrime = isPrime(number);
                if (isPrime) 
                    System.out.println(number + " is a prime number.");
                else 
                    System.out.println(number + " is not a prime number.");  
            }
        } 
        catch (NumberIsZeroException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
        
    }
}
