import java.math.*;
public class Decimal {
    public static void main(String[] args){
        double s=1;
        double a=1;
        for(int i=100;i<1001;i+=100){
            for(int j=1;j<=i;j++){
                a=a*j;
                s=s+1/a;
            }
            BigDecimal b=new BigDecimal(s);
            System.out.println(i+" " +"e="+b);
        }
    }
}
