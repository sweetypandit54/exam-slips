//slip 9,15
import java.util.*;
interface squarefunc
{
    int square(int n);
}
public class Squarefun 
{
    public static void main(String arg[])
    {
        squarefunc sf=(int x)->x*x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
         System.out.println("Square of "+n+" is:"+sf.square(n));
         sc.close();
    }    
}
