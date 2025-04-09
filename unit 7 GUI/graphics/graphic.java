// package unit 7 GUI.graphics;

import javax.swing.*;
import java.awt.*;

public class graphic extends JFrame {
    public graphic() {
        add(new NewPanel());
    }

    // Define the NewPanel class
    public static void main(String[] args) {
        graphic frame = new graphic();
        frame.setTitle("Graphic Example");
        frame.setLocation(100, 100);
        frame.setSize(250, 150);
        frame.setVisible(true);
         
        
    }
}
class NewPanel extends JPanel {
     
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello, Graphics!", 50, 50);
        // g.drawRect(ALLBITS, ABORT, WIDTH, HEIGHT);
        g.drawRect(10, 10, 100, 100);
        g.drawLine(150, 40, 250, 100);
        g.drawOval(20, 120, 100, 60);
        g.drawArc(150, 120, 100, 100, 0, 90);
        g.drawPolygon(new int[]{50, 80, 110}, new int[]{220, 180, 2200}, 3);
        g.setColor(Color.RED);
    }
}