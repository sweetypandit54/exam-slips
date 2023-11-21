
import java.util.Scanner;
public class Multiarray
{
      public static void main(String ab[])
      {
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter no of rows: ");
          int r=scan.nextInt();
          System.out.println("Enter no of columns: ");
          int c=scan.nextInt();
          int[][] mat1=new int[r][c];
          int[][] mat2=new int[r][c];
          System.out.println("Enter Elements of matrix1: ");
          inputMat(mat1,scan);
          System.out.println("Enter Elements of matrix2: ");
          inputMat(mat2,scan);
          int choice=1;
          do
          {
             System.out.println("\n\nOperations to perform on Matrix: ");
             System.out.println("1.Addition: ");
             System.out.println("2.Multiplication:");
             System.out.println("3.Exit");
             System.out.println("\nEnter your choice: ");
             choice=scan.nextInt();
             switch (choice)
             {
                    case 1:int[][] sum=addMatrices(mat1,mat2);
                           System.out.println("Sum of Matrices is:");
                           display(sum);
                           break;
                    case 2:int[][] product=multiply(mat1,mat2);
                           System.out.println("Product of Matrices: ");
                           display(product);
                           break;
                    case 3:System.out.println("Exiting.....");
                           break;      
                    default:System.out.println("Invalid Choice!");                                                         
             }
          
          }
          while(choice!=4);
          scan.close();          
          
      }
      public static void inputMat(int[][] matrix,Scanner scan)
      {
             for (int i=0;i<matrix.length;i++)
                for (int j=0;j<matrix[0].length;j++)
                     matrix[i][j]=scan.nextInt();
      }
      public static void display(int[][] matrix)
      {
            for (int i=0;i<matrix.length;i++)
            {    for (int j=0;j<matrix[0].length;j++)
                
                    System.out.print(matrix[i][j]+" ");
                System.out.println();        
            } 
      }
      
      public static int[][] addMatrices(int[][] mat1,int[][] mat2)
      {
           int row=mat1.length;
           int col=mat1[0].length;
           int[][] sum=new int[row][col];
           for (int i=0;i<row;i++)
               for (int j=0;j<col;j++)
                    sum[i][j]=mat1[i][j]+mat2[i][j];              
           return sum;
      }
      public static int[][] multiply(int[][] mat1,int[][] mat2)
      {
             int row1=mat1.length;
             int col1=mat1[0].length;
             int col2=mat2[0].length;
             int[][] product=new int[row1][col2];
             for (int i=0;i<row1;i++)
                 for (int j=0;j<col2;j++)
                 {
                     int sum=0;
                     for (int k=0;k<col1;k++)
                         sum+=mat1[i][k]*mat2[k][j];
                     product[i][j]=sum;    
                 }
           return product;
      }
}
//System.out.println("");