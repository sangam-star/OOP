import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener {
    JTextField display;
    JButton[] numButtons = new JButton[10];
    JButton add, sub, mul, div, dec, equ, del, clr;
    JPanel panel;

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    boolean operatorPressed = false;
    boolean decimalUsed = false;

    public calculator() {
        setTitle("Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 32));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        dec = new JButton(".");
        equ = new JButton("=");
        del = new JButton("CE");
        clr = new JButton("C");

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }

        JButton[] ops = { add, sub, mul, div, dec, equ, del, clr };
        for (JButton btn : ops) {
            btn.addActionListener(this);
        }

        // Layout the buttons
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(div);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(mul);
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(sub);
        panel.add(dec);
        panel.add(numButtons[0]);
        panel.add(equ);
        panel.add(add);
        panel.add(del);
        panel.add(clr);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                if (operatorPressed) {
                    display.setText("");
                    operatorPressed = false;
                }
                display.setText(display.getText() + i);
            }
        }

        if (e.getSource() == dec) {
            if (!decimalUsed) {
                if (operatorPressed || display.getText().equals("")) {
                    display.setText("0.");
                    operatorPressed = false;
                } else {
                    display.setText(display.getText() + ".");
                }
                decimalUsed = true;
            }
        }

        if (e.getSource() == add || e.getSource() == sub || e.getSource() == mul || e.getSource() == div) {
            try {
                num1 = Double.parseDouble(display.getText());
            } catch (NumberFormatException ex) {
                display.setText("Error");
                return;
            }
            operator = ((JButton) e.getSource()).getText().charAt(0);
            operatorPressed = true;
            decimalUsed = false;
        }

        if (e.getSource() == equ) {
            try {
                num2 = Double.parseDouble(display.getText());
            } catch (NumberFormatException ex) {
                display.setText("Error");
                return;
            }

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 == 0) {
                        display.setText("Cannot divide by 0");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default: return;
            }
            display.setText(String.valueOf(result));
            operatorPressed = true;
            decimalUsed = false;
        }

        if (e.getSource() == clr) {
            display.setText("");
            num1 = num2 = result = 0;
            operatorPressed = false;
            decimalUsed = false;
        }

        if (e.getSource() == del) {
            String currentText = display.getText();
            if (!currentText.isEmpty()) {
                if (currentText.endsWith(".")) {
                    decimalUsed = false;
                }
                display.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
