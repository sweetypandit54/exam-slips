import java.util.Scanner;
class CovidPositiveException extends Exception 
{
    public CovidPositiveException(String message) 
    {
        super(message);
    }
}

class Patient 
{
    private String patientName;
    private int patientAge;
    private double patientOxyLevel;
    private int patientHRCTReport;

    public Patient(String patientName, int patientAge, double patientOxyLevel, int patientHRCTReport) 
    {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientOxyLevel = patientOxyLevel;
        this.patientHRCTReport = patientHRCTReport;
    }

    public void checkPatientStatus() throws CovidPositiveException 
    {
        if (patientOxyLevel < 95.0 && patientHRCTReport > 10) 
            throw new CovidPositiveException("Patient is Covid Positive(+) and Need to Hospitalized");
        else 
        {
            System.out.println("Patient Information:");
            System.out.println("Name: " + patientName);
            System.out.println("Age: " + patientAge);
            System.out.println("Oxygen Level: " + patientOxyLevel + "%");
            System.out.println("HRCT Report: " + patientHRCTReport);
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();

        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();

        System.out.print("Enter patient oxygen level (%): ");
        double oxygenLevel = scanner.nextDouble();

        System.out.print("Enter patient HRCT report: ");
        int hrctReport = scanner.nextInt();
        scanner.close();

        try 
        {
            Patient patient1 = new Patient(name, age, oxygenLevel, hrctReport);
            patient1.checkPatientStatus();
        } 
        catch (CovidPositiveException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
