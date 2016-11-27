import java.util.*;
import java.util.regex.Pattern;

public class NumberFormatException {
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
    public static void main(String [] args){
        String a,b;
        int sum=0;
        Scanner input = new Scanner(System.in);
//        System.out.print("please input the first number:");
        a = input.next();
//        if(!isInteger(a)){
////            System.out.println("please input the int number");
//        }
        int x=Integer.parseInt(a);
        sum = sum+x;
//        System.out.print("please input the first number:");
        b = input.next();
        if(!isInteger(b) || !isInteger(a)){
            System.out.println("Incorrect input and re-enter two integers:");
        }
        int y=Integer.parseInt(b);
        sum = sum +y;
        System.out.println("Sum is "+sum);

    }
}
