import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Pain{
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JScrollPane scrollPane = new JScrollPane(new InsidePane());
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.getViewport().setPreferredSize(new Dimension(400, 400));
            JFrame frame = new JFrame("SOEN 343");
            frame.getContentPane().add(scrollPane);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

class InsidePane extends JPanel {
    private static final int SPA_WIDTH = 600;
    private static final int SPA_HEIGHT = 600;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(0,0,50,50);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(SPA_WIDTH, SPA_HEIGHT);
    }
}