//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ScoreSearch{
//    public static void main(String []args){
//        Scanner input = new Scanner(System.in);
//        Map<String,String> hashMap = new HashMap<String,String>();
//
//        String name ;
//        String tel ;
//
//
//        name = input.next();
//        while(!input.next().equals("noname")){
//            tel = input.next();
//            hashMap.put(name,tel);
//            name = input.next();
//        }
//
//        String find = input.next();
//        String result = hashMap.get(find);
//        if(result != null){
//            System.out.println(hashMap.get(find));
//        }
//        else{
//            System.out.println("Not found");
//        }
//
//    }
//}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreSearch{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Map<String,Integer> hashMap = new HashMap<String,Integer>();

        String name ;
        int tel ;


        name = input.next();
        while(!name.equals("noname")){
            tel = input.nextInt();
            hashMap.put(name,tel);
            name = input.next();
        }
        String find = input.next();
        Boolean result = hashMap.containsKey(find);
        if(result ){
            System.out.println(hashMap.get(find)*0.21);
        }
        else{
            System.out.println("Not found.");
        }

    }
}


