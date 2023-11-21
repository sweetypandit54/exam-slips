//slip6
import java.io.*;
import java.util.*;

public class FileCheck 
{
    public static void main(String[] args) 
    {
        String fn = "sample.txt";
        try 
        {
            File file = new File(fn);
            Scanner scan = new Scanner(file);
            ArrayList<String> lines = new ArrayList<>();
            while (scan.hasNextLine()) 
            {
                String line = scan.nextLine();
                lines.add(line);
            }
            Collections.reverse(lines);
            System.out.println("Original Contents In Reverse:");
            for (String line : lines) 
                System.out.println(line.toUpperCase());
            scan.close(); 
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
