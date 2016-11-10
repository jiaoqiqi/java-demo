import java.util.Scanner;
public class ArrayIndexOutBoundsException {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean inputIndex= true;
        int[]array=new int[100];

        for (int i=0;i<100;i++){
            array[i] = new java.util.Random().nextInt(100);
        }

        do{
            try {
                System.out.println("Please in put the index of the array[0-100]:");
                int index = input.nextInt();
                System.out.println(array[index]);
                inputIndex= false;

            } catch (ArrayIndexOutOfBoundsException ex) {

                System.out.println("out of bounds!");
                System.out.println("Please input again,index must be input from (0-100)");
            }
        }
        while (inputIndex);

    }
}


//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.util.Random;
//
//public class ArrayIndexOutBoundsException {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        BufferedReader br=null;
//        try {
//            int[] a=new int[100];
//            Random r=new Random();
//            for(int i =0;i<a.length;i++){
//                a[i]=r.nextInt(100);
//            }
//            br=new BufferedReader(new InputStreamReader(System.in));
//            int index=0;
//            String s=null;
//            while(true){
//                System.out.println("提示用户输入数组的下标:");
//                s=br.readLine();
//                index=Integer.parseInt(s);
//                if(index>=100){
//                    System.out.println("下标越界，请重新输入: ");
//                    s=br.readLine();
//                    index=Integer.parseInt(s);
//                }
//                System.out.println("此下标对应的值为： "+a[index]);
//            }
//        } catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }finally{
//            if(br!=null)
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//        }
//    }
//
//}


