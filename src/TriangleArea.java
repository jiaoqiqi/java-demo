import java.util.Scanner;

class  Trangle {

    Scanner input = new Scanner(System.in);
    float x1 = input.nextFloat();
    float y1 = input.nextFloat();
    float x2 = input.nextFloat();
    float y2 = input.nextFloat();
    float x3 = input.nextFloat();
    float y3 = input.nextFloat();

    double x = Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
    double y = Math.sqrt((y3-y1)*(y3-y1) + (x3-x1)*(x3-x1));
    double z = Math.sqrt((y3-y2)*(y3-y2) + (x3-x2)*(x3-x2));


    public boolean check() {
        if (x+y>z&&x-y<z)
            return true;
        else
            return false;
    }

    public void Area() {
        double p;
        double s;
        p=(x+y+z)/2;
        s=Math.sqrt(p*(p-x)*(p-y)*(p-z));

        System.out.println("The area of the trangle is " +String.format("%.1f", s));
    }

}

public class TriangleArea {
    public static void main(String[] args) {
        System.out.print("Enter three points for a triangle");

        Trangle trangle=new Trangle();
        if (trangle.check() == true) {

            trangle.Area();
        } else {
            System.out.println("wrong input");
        }

    }
}  