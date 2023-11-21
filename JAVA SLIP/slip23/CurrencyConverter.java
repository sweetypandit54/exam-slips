//not as expected output

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CurrencyConverter extends JFrame {

    private JTextField amountTextField;
    private JComboBox<String> fromCurrencyComboBox, toCurrencyComboBox;
    private JLabel resultLabel;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        amountTextField = new JTextField(10);
        fromCurrencyComboBox = new JComboBox<>(new String[]{"SGD", "USD", "Euro"});
        toCurrencyComboBox = new JComboBox<>(new String[]{"SGD", "USD", "Euro"});
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Converted Amount: ");

        // Set layout manager to FlowLayout
        setLayout(new java.awt.FlowLayout());

        // Add components to the frame
        add(new JLabel("Enter Amount: "));
        add(amountTextField);
        add(new JLabel("From Currency: "));
        add(fromCurrencyComboBox);
        add(new JLabel("To Currency: "));
        add(toCurrencyComboBox);
        add(convertButton);
        add(resultLabel);

        // Add action listener to the Convert button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        // Get user input
        double amount;
        try {
            amount = Double.parseDouble(amountTextField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid amount. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Conversion rates
        double sgdToUsdRate = 1 / 1.41;
        double usdToEuroRate = 0.92;
        double sgdToEuroRate = sgdToUsdRate * usdToEuroRate;

        // Perform conversion
        double convertedAmount = 0.0;
        String fromCurrency = fromCurrencyComboBox.getSelectedItem().toString();
        String toCurrency = toCurrencyComboBox.getSelectedItem().toString();

        if (fromCurrency.equals("SGD") && toCurrency.equals("USD")) {
            convertedAmount = amount / sgdToUsdRate;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("SGD")) {
            convertedAmount = amount * sgdToUsdRate;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("Euro")) {
            convertedAmount = amount * usdToEuroRate;
        } else if (fromCurrency.equals("Euro") && toCurrency.equals("USD")) {
            convertedAmount = amount / usdToEuroRate;
        } else if (fromCurrency.equals("SGD") && toCurrency.equals("Euro")) {
            convertedAmount = amount * sgdToEuroRate;
        } else if (fromCurrency.equals("Euro") && toCurrency.equals("SGD")) {
            convertedAmount = amount / sgdToEuroRate;
        } else {
            convertedAmount = amount; // Same currency
        }

        // Display the result to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        resultLabel.setText("Converted Amount: " + df.format(convertedAmount));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
}
