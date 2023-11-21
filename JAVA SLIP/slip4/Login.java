import java.awt.*;
import java.awt.event.*;

public class Login extends Frame 
{
    private TextField usernameField, passwordField;
    private Label usernameLabel, passwordLabel, messageLabel;
    private Button loginButton, clearButton;
    private int attempts = 3;

    public Login() 
    {
        setTitle("Login Screen");
        setSize(500, 300);
        setLayout(new GridLayout(4, 2));
        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                dispose();
            }
        });

        usernameLabel = new Label("Username: ");
        usernameField = new TextField(20);
        passwordLabel = new Label("Password: ");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        messageLabel = new Label("");

        loginButton = new Button("Login");
        clearButton = new Button("Clear");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(messageLabel);
        add(loginButton);
        add(clearButton);

        loginButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (attempts > 0) 
                {
                    if (username.equals(password)) 
                    {
                        messageLabel.setText("Login Successful!");
                        attempts = 3; 
                    } 
                    else 
                    {
                        attempts--;
                        messageLabel.setText("Login Failed. Remaining attempts: " + attempts);
                    }
                } 
                else               
                    messageLabel.setText("Login Attempts Exhausted!");            
            }
        });

        clearButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                usernameField.setText("");
                passwordField.setText("");
                messageLabel.setText("");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Login();
    }
}

