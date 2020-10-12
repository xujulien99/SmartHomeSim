import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Main{
    public static void main(String[] args) {
            JScrollPane scrollPane = new JScrollPane(new HouseDrawer(new House()));
            scrollPane.getViewport().setPreferredSize(new Dimension(1000, 1000));
            JFrame frame = new JFrame("SOEN 343");
            frame.getContentPane().add(scrollPane);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
    }
}

//class InsidePane extends JPanel {
//    private static final int SPA_WIDTH = 600;
//    private static final int SPA_HEIGHT = 600;
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.red);
//        g.drawLine(-50,-50,50,20);
//        g.drawRect(56, 34, 23, 456);
//    }
//
//    @Override
//    public Dimension getPreferredSize() {
//        return new Dimension(SPA_WIDTH, SPA_HEIGHT);
//    }
//}