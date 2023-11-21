import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventD 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Mouse Event");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);

        JPanel panel = new JPanel();
        f.add(panel);

        JTextField tf = new JTextField(20);
        panel.add(tf);
        JTextField tf1 = new JTextField(20);
        panel.add(tf1);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                tf.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            }
        });
        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) 
            {
                tf1.setText("Mouse Position: " + e.getX() + ", " + e.getY());
            }
         });   
        f.setVisible(true);
    }
}
