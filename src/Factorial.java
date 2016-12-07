/**
 * Created by monster on 16-11-25.
 */
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        BigInteger big = new BigInteger(input.next());
        BigInteger result = new BigInteger("1");
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        while (!big.equals(zero)){
            result = result.multiply(big);
            big = big.subtract(one);
        }
        System.out.println(result);
    }
}
