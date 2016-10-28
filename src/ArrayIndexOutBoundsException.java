import java.util.Scanner;
public class Demon5 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean inputIndex= true;
        int[]shuzu=new int[100];

        //随机生成数字存入数组
        for (int i=0;i<100;i++){
            shuzu[i] = new java.util.Random().nextInt(100);
        }

        do{
            try {
                System.out.println("Please in put the index of the shuzu[0-100]:");
                int index = input.nextInt();
                System.out.println(shuzu[index]);
                inputIndex= false;//输出之后退出

            } catch (ArrayIndexOutOfBoundsException ex) {

                System.out.println("out of bounds!");
                System.out.println("Please input again,index must be inputed from (0-100)");
            }
        }
        while (inputIndex);

    }
}



