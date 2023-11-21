import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StringManipulationApp extends JFrame {

    private JTextField textField1, textField2, textField3;
    private JButton concatenateButton, reverseButton;

    public StringManipulationApp() {
        // Set up the frame
        setTitle("String Manipulation App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create text fields
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        textField3.setEditable(false); // Make the result field read-only

        // Create buttons
        concatenateButton = new JButton("Concatenate");
        reverseButton = new JButton("Reverse");

        // Set up layout using GroupLayout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(textField1)
                        .addComponent(textField2)
                        .addComponent(concatenateButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(reverseButton)
                        .addComponent(textField3))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1)
                        .addComponent(reverseButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField2)
                        .addComponent(textField3))
                .addComponent(concatenateButton)
        );

        // Add action listeners to buttons
        concatenateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenateStrings();
            }
        });

        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reverseString();
            }
        });
    }

    private void concatenateStrings() {
        String str1 = textField1.getText();
        String str2 = textField2.getText();
        String result = str1 + str2;
        textField3.setText(result);
    }

    private void reverseString() {
        String str = textField1.getText();
        StringBuilder reversed = new StringBuilder(str).reverse();
        textField3.setText(reversed.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StringManipulationApp().setVisible(true);
            }
        });
    }
}
