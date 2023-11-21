//slip7
import java.util.Scanner;
public class Sphere
{
     public static void main(String a[])
     {    
      Scanner scan=new Scanner(System.in);
      System.out.print(" Enter the Radius: ");
      int r=scan.nextInt();
      double Sarea=(4*Math.PI*(r*r));
      double Vol=(4/3)*Math.PI*(r*r*r);
      System.out.println("Surface Area of Sphere is:"+Sarea);
      System.out.println("Volume of Sphere is:"+Vol);
      scan.close();
     } 
}
