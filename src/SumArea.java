import java.util.Scanner;

public class SumArea {
    public static double sumArea(GeometricObject[] a){
        double sum=0;
        for(int i = 0;i<a.length;i++){
            sum+=a[i].getArea();
        }
        return sum;
    }
    public static void main(String[] args){
        GeometricObject[] arr = new GeometricObject[4];
        Scanner in = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            if(i<2){
                arr[i] = new Circle(in.nextDouble());
            }
            else{
                arr[i] = new Rectangle(in.nextDouble(),in.nextDouble());
            }
        }
        System.out.println(sumArea(arr));
    }

}

class Rectangle extends GeometricObject{
    private double width=0,height=0;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
}
