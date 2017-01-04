//import java.util.Scanner;
//
//public class ScoreSearch {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] names;
//        int[] scores;
//        scores = new int[100];
//        names = new String[100];
//        int i = 0;
//
//
//        for(int j = 0; j < 100; j ++) {
//            names[i] = input.next();
//
//
//            if (names[i].equals("noname")) {
//                break;
//            }
//            scores[i] = input.nextInt();
//            i++;
//        }
//
//
//        String findName = input.next();
//        int s;
//        for (s = 0; s < i; s++) {
//            if (names[s].equals(findName)) {
//                System.out.println(scores[s]*0.21);
//                break;
//            }
//        }
//        if(s == i) {
//            System.out.println("Not found");
//        }
//    }
//
//}

//

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreSearch{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Map<String,String> hashMap = new HashMap<String,String>();

        String name ;
        String tel ;


        name = input.next();
        while(!name.equals("noname")){
            tel = input.next();
            hashMap.put(name,tel);
            name = input.next();
        }

        String find = input.next();
        String result = hashMap.get(find);
        if(result != null){
            System.out.println(hashMap.get(find));
        }
        else{
            System.out.println("Not found.");
        }

    }
}
