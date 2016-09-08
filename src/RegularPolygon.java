
class RegularPolygon{
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;

    RegularPolygon(){
        n=3;
        side=1;
        x=0;

        y=0;
    }
    RegularPolygon(int newN,int newS){
        n=newN;
        side=newS;
        x=0;
        y=0;
    }
    RegularPolygon(int newN,int newS,double newX,double newY){
        n=newN;
        side=newS;
        x=newX;
        y=newY;
    }
    public void setN(int newN){n=newN;}
    public void setSide(double newS){side=newS;}
    public void setY(double newY){ y=newY; }
    public void setX(double newX){ y=newX; }
    public int getN(){ return n; }
    public double getSide(){ return side; }
    public double getX(){ return x; }
    public double getY(){ return y; }
    public double getPerimeter(){ return n*side; }
    public double getArea(){ return (n*side*side)/(4*Math.tan(getPerimeter()/n)); }

    public static void main(String[] args){
        RegularPolygon r1=new RegularPolygon();
        System.out.println(r1);
        System.out.println("对象一周长："+r1.getPerimeter()+" 面积："+r1.getArea());
        RegularPolygon r2=new RegularPolygon(6,4);
        System.out.println("对象二周长："+r2.getPerimeter()+" 面积："+r2.getArea());
        RegularPolygon r3=new RegularPolygon(10,4,5.6,7.8);
        System.out.println("对象三周长："+r3.getPerimeter()+" 面积："+r3.getArea());
}
}
