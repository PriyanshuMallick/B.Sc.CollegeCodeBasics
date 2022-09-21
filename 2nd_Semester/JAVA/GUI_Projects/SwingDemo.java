import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class SwingDemo {
  public JLabel jlab;

  SwingDemo() {
    // Create a new JFrame container.
    JFrame jfrm = new JFrame("A Simple Swing Application");
    jfrm.setSize(275, 100);
    jfrm.setLayout(new FlowLayout(FlowLayout.CENTER));
    // Terminate the program when the user closes the application.
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Create a text-based label.
    JTextField tf = new JTextField(20);

    JButton jb = new JButton("Save");

    jlab = new JLabel(" Swing means powerful GUIs.");
    //////////////
    jb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent le) {
        jlab.setText("button  was pressed.");
      }
    });

    //////////////
    // Add the label to the content pane.
    jfrm.add(jlab);
    jfrm.add(tf);
    jfrm.add(jb);
    // Display the frame.
    jfrm.setVisible(true);
  }

  public static void main(String args[]) {
    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new SwingDemo();
      }
    });
  }
}
