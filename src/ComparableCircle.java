//import java.math.*;
//public class ComparableCircle extends CircleExtends implements Comparable {
//    public  ComparableCircle(double radius){
//        super(radius);
//    }
//
//    public int compareTo(Object o){
//        if(getArea() > ((ComparableCircle)o).getArea()){
//            return 1;
//        }
//        else if(getArea() < ((ComparableCircle)o).getArea()){
//            return -1;
//        }
//        else{
//            return 0;
//        }
//    }
//
//    public static void main(String []args){
//        ComparableCircle circle1 = new ComparableCircle(2);
//        ComparableCircle circle2 = new ComparableCircle(3);
//        System.out.println(Max.max(circle1,circle2));
//    }
//}


public class ComparableCircle extends Circle implements Comparable{

    final double PI=3.1415926;
    double radius;

    ComparableCircle(){

    }
    ComparableCircle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
    public int compareTo(Object arg0) {
        return 0;
    }
    public double getPrimeter() {
        return 0;
    }

}
abstract class Circle{

    public abstract double getArea();

    public abstract double getPrimeter();

    public int compareTo(Circle bCircle) {
        return 0;
    }

}


