
import javax.swing.*;

// import java.awt.Dimension;

public class label {
    public static void main(String[] args) {
        JFrame win = new JFrame("my first GUI program");
        JLabel label = new JLabel("Hello World"  );
         win.getContentPane().add(label);
        win.add(label);
        
        
        win.pack();
        win.setVisible(true);
    }
    
}
