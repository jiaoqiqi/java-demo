

import java.text.DecimalFormat;
import java.util.Scanner;

public class EquationCalculate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        double a, b, c;
        while (true) {
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();
            if (Math.abs(b * b - 4 * a * c) < 10e-6) {
                double root = (double) ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
                System.out.println("The root is:" + d.format(root) + ".");
            } else if ((b * b - 4 * a * c) > 10e-6) {
                double root1 = (double) ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
                double root2 = (double) ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
                System.out.println("The roots are " + d.format(root1) + " and " + d.format(root2) + ".");
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
    }

}


