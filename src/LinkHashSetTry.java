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

//

//import java.io.File;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.TreeSet;
//
//public class LinkHashSetTry {
//    public static void main(String[] args) {
//        if (args.length != 1) {
////            System.out.println();
//            System.exit(0);
//        }
//
//        String filename = args[0];
//
//        TreeSet<String> treeSet = new TreeSet<String>();
//
//        try {
//            Scanner in = new Scanner(new File(filename));
//
//            String line;
//
//            while ((line = in.nextLine()) != null) {
//                String[] tokens = line.split("[ |\n|\t|\r|.|,|)|(|-|\"]");
//
//                for (int i = 0; i < tokens.length; i++)
//                    treeSet.add(tokens[i]);
//            }
//        } catch (Exception ex) {
//            System.err.println(ex);
//        }
//        Iterator iterator = treeSet.iterator();
//        System.out.println("\nDisplay words in ascending order ");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//}
//
