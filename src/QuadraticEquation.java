import java.util.Scanner;
public class QuadraticEquation {
    private int a,b,c;
    Scanner input = new Scanner(System.in);

    public void setABC(){
        System.out.print("Please input a , b and c :");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }

    public double getDiscriminant(int a, int b, int c){
        double p=b*b-4*a*c;
        return p;
    }
    public double getRoot1(int a ,int b , double p){
        double r1 = (-b+p)/(2*a);
        return r1;
    }
    public double getRoot2(int a ,int b , double p){
        double r2 = (-b-p)/(2*a);
        return r2;
    }

    public static void main(String []args){
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setABC();
        int A = quadraticEquation.getA();
        int B = quadraticEquation.getB();
        int C = quadraticEquation.getC();
        double q = quadraticEquation.getDiscriminant(A,B,C);
        if(q > 0 ){
            double r1 = quadraticEquation.getRoot1(A,B,q);
            double r2 = quadraticEquation.getRoot2(A,B,q);
            System.out.println("The roots is " + String.format("%.2f",r1) + " and " + String.format("%.2f",r2) );
        }else if(q == 0){
            double r = quadraticEquation.getRoot1(A,B,q);
            System.out.println("The root is " + String.format("%.2f",r));
        }else{
            System.out.println("The equation has no roots.");
        }

    }
}
