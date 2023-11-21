// File: StudentPer.java
package student;

import java.util.Scanner;

class StudentPer 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter Name: ");
        String name = scanner.next(); // assuming name is a single-word input

        System.out.print("Enter Class: ");
        String studentClass = scanner.next();

        System.out.println("Enter marks for 6 subjects:");
        int totalMarks = 0;

        for (int i = 1; i <= 6; i++) 
        {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = (double) totalMarks / 6;
        StudentInfo studentInfo = new StudentInfo(name,rollno, studentClass, percentage);
        System.out.println("\nStudent Information:");
        studentInfo.displayInfo();
        scanner.close();
    }
}
