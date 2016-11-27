import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;



public class ShowFlowLayout extends JFrame {
    public ShowFlowLayout(){
        this.setLayout(new FlowLayout());
        JPanel p1 = new JPanel();
        p1.add(new JButton("button1"));
        p1.add(new JButton("button2"));
        p1.add(new JButton("button3"));
        this.add(p1);

        JPanel p2 = new JPanel();
        p2.add(new JButton("button4"));
        p2.add(new JButton("button5"));
        p2.add(new JButton("button6"));
        this.add(p2);

    }

    public static void main(String []args){
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setSize(400,250);
        frame.setVisible(true);
    }

}




//class showPanel extends JPanel{
//    public showPanel(){
//        this.add(new Button("button1"));
//        this.add(new Button("button2"));
//        this.add(new Button("button3"));
//    }
//}
//public class ShowFlowLayout {
//    public static void main(String []args){
//        JFrame frame = new JFrame();
//        frame.setLayout(new FlowLayout());
//        frame.setSize(300,300);
//        frame.add(new showPanel());
//        frame.add(new showPanel());
//        frame.setVisible(true);
//    }
//}



//public class ShowFlowLayout {
//    public static void main(String []args){
//        JFrame frame = new JFrame();
//        Border bd = BorderFactory.createLineBorder(Color.BLACK,1);
//        frame.setLayout(new GridLayout(4,1));
//        JLabel abc= new JLabel("abc");
//        abc.setBorder(bd);
//        frame .add(abc);
//
//
//        JLabel def= new JLabel("def");
//        def.setBorder(bd);
//        frame .add(def);
//
//        JLabel hij= new JLabel("hij");
//        hij.setBorder(bd);
//        frame .add(hij);
//
//        JLabel klm= new JLabel("klm");
//        klm.setBorder(bd);
//        frame .add(klm);
//
//        frame.setSize(300,300);
//        frame.setVisible(true);
//    }
//}



//public class ShowFlowLayout{
//    public static void main(String []args){
//        JFrame frame = new JFrame();
//        frame.setSize(800,800);
//        Border bd = BorderFactory.createLineBorder(Color.BLACK,1);
//        frame.setLayout(new GridLayout(2,2));
//        JLabel pic1 = new JLabel(new ImageIcon("/home/monster/Pictures/download.jpg"));
//        pic1.setBorder(bd);
//        frame.add(pic1);
//
//        JLabel pic2 = new JLabel(new ImageIcon("/home/monster/Pictures/download.jpg"));
//        pic2.setBorder(bd);
//        frame.add(pic2);
//
//        JLabel pic3 = new JLabel(new ImageIcon("/home/monster/Pictures/download.jpg"));
//        pic3.setBorder(bd);
//        frame.add(pic3);
//
//        JLabel pic4 = new JLabel(new ImageIcon("/home/monster/Pictures/download.jpg"));
//        pic4.setBorder(bd);
//        frame.add(pic4);
//
//        frame.setVisible(true);
//    }
//}





//public class ShowFlowLayout{
//    public static void main(String []args){
//        JFrame frame = new JFrame();
//        frame.setLayout(new GridLayout(2,3));
//        frame.setSize(300,200);
//        Font myFont = new Font("TimesRoman",1,20);
//        Border bd = BorderFactory.createLineBorder(Color.YELLOW,1);
//
//        JLabel blo1 = new JLabel("black");
//        blo1.setBorder(bd);
//        blo1.setFont(myFont);
//        blo1.setForeground(Color.BLACK);
//        blo1.setToolTipText("black");
//
//        JLabel blo2 = new JLabel("blue");
//        blo2.setBorder(bd);
//        blo2.setFont(myFont);
//        blo2.setForeground(Color.BLUE);
//        blo2.setToolTipText("blue");
//
//        JLabel blo3 = new JLabel("cyan");
//        blo3.setBorder(bd);
//        blo3.setFont(myFont);
//        blo3.setForeground(Color.CYAN);
//        blo3.setToolTipText("cyan");
//
//        JLabel blo4 = new JLabel("green");
//        blo4.setBorder(bd);
//        blo4.setFont(myFont);
//        blo4.setForeground(Color.GREEN);
//        blo4.setToolTipText("green");
//
//        JLabel blo5 = new JLabel("magenta");
//        blo5.setBorder(bd);
//        blo5.setFont(myFont);
//        blo5.setForeground(Color.MAGENTA);
//        blo5.setToolTipText("magenta");
//
//        JLabel blo6 = new JLabel("orange");
//        blo6.setBorder(bd);
//        blo6.setFont(myFont);
//        blo6.setForeground(Color.ORANGE);
//        blo6.setToolTipText("orange");
//
//        frame.add(blo1);
//        frame.add(blo2);
//        frame.add(blo3);
//        frame.add(blo4);
//        frame.add(blo5);
//        frame.add(blo6);
//        frame.setVisible(true);
//
//
//    }
//}
//
//
//
