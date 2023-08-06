import javax.swing.*;
import java.awt.*;

public class JPasswordDemo {
 private JPasswordDemo()
 {
JFrame j = new JFrame("Login Swing");    
    j.setSize(400,400);
    j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JLabel l1 = new JLabel("Username", JLabel.LEFT);
    JLabel l2 = new JLabel("Password", JLabel.LEFT);

    JTextField f1=new JTextField(10);
    JPasswordField f2=new JPasswordField(10);

    l1.setLabelFor(l1);
    l2.setLabelFor(l2);

    JPanel p = new JPanel();
    p.setLayout(new GridLayout(2,2,2,5));
    p.add(l1);
    p.add(f1);
    p.add(l2);
    p.add(f2);
    
    j.setContentPane(p);
    j.pack();
    j.setVisible(true);

 }   
 public static void main(String[] args) {
    new JPasswordDemo();
 }
}
