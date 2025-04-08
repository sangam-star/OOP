 
import java.awt.Dimension;
import javax.swing.*;
public class frame{
    static Dimension windowsize = new Dimension (250,150);
    public static void main(String[] args) {
        JFrame win = new JFrame("my first GUI program");
         
        
        win. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(windowsize);
        win.setVisible(true);
    }

}