public class Circle2D {
    double x = 0, y = 0, radius = 1;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    Circle2D(){
    }

    Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public boolean contains(double x,double y){
        double d = Math.sqrt(x*x + x*y);
        return d<radius?true:false;
    }
    public boolean contains(Circle2D circle){
        return this.radius>circle.radius&&this.getArea()>circle.getArea()?true:false;
    }
    public boolean overlaps(Circle2D circle){
        return this.radius+circle.radius<2*this.radius ? true : false;
    }

    public static void main(String []args){
        Circle2D c1 = new Circle2D();
        c1.getArea();
        c1.getPerimeter();
        c1.contains(3,3);

        Circle2D c2 = new Circle2D(4,5,10.5);
        c1.contains(c2);
        Circle2D c3 = new Circle2D(3,5,2.3);
        c1.contains(c3);


        System.out.println("面积为： " + c1.getArea());
        System.out.println("周长： " + c1.getPerimeter());
        System.out.println("点在圆内吗： " + c1.contains(3,3));
        System.out.println("c2在圆内吗： " + c1.contains(c2));
        System.out.println("c3与c1重叠吗吗： " + c1.overlaps(c3));

    }
}
