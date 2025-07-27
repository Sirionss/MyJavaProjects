import java.awt.*;
import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Panels with Labels");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 1)); 
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.LIGHT_GRAY);
        JLabel label1_1 = new JLabel("I am label 1 on panel 1");
        JLabel label1_2 = new JLabel("I am label 2 on panel 1");
        panel1.add(label1_1);
        panel1.add(label1_2);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.CYAN);
        JLabel label2_1 = new JLabel("I am label 1 on panel 2");
        JLabel label2_2 = new JLabel("I am label 2 on panel 2");
        panel2.add(label2_1);
        panel2.add(label2_2);
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
        
    }
}
