import java.util.Scanner;

public class ScoreSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names;
        int[] scores;
        scores = new int[100];
        names = new String[100];
        int i = 0;


        for(int j = 0; j < 100; j ++) {
            names[i] = input.next();


            if (names[i].equals("noname")) {
                break;
            }
            scores[i] = input.nextInt();
            i++;
        }


        String findName = input.next();
        int s;
        for (s = 0; s < i; s++) {
            if (names[s].equals(findName)) {
                System.out.println(scores[s]);
                break;
            }
        }
        if(s == i) {
            System.out.println("Not found");
        }
    }

}
