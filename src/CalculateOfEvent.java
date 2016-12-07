import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculateOfEvent extends JFrame {

    private JTextField jtfNum1, jtfNum2, jtfResult;
    private JButton jbtAdd, jbtSub, jbtMul, jbtDiv;
    public static void main(String[] args) {
        CalculateOfEvent frame = new CalculateOfEvent();
        frame.pack();
        frame.setTitle("calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public CalculateOfEvent() {
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Number 1"));
        p1.add(jtfNum1 = new JTextField(3));
        p1.add(new JLabel("Number 2"));
        p1.add(jtfNum2 = new JTextField(3));
        p1.add(new JLabel("Result"));
        p1.add(jtfResult = new JTextField(8));
        jtfResult.setEditable(false);
        jtfResult.setHorizontalAlignment(SwingConstants.RIGHT);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jbtAdd = new JButton("Add"));
        p2.add(jbtSub = new JButton("Subtract"));
        p2.add(jbtMul = new JButton("Multiply"));
        p2.add(jbtDiv = new JButton("Divide"));

        jbtAdd.setMnemonic('A');
        jbtSub.setMnemonic('S');
        jbtMul.setMnemonic('M');
        jbtDiv.setMnemonic('D');

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        jbtAdd.addActionListener(new Listener());
        jbtSub.addActionListener(new Listener());
        jbtMul.addActionListener(new Listener());
        jbtDiv.addActionListener(new Listener());
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();
            if ("Add".equals(actionCommand))
                calculate('+');
            else if ("Subtract".equals(actionCommand))
                calculate('-');
            else if ("Multiply".equals(actionCommand))
                calculate('*');
            else if ("Divide".equals(actionCommand))
                calculate('/');
        }
    }

    private void calculate(char operator) {
        double num1 = new Double(jtfNum1.getText().trim()).doubleValue();
        double num2 = new Double(jtfNum2.getText().trim()).doubleValue();
        double result = 0;

        switch (operator) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
        }

        jtfResult.setText(String.valueOf(result));
    }
}
