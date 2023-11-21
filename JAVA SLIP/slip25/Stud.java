//slip22

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    private int rollno;
    private String name;
    private String className;
    private double percentage;

    public Student(int rollno, String name, String className, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.className = className;
        this.percentage = percentage;
    }

    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Stud 
{
    public static void main(String[] args) 
    {
        try 
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Student Information:");
            System.out.print("Roll Number: ");
            int rollno = Integer.parseInt(reader.readLine());
            System.out.print("Name: ");
            String name = reader.readLine();
            System.out.print("Class: ");
            String className = reader.readLine();
            System.out.print("Percentage: ");
            double percentage = Double.parseDouble(reader.readLine());

            Student student = new Student(rollno, name, className, percentage);
            System.out.println("\nStudent Information:");
            student.displayStudentInfo();

        } 
        catch (IOException e) 
        {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}

