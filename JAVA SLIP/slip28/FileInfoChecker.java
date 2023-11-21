//slip 25
import java.io.File;

public class FileInfoChecker 
{
    public static void main(String[] args) 
    {
        try 
        {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();

            File file = new File(fileName);

            if (file.exists()) 
            {
                System.out.println("File exists.");
                if (file.isFile()) 
                    System.out.println("It is a regular file.");
                else 
                if (file.isDirectory()) 
                    System.out.println("File is not readable.");

                if (file.canWrite()) 
                    System.out.println("File is writable.");
                else 
                    System.out.println("File is not writable.");

                System.out.println("File type: " + getFileType(fileName));
                System.out.println("File length: " + file.length() + " bytes");
            } 
            else 
                System.out.println("File does not exist.");
           
            scanner.close();
        } 
        catch (Exception e) 
        {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static String getFileType(String fileName) 
    {
        String fileType = "Unknown";
        int lastIndex = fileName.lastIndexOf(".");
        if (lastIndex > 0 && lastIndex < fileName.length() - 1) 
            fileType = fileName.substring(lastIndex + 1);
        return fileType;
    }
}
