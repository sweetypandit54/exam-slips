import java.util.Scanner;
public class array 
{
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
                for (int j=0;j<matrix.length;j++)
                     matrix[i][j]=scan.nextInt();
           System.out.println("Sum of Diagonal elements is:");
           int mat1[][] = new int[r][c];
           for (int i=0;i<matrix.length;i++)
                for (int j=0;j<matrix.length;j++)  
                     mat1[i][j]=matrix[j][i];
            System.out.println("Transpose matrix is: ");         
            for (int i=0;i<matrix.length;i++)
            {
                System.out.println();
                for (int j=0;j<matrix.length;j++)  
                    System.out.print(mat1[i][j]+ " ");        
            }
           scan.close();
    }
}
