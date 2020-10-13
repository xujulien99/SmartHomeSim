package Views;

import java.awt.*;
import javax.swing.*;

class HouseLayoutView extends JFrame {
    JPanel panel;
    JLabel label;

    // constructor
    HouseLayoutView() {
        JScrollPane scrollPane = new JScrollPane(new JPanel());
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getViewport().setPreferredSize(new Dimension(400, 400));
        this.add(scrollPane);

        this.getContentPane().add(scrollPane);

        //TODO: Close window don't exit app lol
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

