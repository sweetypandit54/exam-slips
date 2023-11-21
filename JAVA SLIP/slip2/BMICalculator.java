//slip 2
public class BMICalculator 
{
    public static void main(String[] args) 
    {
        if (args.length != 4) 
        {
            System.out.println("Please provide First Name, Last Name, weight, and height as command line arguments.");
            return;
        }
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        double bmi = calculateBMI(weight, height);

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " meters");
        System.out.println("BMI: " + bmi);
    }

    // Function to calculate BMI
    public static double calculateBMI(double weight, double height) 
    {     
        return weight / (height * height);
    }
}
