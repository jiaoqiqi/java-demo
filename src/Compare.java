import java.util.Date;

class Compare {
    public  Object max(Comparable[] arr) {
        Object max=arr[0];
        for(Object o:arr){
            if (((Comparable)o).compareTo(max)>=0) {
                max=o;
            }
        }
        return max;
    }
}
class FindMix {

    public static void main(String[] args) {
        Compare a=new Compare();
        System.out.println(a.max(new String[]{"a","ab","abc","abcd"}));
        System.out.println(a.max(new Date[]{new Date(),new Date(33L),new Date(2339L)}));
        System.out.println(a.max(new Integer[]{1,2,3,4,5,6,7,8,9}));

    }

}
