import java.util.ArrayList;
import java.util.List;
//22-4
/**
 * Created by monster on 16-12-7.
 */
public class ArrayAndLinklist {
    public static void main(String []args){
        List<String> list1 = new ArrayList<String>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Mechael");


        List<String> list2 = new ArrayList<String>();
        list2.add("George");
        list2.add("Katie");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");

        List<String> list3 = new ArrayList<String>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("并集 "+list3);


        List<String> list4 = new ArrayList<String>();
        list4.addAll(list1);
        List<String> list5 = new ArrayList<String>();
        list5.addAll(list2);
        list5.removeAll(list4);
        System.out.println("差集 " +list5 );

        list2.retainAll(list1);
        System.out.println("交集 "+ list2);

    }
}
