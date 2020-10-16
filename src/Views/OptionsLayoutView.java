package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

//public class TestFrame2 {
//    public static void main(String[] args) {
//        Pain1 frame = new Pain1("Hello"); // construct a MyFrame object
//        frame.setVisible(true);             // ask it to become visible
//    }
//}