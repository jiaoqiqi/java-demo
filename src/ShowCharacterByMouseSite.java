import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowCharacterByMouseSite extends JFrame {
    private DisplayPanel panel = new DisplayPanel();

    public ShowCharacterByMouseSite() {
        add(panel, BorderLayout.CENTER);
        panel.setFocusable(true);
    }

    public static void main(String[] args) {
        JFrame frame = new ShowCharacterByMouseSite();
        frame.setTitle("StringSite");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class DisplayPanel extends JPanel {
        private int x = 20;
        private int y = 20;
        private char keyChar = ' ';

        public DisplayPanel() {
            this.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    keyChar = e.getKeyChar();
                    repaint();
                }
            });

            this.addMouseMotionListener(new MouseAdapter() {
                public void mouseMoved(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
            g.drawString(String.valueOf(keyChar), x, y);
        }
    }
}
