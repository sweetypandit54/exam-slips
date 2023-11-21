import java.util.Scanner;

public class PasswordValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Accepting password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Checking if username and password are the same
        if (username.equals(password)) {
            System.out.println("Username and password are valid.");
        } else {
            System.out.println("Invalid Password: Username and password must be Same.");
        }

        scanner.close();
    }
}
