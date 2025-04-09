// package unit 7 GUI.pannel;
import javax.swing.*;
import java.awt.*;

public class TestPanel extends JFrame{
    public TestPanel(){
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        for(int i = 1; i <=9; i++){
            p1.add(new JButton( " " +i));

        }
        p1.add(new JButton( " " +0));
        p1.add(new JButton( " start " ));
        p1.add(new JButton( " stop " ));


        JPanel p2 = new JPanel( new BorderLayout( ));
        p2.add(p1, BorderLayout.CENTER);
        p2.add(new JButton(" 0 "), BorderLayout.SOUTH);
        add(p2, BorderLayout.EAST);
        add(new JButton(" Food is placed here "), BorderLayout.CENTER);
        p2.add( new JTextField(" time to be deLivered "), BorderLayout.NORTH);
        

        
    }
    public static void main(String[] args) {
        TestPanel frame = new TestPanel();
        frame.setTitle("TestPanel");
        frame.setLocation(100, 100);
        frame.setSize(250, 150);  
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
}
