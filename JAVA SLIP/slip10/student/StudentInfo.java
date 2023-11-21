// File: StudentInfo.java
package student;

class StudentInfo 
{
    private String name;
    private int rollno;
    private String studentClass;
    private double percentage;

    public StudentInfo(String name,int rollno, String studentClass, double percentage) 
    {
        this.name=name;
        this.rollno = rollno;
        this.studentClass = studentClass;
        this.percentage = percentage;
    }

    public void displayInfo() 
    {
        System.out.println("Stdnt Name: "+name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Class: " + studentClass);
        System.out.println("Percentage: " + percentage + "%");
    }
}
