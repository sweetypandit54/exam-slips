//package Java_slips sem5.slip1;
import java.util.*;
abstract class Staff
{
        protected int id;
        protected String name;
        
        public Staff(int id,String name)
        {
              this.id=id;
              this.name=name;
        }
        public abstract void display();
}

class OfficeStaff extends Staff
{
      private String dept;
      public OfficeStaff(int id,String name,String dept)
      {
             super(id,name);
             this.dept=dept;
      }
      public void display()
      {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Dept.: "+dept);
      }
}      
public class Staffs
{
       public static void main(String[] args)
       {
               //System.out.println("");
               Scanner scan=new Scanner(System.in);
               System.out.println("Enter number of Staff members ");
               int n=scan.nextInt();
               OfficeStaff[] ofs=new OfficeStaff[n];
               for (int i=0;i<n;i++)
               {
                    System.out.println("Enter Staff "+(i+1)+" ID: ");
                    int id=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Staff "+(i+1)+" Name: ");
                    String name=scan.nextLine();
                    
                    System.out.println("Enter Department Name: ");
                    String dept=scan.nextLine();
                    ofs[i]=new OfficeStaff(id,name,dept);
               }
               for (int i=0;i<n;i++)
               {
                    ofs[i].display();
                    System.out.println();
               }
               scan.close();
       }
}

