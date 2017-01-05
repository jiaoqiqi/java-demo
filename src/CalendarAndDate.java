import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
public class CalendarAndDate {
    public static void main(String []args){

        SimpleDateFormat d = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");

        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month + "月"+day+"日" );


        calendar.setTimeInMillis(1234567898765L);
        long  time = calendar.getTimeInMillis();
        System.out.println(d.format(time));
    }
}

//请编程从键盘输入一个长整型的值，该值表示从1970年1月1日算起的一个特定时间（毫秒数），
// 以此时间构造一个日期对象。再输入一个普通整型值，该值表示天数，加上该天数后，然后输出对应的年、月、日。
//import java.util.GregorianCalendar;
//import java.util.Scanner;
//import java.util.Calendar;
//
//public class CalendarAndDate {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        long time = input.nextLong();
////        int day = input.nextInt();
//
//        GregorianCalendar calendar = new GregorianCalendar();
//        calendar.setTimeInMillis(time);
//        System.out.println(calendar.get(Calendar.YEAR));
////        Date date = new Date(time);
//

//
//        System.out.println(date.toString());
//        date.setTime(time+((long)day)*24*60*60*1000);
//        System.out.println(date.toString());
//    }
//}