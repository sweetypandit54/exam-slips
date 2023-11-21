//slip 10
import java.util.*;
interface Operation
{
         double PI=3.142;
         double area();
         double volume();
}
class Cylinder implements Operation
{
       private double r,h;
       
       public Cylinder (double r,double h)
       {
              this.r=r;
              this.h=h;
       }
       public double area()
       {
              return 2*PI*r*(r+h);   
       }
       public double volume()
       {
              return PI*r*h;   
       }
}
public class ops
{
       public static void main (String args[])
       {
              Scanner scan=new Scanner(System.in);
              System.out.println("Enter Radius & Height of Cylinder : ");
              int r=scan.nextInt();
              int h=scan.nextInt();
              Cylinder cy=new Cylinder(r,h);
              System.out.println("Cylinder Area : "+cy.area());
              System.out.println("Cylinder Volume : "+cy.volume());
              scan.close();
       }

}

