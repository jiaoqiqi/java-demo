import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int Sum;
        while (true) {
            try {
                a = in.nextInt();
                b = in.nextInt();
                Sum = a + b;
                System.out.print("Sum is " + Sum);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect input and re-enter two integers:");
                in.nextLine();
                continue;
            }
        }
    }
}