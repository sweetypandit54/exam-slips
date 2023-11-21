import java.util.Date;
import java.text.SimpleDateFormat;
public class date
{
      public static void main(String arg[])
      {
         Date ct=new Date();
         SimpleDateFormat d1=new SimpleDateFormat("dd/MM/yyyy");
         SimpleDateFormat d2=new SimpleDateFormat("MM-dd-yyyy");
         SimpleDateFormat d3=new SimpleDateFormat("EEEE MMMM-dd yyyy");
         SimpleDateFormat d4=new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy");
         SimpleDateFormat d5=new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
         System.out.println("Current Date is:"+d1.format(ct));
         System.out.println("Current Date is: "+d2.format(ct));
         System.out.println("Current Date is: "+d3.format(ct));
         System.out.println("Current Date and Time is: "+d4.format(ct));
         System.out.println("Current Date and Time is: "+d5.format(ct));
      }
}