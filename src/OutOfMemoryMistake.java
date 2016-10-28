import java.util.Scanner;

public class OutOfMemoeyMistake {


    public static void main(String[] args) {
        try {
            int len = Integer.MAX_VALUE;
            int largArray[] = new int[len];
            System.out.println(len);

        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            System.out.println("Please input the munber of the array you want(lpease  input small):");
            Scanner input = new Scanner(System.in);
            int len2 = input.nextInt();

            System.out.println("The maxindex of the array you input is:"+len2);
        }

    }

}