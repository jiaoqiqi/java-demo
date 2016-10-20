public class GeometriObject{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1,1);
        triangle.setColor("yellow");
        triangle.setA(true);
        System.out.println(triangle.toString());
        System.out.println("面积是：" + triangle.getArea());
        System.out.println("周长是：" + triangle.getPerimeter());
        System.out.println("颜色是：" + triangle.getColor());
        System.out.println("是否填充：" + triangle.a);

    }

}

class Triangle extends GeometricObject{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    Triangle(double side1,double side2,double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }

    double getSide3() {
        return side3;
    }

    double getArea() {
        double q = (side1 + side2 + side3) / 2;
        return Math.sqrt(q * (q - side1) * (q - side2) * (q - side3));
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
    }
}

class GeometricObject {
    String color;
    boolean a;

    String setColor(String color) {
        return this.color = color;
    }

    boolean setA(boolean a) {
        return this.a = a;
    }

    String getColor() {
        return color;
    }
}

