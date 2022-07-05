import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Double;
import java.lang.Math;

public class GUIQuadraticCalculator {

    public static void calQuadEqn(double a, double b, double c, StringBuffer x1, StringBuffer x2) {
        String y1, y2;
        double root1, root2;
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            y1 = ("x = " + root1);
            y2 = ("x = " + root2);
            x1.append(y1);
            x2.append(y2);
        }

        else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);

            y1 = ("x = " + root1);
            y2 = ("x = " + root2);
            x1.append(y1);
            x2.append(y2);

        }

        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);

            root1 = real + imaginary;
            root2 = real - imaginary;

            y1 = ("x = " + real + " + " + imaginary + "i");
            y2 = ("x = " + real + " - " + imaginary + "i");

            x1.append(y1);
            x2.append(y2);
        }
    }

    GUIQuadraticCalculator() {

        // Overall Look and Flow
        // Frame
        JFrame calFrame = new JFrame("Quadratic Calculator");
        calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calFrame.setLayout(new GridLayout(6, 2));
        calFrame.setSize(700, 400);
        calFrame.setVisible(true);

        // Panel
        // JPanel inputVar = new JPanel();

        // Label
        JLabel standQE = new JLabel("Standard Quadratic Equation Form");
        JLabel quadEqn = new JLabel("ax^2 + bx + c = 0");
        JLabel coeffa = new JLabel("Coefficient a: ");
        JLabel coeffb = new JLabel("Coefficient b: ");
        JLabel coeffc = new JLabel("Coefficient c: ");
        JLabel answer1 = new JLabel();
        JLabel answer2 = new JLabel();

        // Text Field
        JTextField tfa = new JTextField(10);
        JTextField tfb = new JTextField(10);
        JTextField tfc = new JTextField(10);

        // Button
        JButton btnCal = new JButton("Calculate");
        JButton btnClr = new JButton("Clear");

        // App Layout
        calFrame.add(standQE);
        calFrame.add(quadEqn);

        calFrame.add(coeffa);
        calFrame.add(tfa);

        calFrame.add(coeffb);
        calFrame.add(tfb);

        calFrame.add(coeffc);
        calFrame.add(tfc);

        calFrame.add(answer1);
        calFrame.add(answer2);

        calFrame.add(btnCal);
        calFrame.add(btnClr);

        // Calculate Button
        btnCal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                double a, b, c;
                a = Double.parseDouble(tfa.getText());
                b = Double.parseDouble(tfb.getText());
                c = Double.parseDouble(tfc.getText());

                String root1, root2;
                StringBuffer temp1, temp2;

                temp1 = new StringBuffer();
                temp2 = new StringBuffer();

                calQuadEqn(a, b, c, temp1, temp2);
                root1 = temp1.toString();
                root2 = temp2.toString();

                answer1.setText(root1);
                answer2.setText(root2);
            }
        });

        // Clear Button
        btnClr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tfa.setText("");
                tfb.setText("");
                tfc.setText("");
            }
        });
    }

    public static void main(String[] args) {

        // Running Quadratic Calculator
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIQuadraticCalculator();
            }
        });
    }
}
