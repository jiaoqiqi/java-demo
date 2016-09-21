import java.util.*;

public class compareArrays {
    public  boolean equal(int[] list1, int[] list2) {
        Arrays.sort(list1);
        Arrays.sort(list2);
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String []args){

        compareArrays compare = new compareArrays();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int listLength = input.nextInt();
        int [] array = new int[listLength];
        for(int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int listLength2 = input.nextInt();
        int [] array2 = new int[listLength2];
        for(int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();

        }

        if(compare.equal(array,array2)){
            System.out.println("两数组相同");
        }
        else{
            System.out.println("两数组不同");
        }
    }

}
