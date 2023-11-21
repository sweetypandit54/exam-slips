import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MouseEventHandling extends JFrame 
{

    public MouseEventHandling() 
    {
        setTitle("Mouse Event Handling");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(new CustomMouseAdapter());
    }

    private class CustomMouseAdapter extends MouseAdapter 
    {
        @Override
        public void mouseClicked(MouseEvent e) {
            displayEvent("Mouse Clicked", e);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            displayEvent("Mouse Pressed", e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            displayEvent("Mouse Released", e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            displayEvent("Mouse Entered", e);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            displayEvent("Mouse Exited", e);
        }
    }

    private void displayEvent(String eventName, MouseEvent e) 
    {
        getContentPane().setBackground(Color.WHITE);

        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.drawString(eventName, getWidth() / 2 - 40, getHeight() / 2);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MouseEventHandling().setVisible(true);
            }
        });
    }
}
