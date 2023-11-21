public class Employee
{
    private int id;
    private String name;
    private String deptname;
    private double salary;
    private static int objcount=0;
    
    public Employee(int id,String name,String deptname,double salary)
    {
         this.id=id;
         this.name=name;
         this.deptname=deptname;
         this.salary=salary;
         objcount++;
    }
    
    public static int getobjcount()
    {
          return objcount;
    }
    
    public void display()
    {
       System.out.println("ID: "+id); 
       System.out.println("Name: "+name);
       System.out.println("Department: "+deptname);
       System.out.println("Salary: "+salary);        
    }
    public static void main(String[] args)
    {
         Employee emp1=new Employee(1,"abc","CS",50000);
         System.out.println("Object count after emp1 is: "+Employee.getobjcount());
         emp1.display(); 
         System.out.println();
         Employee emp2=new Employee(2,"xyz","Biotech",75000);
         System.out.println("Object count after emp2 is: "+Employee.getobjcount());
         emp2.display();  
    }
     
}