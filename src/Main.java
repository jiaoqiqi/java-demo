import java.text.DecimalFormat;
import java.util.Scanner;

//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//interface IShape {
//    public abstract double getArea();
//
//    public abstract double getPerimeter();
//}
//
//class RTriangle  implements IShape {
//    private double a = 0;
//    private double b = 0;
//    public RTriangle(double a,double b){
//        this.a = a;
//        this.b = b;
//    }
//    public double getArea(){
//        return a*b/2;
//    }
//    public double getPerimeter(){
//        double c = Math.sqrt(a*a+b*b);
//        return a+b+c;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        DecimalFormat d = new DecimalFormat("#.####");
//        Scanner input = new Scanner(System.in);
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        IShape r = new RTriangle(a, b);
//        System.out.println(d.format(r.getArea()));
//        System.out.println(d.format(r.getPerimeter()));
//        input.close();
//    }
//}
abstract class shape1 {// 抽象类


    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.####");// 保留4位小数
        int n=input.nextInt();
        double side = input.nextDouble();

        shape1 rp = new  RegularPolygon(n,side);

        System.out.println(d.format(rp.getArea()));
        System.out.println(d.format(rp.getPerimeter()));
        input.close();
    }
}

// Area=n×a×a/(tan((180度/n))×4   S=nx²/[4tan(π/n)]
class RegularPolygon extends shape1{
    private int n;
    private double a;
    RegularPolygon(int n,double a){
        this.n = n;
        this.a = a;
    }

    public double getPerimeter(){
        return n*a;
    }
    public double getArea(){
        return n*a*a/(Math.tan(Math.toRadians(180/n))*4);
    }

}


//你提交的代码将被嵌入到这里

//import java.util.Scanner;
//import java.text.DecimalFormat;
//
//interface IShape {
//    double getArea();
//
//    double getPerimeter();
//}
//

//创建一个正六边形类实现接口IShape
//public class Main {
//    public static void main(String[] args) {
//        DecimalFormat d = new DecimalFormat("#.####");
//        Scanner input = new Scanner(System.in);
//        double a = input.nextDouble();
//        IShape r = new RHexagon (a);
//        System.out.println(d.format(r.getArea()));
//        System.out.println(d.format(r.getPerimeter()));
//        input.close();
//    }
//}
//class RHexagon implements IShape {
//    private double length;
//
//    public RHexagon(double length) {
//        this.length = length;
//    }
//
//    public double getPerimeter() {
//        return length * 6;
//    }
//
//    public double getArea() {
//        return 6 * length * length / (4 * Math.tan(Math.PI / 6));
//    }
//}