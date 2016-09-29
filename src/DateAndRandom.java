import java.util.Date;

public class UseDate {
    public void testDate() {
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

        date.setTime(1000000000);
        System.out.println(date.toString());

        date.setTime(1000000000);
        System.out.println(date.toString());

        date.setTime(1000000000);
        System.out.println(date.toString());

    }

    public static void main(String[] args) {
        UseDate demo = new UseDate();
        demo.testDate();
    }
}
