import java.util.HashSet;
import java.util.Set;

/**
 * Created by monster on 16-12-7.
 */
public class HashSetTry {
    public static void main(String []args){
        Set<String> set1 = new HashSet<String>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Mechael");

        Set<String> set2 = new HashSet<String>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        Set<String> set3 = new HashSet<String>();
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println("并集 "+set3);


        Set<String> set4 = new HashSet<String>();
        set4.addAll(set1);
        Set<String> set5 = new HashSet<String>();
        set5.addAll(set2);
        set5.removeAll(set4);
        System.out.println("差集 " +set5 );

        set2.retainAll(set1);
        System.out.println("交集 "+ set2);



    }
}
