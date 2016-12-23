
import javax.swing.*;

public class Exercise29_1 extends JFrame {
    private JTextArea jta = new JTextArea();

    public static void main(String[] args) {
        Exercise29_1 frame = new Exercise29_1();
        frame.setTitle("Exercise29_1");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public Exercise29_1() {
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp);
        jta.setLineWrap(true);

        Thread printA = new Thread(new PrintChar('a', 100));
        Thread printB = new Thread(new PrintChar('b', 100));
        Thread  print100 = new Thread(new PrintNum(100));

        print100.start();
        printA.start();
        printB.start();
    }

    class PrintChar implements Runnable {
        private char charToPrint;
        private int	times;

        public PrintChar(char c, int t) {
            charToPrint = c;
            times = t;
        }

        public void run() {
            for (int i=1; i < times; i++)
                jta.append(charToPrint+"");
        }
    }

    class PrintNum implements Runnable {
        private int lastNum;
        public PrintNum(int i) {
            lastNum = i;
        }

        public void run() {
            for (int i=1; i <= lastNum; i++)
                jta.append(" "+i);
        }
    }
}