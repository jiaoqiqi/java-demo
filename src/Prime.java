import java.math.BigInteger;

public class Prime {

    public static void main(String[] args) {
//        int count=0;
//        BigInteger  bi2;
//        long x = Long.MAX_VALUE;
//        String sc = Long.toString(x);
//        BigInteger bi = new BigInteger(sc);
//        while(count<5) {
//            bi2 = bi.nextProbablePrime();    //要想严格证明是素数，那就从0循环到bi/2验证下
//            System.out.println( bi );
//            count++;
//        }

        int count = 0;
        long x = Long.MAX_VALUE;
        String sc = Long.toString(x);
        BigInteger big = new BigInteger(sc);
        while (count < 5) {
            big = big.nextProbablePrime();    //要想严格证明是素数，那就从0循环到bi/2验证下
            System.out.println(big);
            count++;
        }
    }
}
