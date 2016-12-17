import java.text.DecimalFormat;
import java.util.Scanner;

interface IShape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

class RTriangle  implements IShape {
    private double a = 0;
    private double b = 0;
    public RTriangle(double a,double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a*b/2;
    }
    public double getPerimeter(){
        double c = Math.sqrt(a*a+b*b);
        return a+b+c;
    }
}


public class Main {
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }
}