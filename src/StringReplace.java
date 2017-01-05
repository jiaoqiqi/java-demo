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


