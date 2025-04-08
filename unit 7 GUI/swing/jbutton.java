import javax.swing.*;


public class jbutton {
    public static void main(String[] args) {
        JFrame win = new JFrame("my first GUI program");
        JButton button = new JButton("Hello click me!!"  );
        win.getContentPane().add(button);
        win.add(button);
        
        
        win.pack();
        win.setVisible(true);
    }
    
}
