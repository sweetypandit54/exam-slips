//slip 17
import java.util.Scanner;
public class array1
{

    public static void sum_diagonal(int[][] matrix)
    {
      int sum=0;
           for (int i=0;i<matrix.length;i++)
          {    for (int j=0;j<matrix[0].length;j++)
              
                  if (i==j)
                  {
                      sum+=matrix[i][j];
                  }       
          } 
          System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
       
          System.out.print("Enter no of rows: ");
          int r=scan.nextInt();
          System.out.print("Enter no of columns: ");
          int c=scan.nextInt();
          int[][] matrix=new int[r][c];
                System.out.println("Enter Elements of matrix: ");
           for (int i=0;i<matrix.length;i++)
                for (int j=0;j<matrix[0].length;j++)
                     matrix[i][j]=scan.nextInt();
           System.out.println("Sum of Diagonal elements is:");
           sum_diagonal(matrix);           
           scan.close();
    }
}