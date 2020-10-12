package Views;

import javax.swing.*;
import java.awt.*;

class Pain2 extends JFrame {
    MyPanel panel;

    // constructor
    Pain2() {

        panel = new MyPanel();
        this.add(panel);
        //TODO: Close window don't exit app lol
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        // add the label to the JFrame
    }

}

class MyPanel extends JPanel {

    public MyPanel() {
        JButton jrb1 = new JButton("Select User Profile");
        JButton jrb2 = new JButton("Select Location");
        JButton jrb3 = new JButton("Enter Simulation");
        Box box1 = Box.createVerticalBox();
        box1.add(jrb1);
        box1.add(jrb2);
        box1.add(jrb3);


        setLayout(new GridLayout(1, 1));
        add(box1);


    }

}
//public class TestFrame2 {
//    public static void main(String[] args) {
//        Pain1 frame = new Pain1("Hello"); // construct a MyFrame object
//        frame.setVisible(true);             // ask it to become visible
//    }
//}