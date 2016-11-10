import java.math.BigInteger;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BigInteger b1 = new BigInteger(input.next());
        int b2 = input.nextInt();
        for (;b2>0;b1 = b1.add(BigInteger.ONE)){
            if (b1.isProbablePrime(100)) {
                System.out.println(b1);
                --b2;
            }
        }
    }

}
