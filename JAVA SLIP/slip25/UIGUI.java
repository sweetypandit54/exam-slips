import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIGUI {
    private JFrame f;
    private JPanel panel;
    private JLabel nameLabel, classLabel, hobbiesLabel, fontLabel, styleLabel;
    private JTextField nameField;
    private JComboBox<String> classComboBox;
    private JCheckBox sportsCheckBox, musicCheckBox, readingCheckBox;
    private JCheckBox BoldCheckBox, ItalicCheckBox;
    private JComboBox<String> fontComboBox;
    private JComboBox<Integer> fontSizeComboBox; // New JComboBox for font size
    private JButton submitButton;
    private JTextArea result;

    public UIGUI() {
        f = new JFrame("User Information");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 500);

        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        classLabel = new JLabel("Class:");
        String[] classOptions = {"FY", "SY", "TY"};
        classComboBox = new JComboBox<>(classOptions);

        hobbiesLabel = new JLabel("Hobbies:");
        sportsCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        readingCheckBox = new JCheckBox("Reading");

        styleLabel = new JLabel("Style:");
        BoldCheckBox = new JCheckBox("Bold");
        ItalicCheckBox = new JCheckBox("Italic");

        fontLabel = new JLabel("Font:");
        String[] fontOptions = {"serif", "sans-serif", "Monospaced"};
        fontComboBox = new JComboBox<>(fontOptions);

        // Create a JComboBox for font size and populate it with font size options
        fontSizeComboBox = new JComboBox<>(new Integer[]{12, 14, 16, 18, 20, 24, 28, 32, 36, 48, 72});

        submitButton = new JButton("Submit");

        result = new JTextArea(5, 20);
        result.setEditable(false);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(classLabel);
        panel.add(classComboBox);
        panel.add(hobbiesLabel);
        panel.add(sportsCheckBox);
        panel.add(new JLabel(""));
        panel.add(musicCheckBox);
        panel.add(new JLabel(""));
        panel.add(readingCheckBox);
        panel.add(new JLabel(""));
        panel.add(styleLabel);
        panel.add(BoldCheckBox);
        panel.add(new JLabel(""));
        panel.add(ItalicCheckBox);
        panel.add(new JLabel(""));
        panel.add(fontLabel);
        panel.add(fontComboBox);
        panel.add(new JLabel("Font Size:")); // Add label for font size
        panel.add(fontSizeComboBox); // Add font size dropdown
        panel.add(submitButton);

        f.add(panel, BorderLayout.NORTH);
        f.add(result, BorderLayout.CENTER);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String userClass = classComboBox.getSelectedItem().toString();
                StringBuilder hobbies = new StringBuilder("\nSelected Hobbies: ");

                if (sportsCheckBox.isSelected()) {
                    hobbies.append("Sports, ");
                }
                if (musicCheckBox.isSelected()) {
                    hobbies.append("Music, ");
                }
                if (readingCheckBox.isSelected()) {
                    hobbies.append("Reading. ");
                }

                int fontStyle = Font.PLAIN;

                if (BoldCheckBox.isSelected()) {
                    fontStyle = fontStyle | Font.BOLD;
                }
                if (ItalicCheckBox.isSelected()) {
                    fontStyle = fontStyle | Font.ITALIC;
                }

                String selectedFontName = fontComboBox.getSelectedItem().toString();
                int selectedFontSize = (int) fontSizeComboBox.getSelectedItem(); // Get selected font size

                Font selectedFont = new Font(selectedFontName, fontStyle, selectedFontSize);
                result.setFont(selectedFont);

                result.setText("\nName: " + name);
                result.append("\nClass: " + userClass);
                result.append(hobbies.toString());
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UIGUI());
    }
}
