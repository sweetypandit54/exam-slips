import javax.swing.*;
import java.awt.*;

public class BorderLayoutE extends JFrame {

    public BorderLayoutE() {
        // Set up the frame
        setTitle("BorderLayout Ex");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create buttons
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Set layout manager to BorderLayout
        setLayout(new BorderLayout());

        // Add buttons to the frame with specified positions
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BorderLayoutE().setVisible(true);
            }
        });
    }
}
