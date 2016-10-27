public class TestComparableCircle {


    public static void main(String[] args) {

        Circle aCircle=new ComparableCircle(2);
        Circle bCircle=new ComparableCircle(3);

        System.out.println("area1 is: "+aCircle.getArea());
        System.out.println("area2 is:"+bCircle.getArea());
        if(equalArea(aCircle, bCircle)==0.0){
            System.out.println(" circle1 and circle2 equal");
        }
        else if(equalArea(aCircle, bCircle)==1.0){
            System.out.println(" circle1 > circle2");
        }
        else{
            System.out.println(" circle1 < circle2");
        }

    }
    public static double equalArea(Circle aCircle,Circle bCircle){
        return (double)(aCircle.compareTo(bCircle));
    }

}