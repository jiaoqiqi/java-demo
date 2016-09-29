//import  java.util.regex.Pattern;
public class NumberOrABC {
    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isLetterOrDigit(str.charAt(i))){
//                Character.isLetterOrDigit( char ch )
                return false;
            }
        }
        return true;
    }
// 正则判断数字
//    public static boolean isNumeric(String str){
//        Pattern pattern = Pattern.compile("[0-9]*");
//        return pattern.matcher(str).matches();
//    }

    public static void main(String []args){
        String a = "abc";
        System.out.println(a+" "+isNumeric(a));

        String s1 = "Welcome to Java";
        String s2 = s1.replace("o","abc");
        System.out.println(s1);
        System.out.println(s2);
    }
}
