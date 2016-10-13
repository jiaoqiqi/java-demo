import java.math.BigInteger;
public class DivideFive {
    public static void main(String []args){
        long a = Long.MAX_VALUE;
        String sc = Long.toString(a);
        BigInteger big = new BigInteger(sc);
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");

        int i =0;
        while(i<10){
            if( big.remainder(five).equals(zero) || big.remainder(six).equals(zero)){
                System.out.println(big);
                i++;
            }
            big = big.add(one);
        }
    }
}
