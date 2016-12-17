import java.util.*;

public class CompareRadiusCircle {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个圆形的半径");
        Circle circle1 = new Circle(in.nextDouble());
        System.out.println("请输入第二个圆形的半径");
        Circle circle2 = new Circle(in.nextDouble());
        System.out.println(circle1.equals(circle2));
    }
}


class Circle extends shape implements Comparable{
    double radius =0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public boolean equals(Object o){
        if(radius == ((Circle) o).radius ){
            return true;
        }
        return false;
    }
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        if(getArea()>( (Circle) o).getArea()){
            return 1;
        }
        return 0;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
}


