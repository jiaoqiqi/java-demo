
//public class Test29_1  implements Runnable{
//    public static void main(String []args){
//        new Test29_1();
//    }
//    public Test29_1{
//        Test29_1 task = new Test29_1();
//        new Thread(task).start();
//    }
//    public void run(){
//        System.out.println("test");
//    }
//}


public class Test29_1 implements Runnable{
           public static void main(String []args){
               new Test29_1();
           }
           public Test29_1(){
               Thread t= new Thread(this);
               t.start();
               t.start();
           }
           public void run(){
               System.out.println("test");
           }
}

