// 30. Write a program to demonstrate the use of push buttons.

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class $30_PushButton {
    public static void setAns(String Q, JTextField tfa, JTextField tfb, JLabel ans) {
        double a, b, c;
        a = Double.parseDouble(tfa.getText());
        b = Double.parseDouble(tfb.getText());

        c = (Q == "add" ? a + b : Q == "sub" ? a - b : Q == "mul" ? a * b : a / b);

        ans.setText(Double.toString(c));
    }

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3, 1));

        // layout
        JPanel headingPanel = new JPanel();
        headingPanel.setVisible(true);

        JPanel calPanel = new JPanel();
        calPanel.setVisible(true);

        JPanel calbtnPanel = new JPanel();
        calbtnPanel.setVisible(true);

        // Label
        JLabel heading = new JLabel("Calculator");
        JLabel num1L = new JLabel("Enter the First no.");
        JLabel num2L = new JLabel("Enter the Second no.");
        JLabel ans1L = new JLabel("Answer");
        JLabel ans2L = new JLabel();

        // Text Feild
        JTextField num1TF = new JTextField(10);
        JTextField num2TF = new JTextField(10);

        // Button
        JButton btnAdd = new JButton("ADD");
        JButton btnSub = new JButton("SUBTRACT");
        JButton btnDiv = new JButton("DIVIDE");
        JButton btnMul = new JButton("MULTIPLY");

        // App Layout

        // Heading
        frame.add(headingPanel);
        headingPanel.add(heading);

        // Inputs And Output
        frame.add(calPanel);
        calPanel.setLayout(new GridLayout(3, 2));

        calPanel.add(num1L);
        calPanel.add(num1TF);

        calPanel.add(num2L);
        calPanel.add(num2TF);

        calPanel.add(ans1L);
        calPanel.add(ans2L);

        // Control Buttons
        frame.add(calbtnPanel);
        calbtnPanel.setLayout(new GridLayout(1, 4));

        calbtnPanel.add(btnAdd);
        calbtnPanel.add(btnSub);
        calbtnPanel.add(btnDiv);
        calbtnPanel.add(btnMul);

        // Calculate Button Action
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setAns("add", num1TF, num2TF, ans2L);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setAns("sub", num1TF, num2TF, ans2L);
            }
        });

        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setAns("mul", num1TF, num2TF, ans2L);
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setAns("div", num1TF, num2TF, ans2L);
            }
        });
    }
}
