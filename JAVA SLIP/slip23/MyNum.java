//slip 20
public class MyNum
{
      private int data;
      public MyNum()
      {
             data=0;
      }
      MyNum(int data)
      {
         this.data=data;
      }
      public int isnegative()
      {
             if(data<0)
                return 1;
             else
                 return 0;          
      }
      
      public int ispositive()
      {
             if(data>0)
                return 1;
             else
                 return 0;          
      }
      
      public int iszero()
      {
             if(data==0)
                return 1;
             else
                 return 0;          
      }
      
      public int isodd()
      {
             if(data%2!=0)
                return 1;
             else
                 return 0;          
      }
      
      public int iseven()
      {
             if(data%2==0)
                return 1;
             else
                 return 0;          
      }
      
      public static void main(String arg[])
      {
             int y=Integer.parseInt(arg[0]);
             MyNum m=new MyNum(y);
             if (m.ispositive()==1)
                System.out.println(y+" is +ve");
             if (m.isnegative()==1)
                System.out.println(y+" is -ve");
             if (m.iszero()==1)
                System.out.println(y+" is zero");
             if (m.isodd()==1)
                System.out.println(y+" is odd");
             if (m.iseven()==1)
                System.out.println(y+" is even");
      }
}
