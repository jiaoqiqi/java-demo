import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShowMouseSite extends JFrame {
    public ShowMouseSite() {
        add(new DisplayCoordinatePanelONE());
    }

    public static void main(String[] args) {
        ShowMouseSite frame = new ShowMouseSite();
        frame.setTitle("MouseSite");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
class DisplayCoordinatePanelONE extends JPanel {

    private Point p = new Point(0, 0);

    public DisplayCoordinatePanelONE() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                p.x = e.getX();
                p.y = e.getY();
                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("(" + p.x + ", " + p.y + ")", p.x, p.y);
    }
}

//class DisplayCoordinatePanelTWO extends JPanel {
//
//    private Point p = new Point(0, 0);
//    private boolean pressed = false;
//
//    public DisplayCoordinatePanelTWO() {
//        addMouseListener(new MouseAdapter() {
//            public void mousePressed(MouseEvent e) {
//                p.x = e.getX();
//                p.y = e.getY();
//                pressed = true;
//                repaint();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                pressed = false;
//                repaint();
//            }
//        });
//    }
//
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        if (pressed) {
//            g.drawString("(" + p.x + ", " + p.y + ")", p.x, p.y);
//        }
//    }
//}