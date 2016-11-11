

//输出从b1开始的b2个素数BigInteger
//public class Test{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        BigInteger b1 = new BigInteger(input.next());
//        int b2 = input.nextInt();
//        for (;b2>0;b1 = b1.add(BigInteger.ONE)){
//            if (b1.isProbablePrime(100)) {
//                System.out.println(b1);
//                --b2;
//            }
//        }
//    }
//
//}


//输出从1970年算的秒数转化的日期的字符串
//public class Test{
//    public static void main(String []args){
//        Date date = new Date();
//        System.out.println(date.getTime());
//        System.out.println(date.toString());
//    }
//}

import java.math.BigInteger;
import java.util.*;
//四则运算器BigInteger
public class Test{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String[] splited;
        if((str.indexOf('/') != -1)){
            splited = str.split("/");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.divide(second);
            System.out.println(result);
        }
        else if((str.indexOf('+') != -1)){
            splited = str.split("[+]");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.add(second);
            System.out.println(result);
        }
        else if((str.indexOf('-') != -1)) {
            splited = str.split("-");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.subtract(second);
            System.out.println(result);
        }
        else if((str.indexOf('*') != -1)){
            splited = str.split("[*]");
            String a = splited[0];
            String b = splited[1];
            BigInteger first = new BigInteger(a);
            BigInteger second = new BigInteger(b);
            BigInteger result = first.multiply(second);
            System.out.println(result);
        }
    }
}

