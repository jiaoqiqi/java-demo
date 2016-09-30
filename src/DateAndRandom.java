import java.util.Date;
import java.util.Random;

public class DateAndRandom {
    public void testDate(){
        Date date = new Date(10000);
        System.out.println(date.toString());

        date.setTime(100000);
        System.out.println(date.toString());

        date.setTime(1000000);
        System.out.println(date.toString());

        date.setTime(10000000);
        System.out.println(date.toString());
        date.setTime(100000000);
        System.out.println(date.toString());
        date.setTime(100000000);
        System.out.println(date.toString());
        date.setTime(1000000000);
        System.out.println(date.toString());

    }

    public void testRandom(){
        Random random = new Random(1000);
        for(int i =0;i<50;i++){
            System.out.print(random.nextInt(100)+ " ");
        }
    }

    public static void main(String[] args) {
        DateAndRandom demo = new DateAndRandom();
//        demo.testDate();
        demo.testRandom();
    }
}
