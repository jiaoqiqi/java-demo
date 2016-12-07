import java.util.*;

public class LinklistSort {
    public static  void main(String []args){
        Scanner input = new Scanner(System.in);
        List<Integer> list = Arrays.asList(1,3,2,5,6);
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
