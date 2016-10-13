import java.math.BigDecimal;
public class Decimal {
    public static BigDecimal factorial(long n){
        BigDecimal result = BigDecimal.ONE;
        for(int i=1 ; i<=n ; i++){
            result = result.multiply(new BigDecimal(i + ""));
        }
        return result;
    }
    public static void main(String []args){
        BigDecimal one = new BigDecimal("1");
        long n = 100;
        BigDecimal e = new BigDecimal("0");
        for(int i=0 ; i<n ; i++){
            BigDecimal result = factorial(n);
            BigDecimal c = one.divide(result,25,BigDecimal.ROUND_CEILING);
            e=e.add(c);
        }
        System.out.println(e);
    }
}
