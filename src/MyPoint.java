public class MyPoint {
    double x=0;
    double y=0;
    public MyPoint(){

    }

    public MyPoint(double x,double y) {
        this.x=x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double y) {

        this.y = y;
    }
    public double distance(MyPoint I,MyPoint B){

        return Math.sqrt((I.x-B.x)*(I.x-B.x)+(I.y-B.y)*(I.y-B.y));
    }

    public static void main(String []args){

        MyPoint first = new MyPoint();

        MyPoint second = new MyPoint(6,8);
        second.setX(6);
        second.setY(8);
        second.getX();
        second.getY();

        MyPoint pointDis=new MyPoint();
        double pointDistance=pointDis.distance(first,second);
        System.out.println("距离为");
        System.out.println(pointDistance);

    }

}