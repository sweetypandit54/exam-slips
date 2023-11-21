//slip 9,15
import java.util.*;
interface cubefunc
{
    int cube(int n);
}
public class cubefun 
{
    public static void main(String arg[])
    {
        cubefunc cf=(int x)->x*x*x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
         System.out.println("Cube of "+n+"is:"+cf.cube(n));
         sc.close();
    }    
}
