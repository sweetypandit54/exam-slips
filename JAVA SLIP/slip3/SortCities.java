//slip3
import java.util.Scanner;
import java.util.Arrays;

public class SortCities 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cities (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] cities = new String[n];
        System.out.println("Enter the city names:");
        for (int i = 0; i < n; i++) 
            cities[i] = scanner.nextLine();

        Arrays.sort(cities);
        System.out.println("Cities in ascending order:");

        for (String city : cities) 
            System.out.println(city);
        scanner.close();
    }
}
