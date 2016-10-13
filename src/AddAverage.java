import java.util.Scanner;

public class AddAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name=new String[5];
        int[] grade=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            name[i]=input.next();
            grade[i]=input.nextInt();
            sum=sum+grade[i];
        }

        System.out.println(sum);
        System.out.println(sum/5.0);
    }

}
