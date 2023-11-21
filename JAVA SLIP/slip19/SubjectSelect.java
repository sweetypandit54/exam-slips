import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubjectSelect extends JFrame {

    private JComboBox<String> subjectComboBox;
    private JTextField selectedSubjectTextField;

    public SubjectSelect() {
        // Set up the frame
        setTitle("TYBSC (Comp.Sci.)");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the combo box with TYBSC subjects
        String[] subjects = {"Java", "OS", "Web-Tech", "FDS", "CN"};
        subjectComboBox = new JComboBox<>(subjects);

        // Create the text field to display the selected subject
        selectedSubjectTextField = new JTextField(20);
        selectedSubjectTextField.setEditable(false); // Make the text field read-only

        // Set layout manager to FlowLayout
        setLayout(new java.awt.FlowLayout());

        // Add combo box and text field to the frame
        add(new JLabel("Select Subject:"));
        add(subjectComboBox);
        add(new JLabel("Selected Subject:"));
        add(selectedSubjectTextField);

        // Add action listener to the combo box
        subjectComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySelectedSubject();
            }
        });
    }

    private void displaySelectedSubject() {
        // Get the selected subject from the combo box and display it in the text field
        String selectedSubject = (String) subjectComboBox.getSelectedItem();
        selectedSubjectTextField.setText(selectedSubject);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SubjectSelect().setVisible(true);
            }
        });
    }
}
