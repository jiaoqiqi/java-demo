import java.text.DecimalFormat;
import java.util.Scanner;

//先算出周长的一半s=1/2(a+b+c)
//        则该三角形面积S=根号[s(s-a)(s-b)(s-c)]

public class TriangleArea{
    public static void main(String []args){
        DecimalFormat Format = new DecimalFormat("#.000");
//        Format.setMaximumFractionDigits(3);
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("It can not be created a triangle.");
        }
        else{
            double m = (a+b+c)/2;
            double s = Math.sqrt(m*(m-a) * (m-b) * (m-c) );
            System.out.print("The area is: " + Format.format(s) + "." );
        }
    }
}