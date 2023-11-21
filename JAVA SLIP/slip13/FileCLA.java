//slip 12
import java.io.*;

public class FileCLA 
{
    public static void main(String[] args) 
    {
        if (args.length != 1) 
        {
            System.out.println("Usage: java FileCLA <file_name>");
            return;
        }

        String fileName = args[0];

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) 
        {

            int wordCount = 0;
            int lineCount = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) 
            {
                lineCount++;
                String[] words = line.split("\\s+"); // Split the line into words
                wordCount += words.length;
            }
            System.out.println("Number of words in the file: " + wordCount);
            System.out.println("Number of lines in the file: " + lineCount);
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

