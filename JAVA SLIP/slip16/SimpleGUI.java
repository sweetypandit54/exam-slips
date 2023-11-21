import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends Frame 
{

    public SimpleGUI() 
    {
        setLayout(new FlowLayout());

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu aboutMenu = new Menu("About");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);

        MenuItem newMenuItem = new MenuItem("New");
        MenuItem openMenuItem = new MenuItem("Open");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem aboutMenuItem = new MenuItem("Show About");
        MenuItem exitMenuItem = new MenuItem("Exit");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator(); 
        fileMenu.add(aboutMenuItem);
        fileMenu.addSeparator(); 
        fileMenu.add(exitMenuItem);

        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Simple GUI");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new SimpleGUI();
    }
}
