//从下列的抽象类shape类扩展出一个正五边形（regular pentagon）类RPentagon,
// 这个类将正五边形的边长作为私有成员，类中包含初始化这个值的构造方法。

//public abstract class shape {// 抽象类

/// 抽象方法 求面积 / public abstract double getArea();

/// 抽象方法 求周长 / public abstract double getPerimeter(); }

//请编程从键盘输入正五边形的边长值，创建一个正五边形对象，
// 然后输出正五边形的面积和正五边形的周长。
// 计算正五边形的面积公式为： S=5a^2/(4tan(36度))其中a为边长。
// 或者：S=(1/4)a^2√(25+10√5) 输出结果保留4位小数。


import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaExtends {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RPentagon rPentagon = new RPentagon(input.nextDouble());
        DecimalFormat Format = new DecimalFormat();
        Format.setMaximumFractionDigits(4);
        System.out.println(Format.format(rPentagon.getArea()));
        System.out.println(Format.format(rPentagon.getPerimeter()));
    }
}

class RPentagon extends shape{

    private double side;

    public RPentagon(double side) {
        this.side = side;
    }
    public double getArea() {
        return (0.25)*Math.pow(side,2)*Math.sqrt(25+10*Math.sqrt(5));
    }

    public double getPerimeter() {
        return 5*side;
    }

}

//abstract class shape {// 抽象类
//
//    public abstract double getArea();
//
//    public abstract double getPerimeter();
//}
