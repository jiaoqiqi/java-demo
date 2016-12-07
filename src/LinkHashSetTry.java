import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//22-2
/**
 * Created by monster on 16-12-7.
 */
public class LinkHashSetTry {
    public static void main(String []args){
        Set<String>  set= new LinkedHashSet<String>();
        set.add("x");
        set.add("a");
        set.add("b");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        TreeSet<String> treeSet = new TreeSet<String>(set);
        System.out.println(treeSet);

    }
}
