import java.util.*;
public class PreFix {

     public static String  prefix(String s1,String s2){
        String a1[] = s1.split("");
        String a2[] = s2.split("");
        int len1 = a1.length;
        int len2 = a2.length;
        int len;
         String result = "";
        if(len1>len2){
            len = len2;
        }else{ len = len1; }
         for(int i=0 ; i<len ;i++){
            if(!a1[i].equals(a2[i])){
                break;
            }else{
                result+= a1[i];
            }
         }
         return (result);
    }

    public static void main(String args[]){
        PreFix newPrefix = new PreFix();
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();
        String a = newPrefix.prefix(s1,s2);
        System.out.print(a);

    }
}
