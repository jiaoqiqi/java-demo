import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, common;
        while (input.hasNext()) {
            a = input.next();
            b = input.next();
            common = commonPrefix(a, b);
            if (common == "")
                System.out.println("No common prefix");
            else
                System.out.println("The common prefix is " + common);
        }
    }

    public static String commonPrefix(String a, String b) {
        String c = "";
        int i = 0;
        while (i < a.length() && i < b.length()) {
            if (a.charAt(i) == b.charAt(i)) {
                c = c + a.charAt(i);
                i++;
            } else
                break;
        }
        return c;
    }
}
