//slip 14
import java.io.*;

public class CopyFile 
{
    public static void main(String[] args) 
    {
        String source = "source.txt"; 
        String destn = "destination.txt"; 
        try 
        (
            BufferedReader r = new BufferedReader(new FileReader(source));
            BufferedWriter w = new BufferedWriter(new FileWriter(destn))
        ) 
        {
            String line;
            while ((line = r.readLine()) != null) 
            {
                w.write(line);
                w.newLine(); 
             }
            w.write("end of file");
        } 
        catch (IOException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Contents copied and comment added successfully.");
    }
}

