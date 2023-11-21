//slip1

public class PrimeNumbersInArray 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int[] array = new int[n];

        for (int i = 1; i <= n; i++) 
            array[i - 1] = Integer.parseInt(args[i]);

        System.out.println("Prime numbers in the array:");

        for (int num : array)    
            if (isPrime(num)) 
                System.out.print(num + " ");
    }

    public static boolean isPrime(int num) 
    {
        if (num <= 1) 
            return false;
        if (num <= 3) 
            return true;
        if (num % 2 == 0 || num % 3 == 0) 
            return false;

        for (int i = 5; i * i <= num; i += 6) 
            if (num % i == 0 || num % (i + 2) == 0) 
                return false;
        return true;
    }
}
