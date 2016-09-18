public class MyInteger{

    int value;

    public MyInteger(int n){
        this.value=n;
    }

    int getValue() {
        return value;
    }

    boolean isEven(int value) {
        return value % 2 == 0;
    }

    boolean isEven() {
        return this.value % 2 == 0;
    }

    boolean isEven(MyInteger  myInteger){
        return myInteger.getValue() % 2 == 0;
    }

    boolean isOdd(int value) {
        return value % 2 == 1;
    }

    boolean isOdd() {
        return this.value % 2 == 1;
    }

    boolean isOdd(MyInteger  myInteger){
        return myInteger.getValue() % 2 == 1;
    }

    boolean isPrime(){
        for(int i=2;i<=(int)Math.sqrt(this.value);i++){
            if(this.value%i==0){
                return false;
            }
        }
        return true;
    }
    boolean isPrime(int value){
        for(int i=2;i<=(int)Math.sqrt(value);i++){
            if(value%i==0){
                return false;
            }
        }
        return true;
    }

    boolean isPrime(MyInteger  myInteger){
        for(int i = 2; i<=(int)Math.sqrt(myInteger.getValue()); i++){
            if(myInteger.getValue()%i==0){
                return false;
            }
        }
        return true;
    }

    boolean equals(int i) {
        return this.value == i;
    }

    boolean equals(MyInteger  integer) {
        return this.value == integer.getValue();
    }


    int parseInt(char[] c) {
        return Integer.valueOf(new String(c));
    }
    int parseInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String []args){

        MyInteger mInt=new MyInteger(3);
        MyInteger nInt=new MyInteger(4);
        int num=4;
        char[] c={1,2,3};
        String s="12345";

        System.out.println("mInt.getValue()="+mInt.getValue());
        System.out.println("nInt.getValue()="+nInt.getValue());

        if(mInt.isEven())
            System.out.println("mInt.value是偶数！");

        if(mInt.isOdd())
            System.out.println("mInt.value是奇数！");

        if(mInt.isPrime())
            System.out.println("mInt.value是素数！");


        if(mInt.isEven(num))
            System.out.println(num+"是偶数！");

        if(mInt.isOdd(num))
            System.out.println(num+"是奇数！");

        if(mInt.isPrime(num))
            System.out.println(num+"是素数！");

        if(mInt.equals(num))
            System.out.println(mInt.value+"="+num);
        else
            System.out.println(mInt.value+"!="+num);

        if(nInt.equals(num))
            System.out.println(nInt.value+"="+num);
        else
            System.out.println(nInt.value+"!="+num);

        if(mInt.equals(nInt))
            System.out.println(mInt.value+"="+nInt.value);
        else
            System.out.println(mInt.value+"!="+nInt.value);

        char[] array = {'1','2','3'};
        System.out.println(mInt.parseInt("132"));
        System.out.println(mInt.parseInt(array));
    }
}