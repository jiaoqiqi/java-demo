//import  java.util.*;
// public class StringReplace {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
////        String []files;
////        files = new String[200];
////
////        for(int i=0;i<200;i++){
////            files[i] = input.next();
////            if(files[i].equals("end")){
////                break;
////            }
////        }
////        String a = input.next();
////        String b = input.next();
////        for(int i=0 ; i<files.length ; i++){
////            if(files[i].equals(a)){
////                files[i] = b;
////            }
////        }
////        for(int i=0 ;i<files.length ; i++){
////            System.out.print(files[i]);
////        }
////
//         String files = "";
//         String in;
//         String a;
//         String b;
//         while (input.hasNext()) {
//             in = input.next();
//             if (!in.equals("end")){
//                 files+=in+" ";
//             }
//             else{
//                 break;
//             }
//             a = input.next();
//             b = input.next();
//             System.out.print(files.replaceAll(a, b));
//         }
//     }
// }
import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        String Text = "";
        String in;
        String a;
        String b;
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            in = input.next();
            if (in.equals("end"))
                break;
            else
                Text += in + " ";
        }
        a = input.next();
        b = input.next();
        System.out.println(Text.replace(a, b));
    }
}


