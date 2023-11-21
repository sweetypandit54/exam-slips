import java.util.*;

public class CricketPlayer
{
      String name;
      int noofinnings;
      int noofnotouts;
      int totalruns;
      double batavg;

     public CricketPlayer(String name,int noofinnings,int noofnotouts,int totalruns)
     {
           this.name=name;
           this.noofinnings=noofinnings;
           this.noofnotouts=noofnotouts;
           this.totalruns=totalruns;
           this.batavg=totalruns/(noofinnings-noofnotouts);
     }
      
     public static void sortplayers(CricketPlayer[] p)
     {
           for (int i=0;i<p.length-1;i++)
           {
               for (int j=0;j<p.length-1-i;j++)
                   if (p[j].batavg < p[j+1].batavg)
                   {
                       CricketPlayer temp=p[j];
                       p[j]=p[j+1];
                       p[j+1]=temp;
                   }   
           }
           
               
     }
     public void display()
     {
            System.out.println("Players Details: ");
            System.out.println("Name: "+name);
            System.out.println("No of Innings: "+noofinnings);
            System.out.println("No of NotOuts: "+noofnotouts);
            System.out.println("Total Runs: "+totalruns);
            System.out.println("Batting average: "+batavg);
            System.out.println("---------------------------------------");   
     }
     public static void main (String[] args)
     {
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter number of players: ");
           int n=scan.nextInt();
           CricketPlayer[] p=new CricketPlayer[n];
           for (int i=0;i<n;i++)
           {
               scan.nextLine();
               System.out.println("Enter Details for player"+(i+1)+":");
               System.out.println("Enter Name: ");
               String name=scan.nextLine();
               System.out.println("Enter no of innings: ");
               int noofinnings=scan.nextInt();
               System.out.println("Enter no of not outs: ");
               int noofnotouts=scan.nextInt();
               System.out.println("Total runs: ");
               int totalruns=scan.nextInt();
               p[i]=new CricketPlayer(name,noofinnings,noofnotouts,totalruns);              
           }
           CricketPlayer.sortplayers(p);
            for (int i=0;i<n;i++)
           {
               p[i].display();
               System.out.println("-------------------------"); 
           }
           scan.close();
     }
}    
//System.Out.println("");