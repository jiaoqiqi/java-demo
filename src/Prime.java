import java.math.BigInteger;
import java.util.Scanner;

//public class Prime {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String m;
//        int n;
//        m=input.next();
//        n=input.nextInt();
//        int count = 0;
//
//        BigInteger big = new BigInteger(m);
//        while (count < n) {
//            big = big.nextProbablePrime();
//            System.out.println(big);
//            count++;
//        }
//    }
//}

public class Prime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String m;
        int n;
        m = input.next();
        n = input.nextInt();
        int count = 0;

        BigInteger big = new BigInteger(m);
        while (count < n) {
            if (big.isProbablePrime(100)) {
                System.out.println(big);
                count++;
            }
            big = big.nextProbablePrime();

        }
    }
}