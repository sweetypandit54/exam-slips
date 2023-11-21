import sy.SYMarks;
import ty.TYMarks;

class Student {
    public int rollNumber;
    public String name;
    public SYMarks syMarks;
    public TYMarks tyMarks;

    public Student(int rollNumber, String name, SYMarks syMarks, TYMarks tyMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public int calculateTotalMarks() {
        return (syMarks.ComputerTotal + syMarks.MathsTotal + syMarks.ElectronicsTotal +
               tyMarks.Theory + tyMarks.Practicals)/5;
    }

    public char calculateGrade() {
        int totalMarks = calculateTotalMarks();

        if (totalMarks >= 70) 
            return 'A';
         else if (totalMarks >= 60) 
            return 'B';
         else if (totalMarks >= 50) 
            return 'C';
         else if (totalMarks >= 40) 
            return 'D';
         else 
            return 'F';
        
    }

    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        SYMarks syMarks = new SYMarks(5, 9, 75);
        TYMarks tyMarks = new TYMarks(15, 70);
        Student student = new Student(123, "John Doe", syMarks, tyMarks);

        student.displayResult();
    }
}
/*
 Compile and Run:
Compile all the Java files using the appropriate package directory structure. For example:

javac sy/SYMarks.java
javac ty/TYMarks.java
javac Student.java

Then run the Student class:

java Student
 */