import java.util.Scanner;

public class EquationCalculate {
    public static void main(String[] args) {
        System.out.print("Enter a,b,c: ");

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double q = Math.sqrt(b * b - 4 * a * c);
        if (q > 0) {
            double r1 = (-b + q) / (2 * a);
            double r2 = (-b - q) / (2 * a);
            System.out.println("The roots are " + String.format("%.6f", r1) + " and "
                    + String.format("%.5f", r2));
        } else if (q == 0) {
            double r = (-b + q) / (2 * a);
            System.out.println("The roots is " + r);
        } else if (q < 0) {
            System.out.println("The equation has no real roots");
        }
    }
}


