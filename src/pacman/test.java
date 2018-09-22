package pacman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        /*SwingUtilities.invokeLater(() -> { //lambda expression
            createAndShowGUI();
        });*/
    }

    private static void createAndShowGUI() {
        //System.out.println("Created GUI on EDT? "+
        //        SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Demo");
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setSize(750,500);
        f.add(new TestPanel());
        f.pack();
        f.setVisible(true);
    }
}

class TestPanel extends JPanel {

    public TestPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw Text
        g.drawString("This is my custom Panel!", 10, 20);
    }
}