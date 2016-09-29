import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
public class Calendar {
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

