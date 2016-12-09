//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//import java.util.*;
//
////22-6
//public class Linklist{
//    public static void main(String []args){
//        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(input.nextInt());
//        list.add(input.nextInt());
//        list.add(input.nextInt());
//        list.add(input.nextInt());
//        list.add(input.nextInt());
//        list.add(input.nextInt());
//        list.add(input.nextInt());
//
//        Collections.sort(list);
//        Collections.shuffle(list);
//        Collections.reverse(list);
//        System.out.println(list);
//    }
//
//}
//
//
//class ShowFrame extends Frame{
//    JTextField textField = new JTextField(25);
//    Set<Integer> set = new HashSet<Integer>();
//    public void Show() {
//        this.setLayout(new FlowLayout(FlowLayout.CENTER));
//        this.add(new JLabel("Enter number"));
//
//        JTextField jt = new JTextField(15);
////        jt.addKeyListener(new KeyAdapter() {
////            @Override
////            public void keyTyped(KeyEvent e) {
////                if(e.getKeyCode() == KeyEvent.VK_ENTER){
////                    set.add(Integer.parseInt(jt.getText()));
////                }
////            }
////        });
//    }
//
//}

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Linklist extends JApplet {
    private LinkedList list = new LinkedList();
    private JTextField jtfNumber = new JTextField(8);
    private JTextArea jtaNumbers = new JTextArea();
    private JButton jbtSort = new JButton("Sort");
    private JButton jbtShuffle = new JButton("Shuffle");
    private JButton jbtReverse = new JButton("Reverse");

    public Linklist() {
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Enter a number: "));
        panel1.add(jtfNumber);

        JScrollPane jsp = new JScrollPane(jtaNumbers);

        JPanel panel2 = new JPanel();
        panel2.add(jbtSort);
        panel2.add(jbtShuffle);
        panel2.add(jbtReverse);

        add(panel1, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        jtfNumber.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!list.contains(new Integer(jtfNumber.getText()))) {
                    jtaNumbers.append(jtfNumber.getText() + " ");
                    list.add(new Integer(jtfNumber.getText()));
                }
            }
        });

        jbtSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.sort(list);
                display();
            }
        });

        jbtShuffle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.shuffle(list);
                display();
            }
        });

        jbtReverse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.reverse(list);
                display();
            }
        });
    }

    private void display() {
        jtaNumbers.setText(null);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            jtaNumbers.append(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        Linklist applet = new Linklist();
        JFrame frame = new JFrame();
        //EXIT_ON_CLOSE == 3
        frame.setDefaultCloseOperation(3);
        frame.setTitle("Linklist");
        frame.add(applet, BorderLayout.CENTER);
        applet.init();
        applet.start();
        frame.setSize(600, 160);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}