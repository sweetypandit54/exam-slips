import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingTemperatureConverter extends JFrame {

    private JTextField inputTextField;
    private JLabel resultLabel;

    public SwingTemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        inputTextField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ");

        // Set layout manager to FlowLayout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(new JLabel("Enter Temperature: "));
        add(inputTextField);
        add(convertButton);
        add(resultLabel);

        // Add action listener to the Convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });
    }

    private void convertTemperature() {
        // Get user input
        double temperature;
        try {
            temperature = Double.parseDouble(inputTextField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid temperature. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convert temperature
        double convertedTemperature;
        String fromUnit, toUnit;

        if (inputTextField.getText().toLowerCase().contains("c")) {
            // Convert from Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            fromUnit = "Celsius";
            toUnit = "Fahrenheit";
        } else {
            // Convert from Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            fromUnit = "Fahrenheit";
            toUnit = "Celsius";
        }

        // Display the result to 1 decimal place
        String result = String.format("Result: %.1f %s = %.1f %s", temperature, fromUnit, convertedTemperature, toUnit);
        resultLabel.setText(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTemperatureConverter().setVisible(true);
            }
        });
    }
}
