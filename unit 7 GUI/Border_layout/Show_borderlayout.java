// package unit 7.Grid_layout;

 import java.awt.*;
import javax.swing.*;

public class Show_borderlayout {

    public static void main(String[] args) {
        JFrame win = new JFrame("my sixth GUI program");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = win.getContentPane();

        content.setLayout(new BorderLayout());
        content.add(new JButton("North"), BorderLayout.NORTH);
        content.add(new JButton("South"), BorderLayout.SOUTH);      
        content.add(new JButton("East"), BorderLayout.EAST);
        content.add(new JButton("West"), BorderLayout.WEST);
        content.add(new JButton("Center"), BorderLayout.CENTER);
        
        win.pack();
        win.setVisible(true);
    }
    

    
}
