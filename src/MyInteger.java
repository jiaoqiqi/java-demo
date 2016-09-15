public class MyInteger {
    int value ;

    int setMyInteger(int value){
       return value;
    }

    void getMyInteger(int value)
    {
        this.value = value;
    }

    int isEven(int value){

        if(value % 2 == 0){
            return 1;
        }
        return 0;
    }

    int isOdd(int value){
        if (value%2 == 1)
            return 1;
        return 0;
    }

    int isPrime(int value){
        for(int i=2 ; i<value/2 ; i++){
            if(value%i == 0){
                return 0;
            }break;
        }
        return 1;
    }
}
