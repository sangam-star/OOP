// package unit 7.Flow_layout;

import java.awt.*;

import javax.swing.*;

public class show_flowlayout {
    public static void main(String[] args) {
        JFrame win = new JFrame("my fifth GUI program");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.getContentPane().setLayout(new FlowLayout( ));

        for (int i = 0; i < 10; i++) {
            // JButton button = new JButton("Button " + i);
            win.getContentPane().add( new JButton(String.valueOf( i )));
        }
        win.pack();
        win.setVisible(true);
    }

    
}
