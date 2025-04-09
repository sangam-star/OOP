// package unit 7 GUI.coloor;
import javax.swing.*;
import java.awt.*;
 
 

public class colorrr extends JFrame {
    public colorrr(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        Color[] colors = {
            Color.red,
            Color.blue,
            Color.green,
            Color.orange,
            Color.cyan,
            Color.pink,
            Color.magenta
        };

        for (int i = 0; i < colors.length; i++) {
            JButton button = new JButton("Component " + i);
            button.setBackground(colors[i]);
 
            button.setForeground(Color.white);

            container.add(button);

        } 
    }
        
 public static void main(String[] args) {
            colorrr frame = new colorrr();
            frame.setTitle("colorrr");
            frame.setLocation(100, 100);
            frame.setSize(250, 150);  
            
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

       
 }



 