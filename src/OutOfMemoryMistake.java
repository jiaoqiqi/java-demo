import java.util.Scanner;

public class OutOfMemoryMistake {


    public static void main(String[] args) {
        try {
            int len = Integer.MAX_VALUE;
            int largArray[] = new int[len];
            System.out.println(len);

        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            System.out.println("Please input the number of the array you want(please input small):");
            Scanner input = new Scanner(System.in);
            int len2 = input.nextInt();

            System.out.println("The maxIndex of the array you input is:"+len2);
        }

    }

}