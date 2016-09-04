import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String []args){
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        System.out.print("What is" + number1 + "+" + number2 + "?");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if(number1+number2 == answer)
        {
            System.out.println("You are correct！");
        }
        else{
            System.out.println("Your answer is wrong ");
        }

    }
}
