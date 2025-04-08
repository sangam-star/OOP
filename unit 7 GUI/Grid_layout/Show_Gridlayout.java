// package unit 7.Grid_layout;

import javax.swing.*;
import java.awt.*;


public class Show_Gridlayout {

    public static void main(String[] args) {
        JFrame win = new JFrame("my sixth GUI program");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.getContentPane().setLayout( new GridLayout( 2 , 0));

        for( int i = 0; i<=10; i++) {
            win.getContentPane().add( new JButton( String.valueOf ( i )));
        }

        win.pack();
        win.setVisible(true);
    }
 
}

 